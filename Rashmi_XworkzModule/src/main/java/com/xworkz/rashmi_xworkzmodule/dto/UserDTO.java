package com.xworkz.rashmi_xworkzmodule.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private int userId;
    private String userName;
    private String userEmail;
    private String phoneNumber;
    private int age;
    private String gender;
    private String address;
    private String password;
    private String confirmPassword;
}
