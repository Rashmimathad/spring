package com.xworkz.ticketbookingapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TicketBookingDTO {

    private int id;
    private String userName;
    private int userAge;
    private String userGender;
    private String source;
    private String destination;
    private double ticketPrice;

    public TicketBookingDTO(String userName, int userAge, String userGender, String source, String destination, double ticketPrice) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGender = userGender;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }
}
