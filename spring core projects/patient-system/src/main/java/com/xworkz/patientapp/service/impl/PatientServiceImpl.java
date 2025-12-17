package com.xworkz.patientapp.service.impl;

import com.xworkz.patientapp.dto.PatientDTO;
import com.xworkz.patientapp.repository.PatientRepository;
import com.xworkz.patientapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public boolean validateAndSave(PatientDTO patientDTO) {

        boolean isValidated=false;

        if (patientDTO.getPatientName()==null||patientDTO.getPatientName().isEmpty()){
            System.err.println("Invalid Name");
        } else if (patientDTO.getAge()<=0) {
            System.err.println("Invalid Age");
        } else if (patientDTO.getGender()==null||patientDTO.getGender().isEmpty()) {
            System.err.println("Invalid Gender");
        } else if (patientDTO.getPhoneNo()<=0) {
            System.err.println("Invalid Phone Number");
        } else {
            isValidated=true;
        }
        if (isValidated){
            System.out.println("Patient Data Validated");
            boolean isSaved = patientRepository.save(patientDTO);
            if (isSaved)
                System.out.println("Patient Data Saved Successfully!!!");
            else System.err.println("Patient Data not saved successfully");
        }else System.err.println("Patient Data not Validated");

        return isValidated;
    }
}
