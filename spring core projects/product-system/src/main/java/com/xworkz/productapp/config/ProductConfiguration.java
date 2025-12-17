package com.xworkz.productapp.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.productapp")
public class ProductConfiguration {


    public ProductConfiguration(){
        System.out.println("ProductConfiguration created");
    }
}
