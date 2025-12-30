package com.xworkz.eventapp.repository.impl;

import com.xworkz.eventapp.dto.EventDTO;
import com.xworkz.eventapp.entity.EventEntity;
import com.xworkz.eventapp.repository.EventRepository;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

public class EventRepositoryImpl implements EventRepository {
    @Override
    public boolean save(EventEntity entity) {

        SessionFactory sessionFactory = new Configuration()
                                                .configure()
                                                .addAnnotatedClass(EventEntity.class)
                                                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        return true;
    }

    @Override
    @SneakyThrows
    public Optional<EventEntity> getEventInfoById(int id) {

        try(SessionFactory sessionFactory = new Configuration().
            configure().addAnnotatedClass(EventEntity.class).buildSessionFactory();
        Session session = sessionFactory.openSession();){
           EventEntity eventEntity = session.get(EventEntity.class,id);
            return Optional.of(eventEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(int i) {

        try(SessionFactory sessionFactory = new Configuration().
                configure().addAnnotatedClass(EventEntity.class).buildSessionFactory();
            Session session = sessionFactory.openSession();){
            Transaction transaction = session.beginTransaction();
            EventEntity eventEntity = session.get(EventEntity.class,i);

            session.delete(eventEntity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
