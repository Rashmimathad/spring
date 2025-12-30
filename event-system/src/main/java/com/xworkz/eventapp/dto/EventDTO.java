package com.xworkz.eventapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventDTO {

    private int eventId;
    private String eventName;
    private String location;
    private String eventManager;
    private String eventTime;
}
