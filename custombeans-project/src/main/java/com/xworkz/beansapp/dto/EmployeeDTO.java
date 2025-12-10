package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class EmployeeDTO {

    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private String employeeDepartment;
    private String designation;
    private double salary;
    private String employeeEmail;
    private String joinDate;
}
