package com.xworkz.redcross.repository.impl;


import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.entity.DonorAccountEntity;
import com.xworkz.redcross.repository.RedCrossRepository;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public class RedCrossRepositoryImpl implements RedCrossRepository {

    @Autowired
    private EntityManagerFactory factory;


    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    @SneakyThrows
    public boolean save(DonorAccountEntity donorAccountEntity) {


        boolean isSaved=false;
//        Configuration configuration =new Configuration();
//        configuration.configure();
//        configuration.addAnnotatedClass(DonorAccountDTO.class);
//        SessionFactory sessionFactory= configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(donorAccountDTO);
//        transaction.commit();
//        isSaved=true;

        try {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(donorAccountEntity);
            isSaved=true;
            entityManager.getTransaction().commit();
            factory.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSaved;
    }

    @Override
    @SneakyThrows
    public boolean duplicateCheck(String email) {

        boolean isDuplicateEntry=false;
        //String duplicateCheckQuery = "select 1 from donor_table where email=? and is_deleted=0;";

//        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
//        PreparedStatement preparedStatement = connection.prepareStatement(duplicateCheckQuery)){
//            preparedStatement.setString(1,email);
//
//           ResultSet set = preparedStatement.executeQuery();
//           if (set.next()){
//               isDuplicateEntry=true;
//           }
//        }

        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("getDuplicateEntry");
            List<DonorAccountEntity> donorAccountEntity = query.setParameter("email",email).getResultList();
            if (donorAccountEntity.iterator().hasNext())
                isDuplicateEntry=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDuplicateEntry;
    }

    @Override
    @SneakyThrows
    public Optional<DonorAccountEntity> getDonorInfoByEmail(String email) {

//        String searchByEmailQuery = "select * from donor_table where email=? and is_deleted=0;";
//
//        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
//        PreparedStatement preparedStatement = connection.prepareStatement(searchByEmailQuery) ){
//
//            preparedStatement.setString(1,email);
//
//           ResultSet resultSet = preparedStatement.executeQuery();
//           if (resultSet.next()){
//               int id = resultSet.getInt(1);
//               String emailId = resultSet.getString(2);
//               int dobYear = resultSet.getInt(3);
//               String dobMonth = resultSet.getString(4);
//               int dobDay = resultSet.getInt(5);
//               String firstName = resultSet.getString(6);
//               String lastName = resultSet.getString(7);
//               String zip = resultSet.getString(8);
//               String userName = resultSet.getString(9);
//               String password = resultSet.getString(10);
//               String confirmPassword = resultSet.getString(11);
//
//               DonorAccountDTO donorAccountDTO = new DonorAccountDTO(id,emailId,dobYear,dobMonth,dobDay,firstName,lastName,zip,userName,password,confirmPassword);
//               System.out.println(donorAccountDTO);
//
//               return Optional.of(donorAccountDTO);
//           }else throw new DataInvalidException("Email does not exists!!");
        try{
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("getDonorInfoByEmail");
            DonorAccountEntity donorAccountEntity = (DonorAccountEntity) query.setParameter("emailId",email).getSingleResult();
            if (donorAccountEntity!=null)
                return Optional.of(donorAccountEntity);
        }catch (Exception e){
            e.printStackTrace();
        }
       return Optional.empty();
    }

    @Override
    @SneakyThrows
    public Optional<DonorAccountEntity> getDonorInfoById(int id) {
//        String getDonorInfoByEmail = "select * from donor_table where id=? and is_deleted=0;";
//
//        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
//        PreparedStatement preparedStatement = connection.prepareStatement(getDonorInfoByEmail)){
//
//            preparedStatement.setInt(1,id);
//           ResultSet resultSet = preparedStatement.executeQuery();
//
//           if (resultSet.next()){
//               int donorId = resultSet.getInt(1);
//               String emailId = resultSet.getString(2);
//               int dobYear = resultSet.getInt(3);
//               String dobMonth = resultSet.getString(4);
//               int dobDay = resultSet.getInt(5);
//               String firstName = resultSet.getString(6);
//               String lastName = resultSet.getString(7);
//               String zip = resultSet.getString(8);
//               String userName = resultSet.getString(9);
//               String password = resultSet.getString(10);
//               String confirmPassword = resultSet.getString(11);
//
//               DonorAccountDTO donorAccountDTO = new DonorAccountDTO(donorId,emailId,dobYear,dobMonth,dobDay,firstName,lastName,zip,userName,password,confirmPassword);
//               System.out.println(donorAccountDTO);
//
//               return Optional.of(donorAccountDTO);
//           }else throw new DataInvalidException("ID does not exists!!");
//           }

//        SessionFactory sessionFactory = new Configuration().configure()
//                .addAnnotatedClass(DonorAccountDTO.class).buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        DonorAccountDTO donorAccountDTO = session.get(DonorAccountDTO.class,id);
//        transaction.commit();

        try{
            EntityManager entityManager = factory.createEntityManager();
            DonorAccountEntity donorAccountEntity = entityManager.find(DonorAccountEntity.class,id);
            if (donorAccountEntity!=null)
                return Optional.of(donorAccountEntity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    @SneakyThrows
    public boolean update(DonorAccountEntity donorAccountEntity) {
        //String updateQuery = "update donor_table set email=?,dob_year=?,dob_month=?,dob_day=?,first_name=?,last_name=?,zip=?,user_name=?,password=?,confirm_password=? where id=? and is_deleted=0;";
        boolean isUpdated = false;

//        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
//            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)){
//
//            preparedStatement.setString(1,donorAccountDTO.getEmail());
//            preparedStatement.setInt(2,donorAccountDTO.getDobYear());
//            preparedStatement.setString(3,donorAccountDTO.getDobMonth());
//            preparedStatement.setInt(4,donorAccountDTO.getDobDay());
//            preparedStatement.setString(5,donorAccountDTO.getFirstName());
//            preparedStatement.setString(6,donorAccountDTO.getLastName());
//            preparedStatement.setString(7,donorAccountDTO.getZip());
//            preparedStatement.setString(8,donorAccountDTO.getUserName());
//            preparedStatement.setString(9,donorAccountDTO.getPassword());
//            preparedStatement.setString(10,donorAccountDTO.getConfirmPassword());
//            preparedStatement.setInt(11,donorAccountDTO.getId());
//            int rowsAffected =preparedStatement.executeUpdate();
//
//            if (rowsAffected>0){
//                System.out.println(donorAccountDTO);
//                isUpdated =true;
//            }else System.err.println("Donor Not Updated");
//        }

//        SessionFactory sessionFactory = new Configuration().configure()
//                .addAnnotatedClass(DonorAccountDTO.class).buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.update(donorAccountDTO);
//        transaction.commit();
//        isUpdated=true;

        try{

            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("update");
            int rowsAffected = query.setParameter("email",donorAccountEntity.getEmail())
                    .setParameter("dobYear",donorAccountEntity.getDobYear())
                    .setParameter("dobMonth",donorAccountEntity.getDobMonth())
                    .setParameter("dobDay",donorAccountEntity.getDobDay())
                    .setParameter("fName",donorAccountEntity.getFirstName())
                    .setParameter("lName",donorAccountEntity.getLastName())
                    .setParameter("zCode",donorAccountEntity.getZip())
                    .setParameter("uName",donorAccountEntity.getUserName())
                    .setParameter("pwd",donorAccountEntity.getPassword())
                    .setParameter("cPwd",donorAccountEntity.getConfirmPassword())
                    .setParameter("dId",donorAccountEntity.getId())
                    .executeUpdate();
            if (rowsAffected>0) isUpdated=true;
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    @SneakyThrows
    public boolean delete(int id) {
        boolean isDeleted = false;
//
//        SessionFactory sessionFactory = new Configuration().configure()
//                .addAnnotatedClass(DonorAccountDTO.class).buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        DonorAccountDTO donorAccountDTO = session.get(DonorAccountDTO.class, id);
//        if (donorAccountDTO != null){
//            session.delete(donorAccountDTO);
//        transaction.commit();
//        isDeleted = true;
//    }

        try{
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("delete");
            int rowsAffected = query.setParameter("id",id).executeUpdate();
            if (rowsAffected>0) isDeleted=true;
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}
