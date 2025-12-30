package com.xworkz.jobportalapp.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.jobportalapp")
public class JobPortalConfig {

    public JobPortalConfig(){
        System.out.println("JobPortalConfig created");
    }
}
