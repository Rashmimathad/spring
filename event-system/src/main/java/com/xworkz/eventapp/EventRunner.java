package com.xworkz.eventapp;

import com.xworkz.eventapp.dto.EventDTO;
import com.xworkz.eventapp.service.EventService;
import com.xworkz.eventapp.service.impl.EventServiceImpl;

import java.util.Optional;

public class EventRunner {
    public static void main(String[] args) {

        EventService service = new EventServiceImpl();
        EventDTO eventDTO = new EventDTO(1,"New Year Party","Rajajinagar","Rashmi","9:00 PM");
        EventDTO eventDTO1  = new EventDTO(2,"StandUp Comedy","Ballari","Lavanya","6:30 PM");
//        service.validateAndSave(eventDTO1);
//        service.validateAndSave(eventDTO);

        Optional<EventDTO> eventDTOOptional = service.getEventById(2);
        if (eventDTOOptional.isPresent()){
            System.out.println(eventDTOOptional);
        }
//
//        boolean isDeleted = service.deleteById(1);
//        System.out.println("Is Event Deleted : "+isDeleted);
    }
}
