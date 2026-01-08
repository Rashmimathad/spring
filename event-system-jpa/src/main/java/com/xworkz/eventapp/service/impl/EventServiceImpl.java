package com.xworkz.eventapp.service.impl;

import com.xworkz.eventapp.dto.EventDTO;
import com.xworkz.eventapp.entity.EventEntity;
import com.xworkz.eventapp.repository.EventRepository;
import com.xworkz.eventapp.repository.impl.EventRepositoryImpl;
import com.xworkz.eventapp.service.EventService;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EventServiceImpl implements EventService {

    EventRepository eventRepository = new EventRepositoryImpl();

    @Override
    public boolean validateAndSave(EventDTO eventDTO) {
        boolean isValidated = false;

        if (eventDTO.getEventName()==null||eventDTO.getEventName().isEmpty()){
            System.err.println("Invalid event name");
        } else if (eventDTO.getEventLocation()==null||eventDTO.getEventLocation().isEmpty()) {
            System.err.println("Invalid event location");
        } else if (eventDTO.getEventTimings()==null||eventDTO.getEventTimings().isEmpty()) {
            System.err.println("Invalid event timings");
        } else if (eventDTO.getEventManagerName()==null||eventDTO.getEventManagerName().isEmpty()) {
            System.err.println("Invalid manager name");
        }else {
            isValidated=true;
            System.out.println("Validated");
            EventEntity eventEntity = new EventEntity();
            BeanUtils.copyProperties(eventDTO,eventEntity);

            boolean isSaved = eventRepository.save(eventEntity);

            if (isSaved) System.out.println("Saved");
            else System.err.println("Not saved");
        }

        return isValidated;
    }

    @Override
    public Optional<EventDTO> getEventInfoByName(String eName) {

        if (eName!=null||!eName.isEmpty()){
            EventDTO eventDTO = new EventDTO();
            Optional<EventEntity> eventEntity = eventRepository.getEventInfoByName(eName);
            BeanUtils.copyProperties(eventEntity.get(),eventDTO);
            return Optional.of(eventDTO);
        }

        return Optional.empty();
    }

    @Override
    public Optional<EventDTO> getEventInfoById(int eId) {

        if (eId>0){
            EventDTO eventDTO = new EventDTO();
            Optional<EventEntity> eventEntity = eventRepository.getEventInfoById(eId);
            BeanUtils.copyProperties(eventEntity.get(),eventDTO);
            return Optional.of(eventDTO);
        }

        return Optional.empty();
    }

    @Override
    public Optional<EventDTO> getEventInfoByLocation(String eventLoc) {

        if (eventLoc!=null||!eventLoc.isEmpty()){
            EventDTO eventDTO = new EventDTO();
            Optional<EventEntity> eventEntity = eventRepository.getEventInfoByLocation(eventLoc);
            BeanUtils.copyProperties(eventEntity.get(),eventDTO);
            return Optional.of(eventDTO);
        }
        return Optional.empty();
    }

    @Override
    public Optional<EventDTO> getEventInfoByTimings(String timings) {

        if (timings!=null||!timings.isEmpty()){
            EventDTO eventDTO = new EventDTO();
            Optional<EventEntity> eventEntity = eventRepository.getEventInfoByTimings(timings);
            BeanUtils.copyProperties(eventEntity.get(),eventDTO);
            return Optional.of(eventDTO);
        }
        return Optional.empty();
    }

    @Override
    public Optional<EventDTO> getEventInfoByManagerName(String managerName) {

        if (managerName!=null||!managerName.isEmpty()){
            EventDTO eventDTO = new EventDTO();
            Optional<EventEntity> eventEntity = eventRepository.getEventInfoByManagerName(managerName);
            BeanUtils.copyProperties(eventEntity.get(),eventDTO);
            return Optional.of(eventDTO);
        }

        return Optional.empty();
    }

    @Override
    public boolean validateAndUpdateTimingsById(int id, String updatedTimings) {
        boolean isValidated = false;

        if (id<=0){
            System.err.println("Invalid Id");
        } else if (updatedTimings==null||updatedTimings.isEmpty()) {
            System.err.println("Invalid timings to updateTimingsById");
        }else {
            isValidated=true;
            System.out.println("Validated");
            boolean isUpdated = eventRepository.updateTimingsById(id,updatedTimings);
            if (isUpdated) System.out.println("Updated");
            else System.err.println("Not Updated");
        }

        return isValidated;
    }

    @Override
    public boolean deleteById(int id1) {
        boolean isValidated =false;
        if (id1<=0){
            System.err.println("Invalid Id");
        }else {
            isValidated=true;
            boolean isDeleted = eventRepository.deleteById(id1);
            if (isDeleted) System.out.println("Event Deleted");
            else System.err.println("Not deleted");
        }
        return isValidated;
    }

    @Override
    public List<EventDTO> getEventsInfoByLocation(String loc) {

        if (loc!=null||!loc.isEmpty()){
            List<EventDTO> eventDTOS = new ArrayList<>();
            List<EventEntity> eventEntities =   eventRepository.getEventsInfoByLocation(loc);
            eventEntities.stream().forEach(eventEntity -> {
                EventDTO eventDTO = new EventDTO();
                BeanUtils.copyProperties(eventEntity,eventDTO);
                eventDTOS.add(eventDTO);
            });

            return eventDTOS;
        }

        return Collections.emptyList();
    }

    @Override
    public Object[] getEventsInfoByEventName(String eventName1) {
        Object[] eventsInfo = null;
        if (eventName1 != null || !eventName1.isEmpty()) {
            eventsInfo = eventRepository.getEventsInfoByEventName(eventName1);
            if (eventsInfo == null) System.out.println("Data not found");
        }
        return eventsInfo;
    }

    @Override
    public List<String> getAllManagersName() {
        List<String> managersList = eventRepository.getAllManagersName();
        if (managersList !=null) return managersList;
        else return Collections.emptyList();
    }

    @Override
    public String getEventNameByManagerName(String managerName1) {
        if (managerName1!=null||!managerName1.isEmpty()){
            String eventName = eventRepository.getEventNameByManagerName(managerName1);
            if (eventName!=null){
                return eventName;
            }else System.err.println("Event not found");
        }

        return "";
    }

    @Override
    public List<EventDTO> getAllEventsList() {

        List<EventDTO> eventDTOS = new ArrayList<>();
        List<EventEntity> eventEntities = eventRepository.getAllEvents();
        eventEntities.stream().forEach(eventEntity -> {
            EventDTO eventDTO = new EventDTO();
            BeanUtils.copyProperties(eventEntity,eventDTO);
            eventDTOS.add(eventDTO);
        });

        return eventDTOS;
    }

    @Override
    public String getLocationByTimings(String timings1) {
        if (timings1!=null||!timings1.isEmpty()){
            String location = eventRepository.getEventLocationByTimings(timings1);
            if (location!=null){
                return location;
            }else System.err.println("Event not found");
        }
        return "";
    }

    @Override
    public boolean updateEventManagerNameByEventNameAndEventTime(String eName1, String eTime, String updatedManagerName) {
        boolean isValidated = false;
        if (eName1==null||eName1.isEmpty()){
            System.err.println("Invalid event Name");
        } else if (eTime==null||eTime.isEmpty()) {
            System.err.println("Invalid event time");
        } else if (updatedManagerName==null||updatedManagerName.isEmpty()) {
            System.err.println("Invalid manager name");
        }else {
            isValidated=true;
            boolean isUpdated=eventRepository.updateEventManagerNameByEventNameAndEventTime(eName1,eTime,updatedManagerName);
            if (isUpdated) System.out.println("Updated Successfully!!!!");
            else System.err.println("Not Updated");
        }
        return isValidated;
    }

    @Override
    public boolean updateEventTimeByEventName(String eName2, String updatedEventTime) {
        boolean isValidated = false;
        if (eName2==null||eName2.isEmpty()){
            System.err.println("Invalid event Name");
        } else if (updatedEventTime==null||updatedEventTime.isEmpty()) {
            System.err.println("Invalid event time");
        }else {
            isValidated=true;
            boolean isUpdated=eventRepository.updateEventTimeByEventName(eName2,updatedEventTime);
            if (isUpdated) System.out.println("Updated Successfully!!!!");
            else System.err.println("Not Updated");
        }
        return isValidated;
    }

    @Override
    public boolean deleteEventByEventName(String eventName3) {
        boolean isValidated = false;
        if (eventName3==null||eventName3.isEmpty()){
            System.err.println("Invalid event Name");
        }else {
            isValidated=true;
            boolean isDeleted=eventRepository.deleteEventByEventName(eventName3);
            if (isDeleted) System.out.println("Deleted Successfully!!!!");
            else System.err.println("Not Updated");
        }
        return isValidated;
    }

}
