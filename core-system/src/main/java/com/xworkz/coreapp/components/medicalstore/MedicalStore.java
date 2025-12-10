package com.xworkz.coreapp.components.medicalstore;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component


public class MedicalStore {

    @Value("1")
    private int medicalStoreId;
    @Value("Ballari Medicals")
    private String medicalStoreName;

}
