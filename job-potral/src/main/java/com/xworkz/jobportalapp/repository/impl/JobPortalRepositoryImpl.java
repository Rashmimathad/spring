package com.xworkz.jobportalapp.repository.impl;

import com.xworkz.jobportalapp.dto.UserDTO;
import com.xworkz.jobportalapp.repository.JobPortalRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class JobPortalRepositoryImpl implements JobPortalRepository {


    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean save(UserDTO userDTO) {
        boolean isSaved= false;
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDTO.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(userDTO);
        transaction.commit();
        isSaved=true;
        return isSaved;
    }
}
