package com.xworkz.coreapp.components.mobile;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Mobile {

    @Value("1")
    private int mobileId;
    @Value("Samsung")
    private String mobileBrandName;
}
