package com.xworkz.redcross.dto;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@ToString
@EqualsAndHashCode
public class DonorAccountDTO {
    private  int id;
    private String email;
    private int dobYear;
    private String dobMonth;
    private int dobDay;
    private String firstName;
    private String lastName;
    private String zip;
    private String userName;
    private String password;
    private String confirmPassword;
}
