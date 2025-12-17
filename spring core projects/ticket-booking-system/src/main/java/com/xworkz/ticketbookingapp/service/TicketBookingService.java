package com.xworkz.ticketbookingapp.service;

import com.xworkz.ticketbookingapp.dto.TicketBookingDTO;

public interface TicketBookingService {

    boolean validateAndSave(TicketBookingDTO ticketBookingDTO);
}
