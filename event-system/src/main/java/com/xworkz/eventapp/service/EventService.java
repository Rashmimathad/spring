package com.xworkz.eventapp.service;

import com.xworkz.eventapp.dto.EventDTO;

import java.util.Optional;

public interface EventService {

    boolean validateAndSave(EventDTO eventDTO);

    Optional<EventDTO> getEventById(int id);

    boolean deleteById(int i);
}
