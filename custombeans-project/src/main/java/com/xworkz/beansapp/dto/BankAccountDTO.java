package com.xworkz.beansapp.dto;

import lombok.Data;

@Data
public class BankAccountDTO {

    private int accountId;
    private int userId;
    private String userName;
    private String accountType;
    private double accountBalance;
    private String createdDate;
    private String accountStatus;
    private String branchName;

}
