package com.xworkz.coreapp.contexts.medicalstore;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component


public class MedicalStore {

    private int medicalStoreId;
    private String medicalStoreName;

}
