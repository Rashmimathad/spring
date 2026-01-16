package com.xworkz.rashmi_xworkzmodule.repository.impl;

import com.xworkz.rashmi_xworkzmodule.entity.UserEntity;
import com.xworkz.rashmi_xworkzmodule.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Repository
public class XworkzRepositoryImpl implements XworkzRepository {

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(UserEntity userEntity) {
        boolean isSaved =false;
        try{

           EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(userEntity);
            entityManager.getTransaction().commit();
            isSaved=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSaved;
    }

    @Override
    public String checkUser(String email) {
        String password="";

        try{

            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("checkUserExists");
            query.setParameter("email",email);
            password = (String) query.getSingleResult();
            return password;
        } catch (NoResultException e) {
         e.printStackTrace();
         return null;
        }
    }
}
