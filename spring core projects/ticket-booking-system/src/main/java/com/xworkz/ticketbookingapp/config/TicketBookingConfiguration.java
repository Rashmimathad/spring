package com.xworkz.ticketbookingapp.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.ticketbookingapp")
public class TicketBookingConfiguration {

    public TicketBookingConfiguration(){
        System.out.println("TicketBookingConfiguration created");
    }
}
