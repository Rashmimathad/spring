package com.xworkz.dependencyinjection.conf;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.dependencyinjection")
public class ComponentConfiguration {

    public ComponentConfiguration(){
        System.out.println("Component configuration created");
    }
}
