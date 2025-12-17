package com.xworkz.patientapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PatientDTO {

    private int id;
    private String patientName;
    private int age;
    private String gender;
    private long phoneNo;

    public PatientDTO(String patientName, int age, String gender, long phoneNo) {
        this.patientName=patientName;
        this.age=age;
        this.gender=gender;
        this.phoneNo=phoneNo;
    }
}
