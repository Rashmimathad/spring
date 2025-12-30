package com.xworkz.redcross.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "donor_table")
public class DonorAccountDTO {

    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "email")
    private String email;
    @Column(name = "dob_year")
    private int dobYear;
    @Column(name = "dob_month")
    private String dobMonth;
    @Column(name = "dob_day")
    private int dobDay;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "zip")
    private String zip;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;
}
