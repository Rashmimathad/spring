package com.xworkz.beansapp.dto;

import lombok.Data;

@Data
public class BankDTO {

    private int bankId;
    private String name;
    private String branch;
    private String ifscCode;
    private String location;
    private int employeesCount;
    private boolean atmAvailable;
    private int establishedYear;


}
