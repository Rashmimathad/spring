package com.xworkz.patientapp.config;

import com.xworkz.patientapp.dto.PatientDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.xworkz.patientapp")
@Configuration
public class PatientConfiguration {

    public PatientConfiguration(){
        System.out.println("Patient configuration created");
    }

}
