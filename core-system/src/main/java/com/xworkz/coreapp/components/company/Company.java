package com.xworkz.coreapp.components.company;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Company {

    @Value("1")
    private int companyId;
    @Value("TCS")
    private String companyName;
}
