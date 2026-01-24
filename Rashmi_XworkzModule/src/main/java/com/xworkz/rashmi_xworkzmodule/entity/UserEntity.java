package com.xworkz.rashmi_xworkzmodule.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_table")
@NamedQueries({

        @NamedQuery(name = "checkUserExists",query = "select user.password from UserEntity user where user.userEmail=:email"),
        @NamedQuery(name = "updateCount",query = "update UserEntity user set user.count = user.count+1   where user.userEmail=:eMail"),
        @NamedQuery(name = "getCount",query = "select user.count from UserEntity user where user.userEmail=:eMail"),
        @NamedQuery(name = "setCountToZero",query = "update UserEntity user set user.count=0 where user.userEmail=:eMail"),
        @NamedQuery(name = "checkUserExistsByEmail",query="select 1 from UserEntity user where user.userEmail=:email"),
        @NamedQuery(name = "checkUserExistsByPhone",query = "select 1 from UserEntity user where user.phoneNumber=:phNo"),
        @NamedQuery(name = "saveOtpByEmail",query = "update UserEntity user set user.otp=:otp , user.otpSentTime=:time where user.userEmail=:email"),
        @NamedQuery(name = "getOTPByEmail",query = "select user.otp from UserEntity user where user.userEmail=:email"),
        @NamedQuery(name = "updatePassword",query = "update UserEntity user set user.password=:nPwd where user.userEmail=:email"),
        @NamedQuery(name = "getOTPSentTime",query = "select user.otpSentTime from UserEntity user where user.userEmail=:email")
})
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "password")
    private String password;
    @Column(name = "count")
    public int count;
    @Column(name = "otp")
    private int otp;
    @Column(name = "otp_sent_time")
    private LocalDateTime otpSentTime;
}
