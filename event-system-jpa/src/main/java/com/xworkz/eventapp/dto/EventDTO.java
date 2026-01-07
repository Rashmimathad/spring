package com.xworkz.eventapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class EventDTO {

    private int eventId;
    private String eventName;
    private String eventLocation;
    private String eventTimings;
    private String eventManagerName;

    public EventDTO(String eventName, String eventLocation, String eventTimings, String eventManagerName) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventTimings = eventTimings;
        this.eventManagerName = eventManagerName;
    }


}
