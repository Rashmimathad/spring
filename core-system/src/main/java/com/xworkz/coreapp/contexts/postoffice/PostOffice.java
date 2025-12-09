package com.xworkz.coreapp.contexts.postoffice;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component


public class PostOffice {

    private int postOfficeId;
    private String postOfficeName;

}
