package com.xworkz.redcross.repository.impl;


import com.xworkz.redcross.constants.DBConstants;
import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.exceptions.DataInvalidException;
import com.xworkz.redcross.repository.RedCrossRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Optional;

@Repository
public class RedCrossRepositoryImpl implements RedCrossRepository {

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    @SneakyThrows
    public boolean save(DonorAccountDTO donorAccountDTO) {
        String insertQuery = "insert into donor_table(email,dob_year,dob_month,dob_day,first_name,last_name,zip,user_name,password,confirm_password) values(?,?,?,?,?,?,?,?,?,?);";
        boolean isSaved = false;

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){

             preparedStatement.setString(1,donorAccountDTO.getEmail());
             preparedStatement.setInt(2,donorAccountDTO.getDobYear());
             preparedStatement.setString(3,donorAccountDTO.getDobMonth());
             preparedStatement.setInt(4,donorAccountDTO.getDobDay());
             preparedStatement.setString(5,donorAccountDTO.getFirstName());
             preparedStatement.setString(6,donorAccountDTO.getLastName());
             preparedStatement.setString(7,donorAccountDTO.getZip());
             preparedStatement.setString(8,donorAccountDTO.getUserName());
             preparedStatement.setString(9,donorAccountDTO.getPassword());
             preparedStatement.setString(10,donorAccountDTO.getConfirmPassword());

             int rowsAffected =preparedStatement.executeUpdate();

             if (rowsAffected>0){
                 System.out.println(donorAccountDTO);
                 isSaved=true;
             }else System.err.println("Donor Not Saved");
        }

        return isSaved;
    }

    @Override
    @SneakyThrows
    public boolean duplicateCheck(String email) {

        boolean isDuplicateEntry=false;
        String duplicateCheckQuery = "select 1 from donor_table where email=? and is_deleted=0;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(duplicateCheckQuery)){
            preparedStatement.setString(1,email);

           ResultSet set = preparedStatement.executeQuery();
           if (set.next()){
               isDuplicateEntry=true;
           }
        }
        return isDuplicateEntry;
    }

    @Override
    @SneakyThrows
    public Optional<DonorAccountDTO> getDonorInfo(String email) {

        String searchByEmailQuery = "select * from donor_table where email=? and is_deleted=0;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(searchByEmailQuery) ){

            preparedStatement.setString(1,email);

           ResultSet resultSet = preparedStatement.executeQuery();
           if (resultSet.next()){
               int id = resultSet.getInt(1);
               String emailId = resultSet.getString(2);
               int dobYear = resultSet.getInt(3);
               String dobMonth = resultSet.getString(4);
               int dobDay = resultSet.getInt(5);
               String firstName = resultSet.getString(6);
               String lastName = resultSet.getString(7);
               String zip = resultSet.getString(8);
               String userName = resultSet.getString(9);
               String password = resultSet.getString(10);
               String confirmPassword = resultSet.getString(11);

               DonorAccountDTO donorAccountDTO = new DonorAccountDTO(id,emailId,dobYear,dobMonth,dobDay,firstName,lastName,zip,userName,password,confirmPassword);
               System.out.println(donorAccountDTO);

               return Optional.of(donorAccountDTO);
           }else throw new DataInvalidException("Email does not exists!!");
        }
    }

    @Override
    @SneakyThrows
    public Optional<DonorAccountDTO> getDonorInfoById(int id) {
        String getDonorInfo = "select * from donor_table where id=? and is_deleted=0;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(getDonorInfo)){

            preparedStatement.setInt(1,id);
           ResultSet resultSet = preparedStatement.executeQuery();

           if (resultSet.next()){
               int donorId = resultSet.getInt(1);
               String emailId = resultSet.getString(2);
               int dobYear = resultSet.getInt(3);
               String dobMonth = resultSet.getString(4);
               int dobDay = resultSet.getInt(5);
               String firstName = resultSet.getString(6);
               String lastName = resultSet.getString(7);
               String zip = resultSet.getString(8);
               String userName = resultSet.getString(9);
               String password = resultSet.getString(10);
               String confirmPassword = resultSet.getString(11);

               DonorAccountDTO donorAccountDTO = new DonorAccountDTO(donorId,emailId,dobYear,dobMonth,dobDay,firstName,lastName,zip,userName,password,confirmPassword);
               System.out.println(donorAccountDTO);

               return Optional.of(donorAccountDTO);
           }else throw new DataInvalidException("ID does not exists!!");
           }
    }

    @Override
    @SneakyThrows
    public boolean update(DonorAccountDTO donorAccountDTO) {
        String updateQuery = "update donor_table set email=?,dob_year=?,dob_month=?,dob_day=?,first_name=?,last_name=?,zip=?,user_name=?,password=?,confirm_password=? where id=? and is_deleted=0;";
        boolean isUpdated = false;

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)){

            preparedStatement.setString(1,donorAccountDTO.getEmail());
            preparedStatement.setInt(2,donorAccountDTO.getDobYear());
            preparedStatement.setString(3,donorAccountDTO.getDobMonth());
            preparedStatement.setInt(4,donorAccountDTO.getDobDay());
            preparedStatement.setString(5,donorAccountDTO.getFirstName());
            preparedStatement.setString(6,donorAccountDTO.getLastName());
            preparedStatement.setString(7,donorAccountDTO.getZip());
            preparedStatement.setString(8,donorAccountDTO.getUserName());
            preparedStatement.setString(9,donorAccountDTO.getPassword());
            preparedStatement.setString(10,donorAccountDTO.getConfirmPassword());
            preparedStatement.setInt(11,donorAccountDTO.getId());
            int rowsAffected =preparedStatement.executeUpdate();

            if (rowsAffected>0){
                System.out.println(donorAccountDTO);
                isUpdated =true;
            }else System.err.println("Donor Not Updated");
        }

        return isUpdated;
    }

    @Override
    @SneakyThrows
    public boolean delete(int id) {
        boolean isDeleted=false;
        String deleteQuery = "update donor_table set is_deleted=1 where id=?;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)){

            preparedStatement.setInt(1,id);

          int rowsAffected = preparedStatement.executeUpdate();

          if (rowsAffected>0){
              isDeleted=true;
          }
        }
        return isDeleted;
    }
}
