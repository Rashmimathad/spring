package com.xworkz.redcross.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "donor_table")
@NamedQueries({
        @NamedQuery(name = "getDuplicateEntry",query = "select 1 from DonorAccountEntity entry where entry.email=:email"),
        @NamedQuery(name = "getDonorInfoByEmail",query = "select entry from DonorAccountEntity entry where entry.email=:emailId"),
        @NamedQuery(name = "update",query = "update DonorAccountEntity entry set entry.email=:email,entry.dobYear=:dobYear,entry.dobMonth=:dobMonth,entry.dobDay=:dobDay,entry.firstName=:fName,entry.lastName=:lName,entry.zip=:zCode,entry.userName=:uName,entry.password=:pwd,entry.confirmPassword=:cPwd where entry.id=:dId"),
        @NamedQuery(name = "delete",query = "delete  DonorAccountEntity entry where entry.id=:id")
})
public class DonorAccountEntity {
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
