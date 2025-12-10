package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class MedicalStoreDTO {


    private int storeId;
    private String storeName;
    private String location;
    private String licenseNumber;
    private boolean open24Hours;
    private String ownerName;
    private int numberOfEmployees;
    private double rating;


}
