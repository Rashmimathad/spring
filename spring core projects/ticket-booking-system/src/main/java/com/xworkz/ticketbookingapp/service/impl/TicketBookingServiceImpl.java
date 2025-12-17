package com.xworkz.ticketbookingapp.service.impl;

import com.xworkz.ticketbookingapp.dto.TicketBookingDTO;
import com.xworkz.ticketbookingapp.repository.TicketBookingRepository;
import com.xworkz.ticketbookingapp.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TicketBookingServiceImpl implements TicketBookingService {

    @Autowired
    private TicketBookingRepository ticketBookingRepository;

    @Override
    public boolean validateAndSave(TicketBookingDTO ticketBookingDTO) {

        boolean isValidated = false;

        if (ticketBookingDTO.getUserName()==null||ticketBookingDTO.getUserName().isEmpty()||ticketBookingDTO.getUserName().length()<3){
            System.err.println("Invalid User Name");
        } else if (ticketBookingDTO.getUserAge()<=0) {
            System.err.println("Invalid Age");
        } else if (ticketBookingDTO.getUserGender()==null||ticketBookingDTO.getUserGender().isEmpty()) {
            System.err.println("Invalid Gender");
        } else if (ticketBookingDTO.getSource()==null||ticketBookingDTO.getSource().isEmpty()) {
            System.err.println("Invalid Source");
        } else if (ticketBookingDTO.getDestination()==null||ticketBookingDTO.getDestination().isEmpty()) {
            System.err.println("Invalid Destination");
        }else if (ticketBookingDTO.getTicketPrice()<=0.0){
            System.err.println("Invalid ticket price");
        }else isValidated = true;

        if (isValidated){
            System.out.println("Booking Data Validated");
            boolean isSaved = ticketBookingRepository.save(ticketBookingDTO);
            if (isSaved) System.out.println("Booking Data Saved Successfully!!!");
            else System.err.println("Booking data not saved successfully!!!");
        }
        return false;
    }

}
