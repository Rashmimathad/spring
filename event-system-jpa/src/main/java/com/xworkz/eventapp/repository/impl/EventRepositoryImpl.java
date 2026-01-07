package com.xworkz.eventapp.repository.impl;

import com.xworkz.eventapp.entity.EventEntity;
import com.xworkz.eventapp.repository.EventRepository;
import com.xworkz.eventapp.util.EntityManagerFactoryImpl;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EventRepositoryImpl implements EventRepository {

   EntityManagerFactory entityManagerFactory = EntityManagerFactoryImpl.getEventManagerFactory();

    @Override
    public boolean save(EventEntity eventEntity) {
    boolean isSaved=false;
    try {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(eventEntity);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        isSaved = true;
    } catch (HibernateException e) {
        System.out.println("exception");
        e.printStackTrace();
    }
        return isSaved;
    }

    @Override
    public Optional<EventEntity> getEventInfoByName(String eName) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query =  entityManager.createQuery("select eventInfo from EventEntity eventInfo where eventInfo.eventName=:name");
            query.setParameter("name",eName);
            EventEntity eventEntity = (EventEntity) query.getSingleResult();
            return Optional.of(eventEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }

            return Optional.empty();
    }

    @Override
    public Optional<EventEntity> getEventInfoById(int eId) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();

          EventEntity eventEntity =  entityManager.find(EventEntity.class,eId);

          return Optional.of(eventEntity);

        }catch (HibernateException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<EventEntity> getEventInfoByLocation(String eventLoc) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query =  entityManager.createQuery("select eventInfo from EventEntity eventInfo where eventInfo.eventLocation=:loc");
            query.setParameter("loc",eventLoc);
            EventEntity eventEntity = (EventEntity) query.getSingleResult();
            return Optional.of(eventEntity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public Optional<EventEntity> getEventInfoByTimings(String timings) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query =  entityManager.createQuery("select eventInfo from EventEntity eventInfo where eventInfo.eventTimings=:eventTimings");
            query.setParameter("eventTimings",timings);
            EventEntity eventEntity = (EventEntity) query.getSingleResult();
            return Optional.of(eventEntity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public Optional<EventEntity> getEventInfoByManagerName(String managerName) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query =  entityManager.createQuery("select eventInfo from EventEntity eventInfo where eventInfo.eventManagerName=:eventManager");
            query.setParameter("eventManager",managerName);
            EventEntity eventEntity = (EventEntity) query.getSingleResult();
            return Optional.of(eventEntity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public boolean updateTimingsById(int id, String updatedTimings) {
        boolean isUpdated = false;
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
          EventEntity eventEntity = entityManager.find(EventEntity.class,id);
          if (eventEntity!=null){
              eventEntity.setEventTimings(updatedTimings);
              entityManager.merge(eventEntity);
              isUpdated=true;
          }else System.err.println("Update failed");

          entityManager.getTransaction().commit();
          entityManagerFactory.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public boolean deleteById(int id1) {
        boolean isDeleted = false;
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();
            EventEntity eventEntity = entityManager.find(EventEntity.class,id1);
            if (eventEntity!=null){
                entityManager.remove(eventEntity);
                isDeleted=true;
            }else System.err.println("Delete Failed");
            entityManager.getTransaction().commit();
            entityManagerFactory.close();

        }catch (HibernateException e){
            e.printStackTrace();
        }

        return isDeleted;
    }

    @Override
    public List<EventEntity> getEventsInfoByLocation(String loc) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery("select entities from EventEntity entities where entities.eventLocation=:location");
            query.setParameter("location",loc);
            List<EventEntity> eventEntities = query.getResultList();

            return eventEntities;
        }catch (Exception e){
            e.printStackTrace();
        }


        return Collections.emptyList();
    }

    @Override
    public Object[] getEventsInfoByEventName(String eventName1) {
        Object[] eventsInfo=null;
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query =  entityManager.createQuery("select eventInfo.eventLocation,eventInfo.eventManagerName from EventEntity eventInfo where eventInfo.eventName=:eName");
            query.setParameter("eName",eventName1);
            eventsInfo = (Object[]) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eventsInfo;
    }

    @Override
    public List<String> getAllManagersName() {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery("select event.eventManagerName from EventEntity event");
            List<String> managersList = query.getResultList();
            return managersList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public String getEventNameByManagerName(String managerName1) {
        String eventName = null;
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery("select event.eventName from EventEntity event where event.eventManagerName=:managerName");
          query.setParameter("managerName",managerName1);

           eventName = (String) query.getSingleResult();

        }catch (Exception e){
            e.printStackTrace();
        }
        return eventName;
    }

    @Override
    public List<EventEntity> getAllEvents() {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery("select events from EventEntity events");
            List<EventEntity> eventEntities = query.getResultList();
            return eventEntities;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public String getEventLocationByTimings(String timings1) {
        String location = null;
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery("select event.eventLocation from EventEntity event where event.eventTimings=:timings");
            query.setParameter("timings",timings1);

            location = (String) query.getSingleResult();

        }catch (Exception e){
            e.printStackTrace();
        }
        return location;
    }


}
