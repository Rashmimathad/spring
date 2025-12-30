package com.xworkz.eventapp.service.impl;

import com.xworkz.eventapp.dto.EventDTO;
import com.xworkz.eventapp.entity.EventEntity;
import com.xworkz.eventapp.repository.EventRepository;
import com.xworkz.eventapp.repository.impl.EventRepositoryImpl;
import com.xworkz.eventapp.service.EventService;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

public class EventServiceImpl implements EventService {

    EventRepository eventRepository = new EventRepositoryImpl();

    @Override
    public boolean validateAndSave(EventDTO eventDTO) {
        boolean isValidated = false;
        if (eventDTO.getEventId()<=0){
            System.err.println("Invalid Id");
        } else if (eventDTO.getEventName()==null||eventDTO.getEventName().isEmpty()) {
            System.err.println("Invalid Event name");
        } else if (eventDTO.getLocation()==null||eventDTO.getLocation().isEmpty()) {
            System.err.println("Invalid location");
        } else if (eventDTO.getEventManager()==null||eventDTO.getEventManager().isEmpty()) {
            System.err.println("Invalid event manager name");
        }else if (eventDTO.getEventTime()==null||eventDTO.getEventTime().isEmpty()){
            System.err.println("Invalid event time");
        }else {
            isValidated=true;

            //copy properties
            EventEntity entity = new EventEntity();
            BeanUtils.copyProperties(eventDTO,entity);
            boolean isSaved = eventRepository.save(entity);
            if (isSaved) System.out.println("Data is saved");
            else System.err.println("Data not saved");
        }

        return isValidated;
    }

    @Override
    public Optional<EventDTO> getEventById(int id) {
        if (id<=0){
            System.err.println("Invalid id");return Optional.empty();

        }else {

            Optional<EventEntity> eventEntity = eventRepository.getEventInfoById(id);
            EventDTO eventDTO = new EventDTO();
            BeanUtils.copyProperties(eventEntity.get(), eventDTO);
//            eventEntity.ifPresent(entity ->
//                    BeanUtils.copyProperties(entity, eventDTO)
//            );
            return Optional.of(eventDTO);
        }

    }

    @Override
    public boolean deleteById(int i) {
        if (i<=0){
            System.err.println("Invalid Id");
            return false;
        }
        return eventRepository.deleteById(i);
    }
}
