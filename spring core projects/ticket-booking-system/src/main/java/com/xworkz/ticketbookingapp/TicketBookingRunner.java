package com.xworkz.ticketbookingapp;

import com.xworkz.ticketbookingapp.config.TicketBookingConfiguration;
import com.xworkz.ticketbookingapp.dto.TicketBookingDTO;
import com.xworkz.ticketbookingapp.service.TicketBookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TicketBookingRunner {

    public static void main(String[] args) {

        TicketBookingDTO ticketBookingDTO = new TicketBookingDTO("Rashmi",21,"Female","Bengaluru","Ballari",250.00);
        TicketBookingDTO ticketBookingDTO1 = new TicketBookingDTO("Chandu",23,"Male","Bengaluru","Ballari",350.00);
        TicketBookingDTO ticketBookingDTO2 = new TicketBookingDTO("Inchara",22,"Female","Bengaluru","Shivmogga",280.00);
        TicketBookingDTO ticketBookingDTO3 = new TicketBookingDTO("Anjali",21,"Female","Ballari","Bengaluru",250.00);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TicketBookingConfiguration.class);

        TicketBookingService ticketBookingService = applicationContext.getBean(TicketBookingService.class);

        //ticketBookingService.validateAndSave(ticketBookingDTO);
        //ticketBookingService.validateAndSave(ticketBookingDTO1);
       // ticketBookingService.validateAndSave(ticketBookingDTO2);
        ticketBookingService.validateAndSave(ticketBookingDTO3);
    }
}
