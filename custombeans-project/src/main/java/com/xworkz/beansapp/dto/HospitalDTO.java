package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class HospitalDTO {

    private int hospitalId;
    private String name;
    private String location;
    private int numberOfBeds;
    private int numberOfDoctors;
    private boolean emergencyAvailable;
    private String hospitalType;
    private double rating;

}
