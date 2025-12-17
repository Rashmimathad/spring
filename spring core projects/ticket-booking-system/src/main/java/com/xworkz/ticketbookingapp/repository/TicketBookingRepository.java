package com.xworkz.ticketbookingapp.repository;

import com.xworkz.ticketbookingapp.dto.TicketBookingDTO;

public interface TicketBookingRepository {

    boolean save(TicketBookingDTO ticketBookingDTO);

}
