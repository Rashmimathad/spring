package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode

public class UserDTO {

    private int userId;
    private String userName;
    private String userProfession;
    private int userAge;
    private String userGender;
    private String userEmail;
    private Long mobileNo;
    private String userAddress;

}
