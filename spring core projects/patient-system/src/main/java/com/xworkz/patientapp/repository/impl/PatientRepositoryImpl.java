package com.xworkz.patientapp.repository.impl;

import com.xworkz.patientapp.constants.DBConstants;
import com.xworkz.patientapp.dto.PatientDTO;
import com.xworkz.patientapp.repository.PatientRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Component
public class PatientRepositoryImpl implements PatientRepository {


    @Override
    @SneakyThrows
    public boolean save(PatientDTO patientDTO) {
        boolean isSaved=false;
        String insertQuery = "insert into patient_table(patient_name,patient_age,patient_gender,patient_phone_number) values (?,?,?,?);";
        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);){

            preparedStatement.setString(1,patientDTO.getPatientName());
            preparedStatement.setInt(2,patientDTO.getAge());
            preparedStatement.setString(3,patientDTO.getGender());
            preparedStatement.setLong(4,patientDTO.getPhoneNo());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected>0) {
                isSaved =true;
                System.out.println("Rows Affected : " + rowsAffected);
            }
        }
        return isSaved;
    }
}
