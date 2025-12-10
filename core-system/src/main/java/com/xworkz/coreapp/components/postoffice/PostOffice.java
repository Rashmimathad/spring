package com.xworkz.coreapp.components.postoffice;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component


public class PostOffice {

    @Value("1")
    private int postOfficeId;
    @Value("Bengaluru Post Office")
    private String postOfficeName;

}
