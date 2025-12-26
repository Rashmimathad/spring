package com.xworkz.redcross.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@AllArgsConstructor
public enum DBConstants {
    DB("jdbc:mysql://localhost:3306/redcrossdatabase","root","Root@1102");

    private String url;
    private String userName;
    private String password;



    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
