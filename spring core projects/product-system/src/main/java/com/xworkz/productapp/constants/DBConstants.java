package com.xworkz.productapp.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum DBConstants {

    DB("jdbc:mysql://localhost:3306/springdatabase","root","Root@1102");

    private String url;
    private String userName;
    private String password;

}
