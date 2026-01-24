package com.xworkz.rashmi_xworkzmodule.repository.impl;

import com.xworkz.rashmi_xworkzmodule.entity.UserEntity;
import com.xworkz.rashmi_xworkzmodule.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;


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
            entityManager.close();
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
            entityManager.close();

        } catch (NoResultException e) {
         e.printStackTrace();
        }
        return password;
    }



    @Override
    public void updateCount(String email) {
        try{
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateCount");
            query.setParameter("eMail",email);
             int rowsAffected = query.executeUpdate();
            System.out.println(rowsAffected);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getCount(String email) {
        int count = 0;
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("getCount");
            count = (int) query.setParameter("eMail", email).getSingleResult();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public void setCountToZero(String email) {
        try{
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("setCountToZero");
            query.setParameter("eMail",email);
            int rowsAffected = query.executeUpdate();
            System.out.println(rowsAffected);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkUserExistsByEmail(String userEmail) {
        boolean isUserExists = false;
try {
    EntityManager entityManager = factory.createEntityManager();
    entityManager.getTransaction().begin();
    Query query = entityManager.createNamedQuery("checkUserExistsByEmail");
    int count = (int) query.setParameter("email", userEmail).getSingleResult();
    if (count > 0) {
        isUserExists = true;
    }
entityManager.close();
} catch (Exception e) {
    e.printStackTrace();
}
        return isUserExists;
    }

    @Override
    public boolean checkUserExistsByPhone(String phoneNumber) {
        boolean isUserExists = false;
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("checkUserExistsByPhone");
            int count = (int) query.setParameter("phNo", phoneNumber).getSingleResult();
            if (count > 0) {
                isUserExists = true;
            }
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        } return isUserExists;
    }

    @Override
    public boolean saveOtp(String email, int randomOtp, LocalDateTime otpSentTime) {
        boolean isOtpSaved=false;
        try {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("saveOtpByEmail");
            int count =  query.setParameter("email", email).setParameter("otp",randomOtp).setParameter("time",otpSentTime).executeUpdate();
            if (count > 0) {
                isOtpSaved = true;
            }
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOtpSaved;
    }

    @Override
    public int getOtp(String email) {
        int otpFromDb =0;
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("getOTPByEmail");
            otpFromDb =  (int)query.setParameter("email", email).getSingleResult();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return otpFromDb;
    }

    @Override
    public boolean updatePassword(String email, String newPassword) {
        boolean isPwdUpdated =false;
        try {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updatePassword");
            int count =  query.setParameter("email", email).setParameter("nPwd",newPassword).executeUpdate();
            if (count > 0) {
                isPwdUpdated = true;
            }
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isPwdUpdated;
    }

    @Override
    public LocalDateTime getOTPSentTime(String email) {

        try {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("getOTPSentTime");
            LocalDateTime otpSentTime = (LocalDateTime) query.setParameter("email",email).getSingleResult();
            entityManager.getTransaction().commit();
            entityManager.close();
            return otpSentTime;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LocalDateTime.now();
    }


}
