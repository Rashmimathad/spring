package com.xworkz.patientapp;

import com.xworkz.patientapp.config.PatientConfiguration;
import com.xworkz.patientapp.dto.PatientDTO;
import com.xworkz.patientapp.service.PatientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PatientRunner {
    public static void main(String[] args) {

        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setPatientName("Rashmi");
        patientDTO.setAge(21);
        patientDTO.setGender("Female");
        patientDTO.setPhoneNo(9019184800L);

        PatientDTO patientDTO1 = new PatientDTO("Inchara",22,"Female",8431101915L);
        PatientDTO patientDTO2 = new PatientDTO("Chandrashekar",23,"Male",9741117623L);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PatientConfiguration.class);

        PatientService patientService = applicationContext.getBean(PatientService.class);
//        patientService.validateAndSave(patientDTO);
//        patientService.validateAndSave(patientDTO1);
        patientService.validateAndSave(patientDTO2);
    }
}
