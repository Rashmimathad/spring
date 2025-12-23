package com.xworkz.restuarantapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.restuarantapp")
public class RestaurantConfiguration {

    public RestaurantConfiguration(){
        System.out.println("RestaurantConfiguration object created");
    }
}
