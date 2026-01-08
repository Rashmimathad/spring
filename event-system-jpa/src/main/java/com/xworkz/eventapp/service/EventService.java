package com.xworkz.eventapp.service;

import com.xworkz.eventapp.dto.EventDTO;

import java.util.List;
import java.util.Optional;

public interface EventService {
    boolean validateAndSave(EventDTO eventDTO);

    Optional<EventDTO> getEventInfoByName(String eName);

    Optional<EventDTO> getEventInfoById(int eId);

    Optional<EventDTO> getEventInfoByLocation(String eventLoc);

    Optional<EventDTO> getEventInfoByTimings(String timings);

    Optional<EventDTO> getEventInfoByManagerName(String managerName);

    boolean validateAndUpdateTimingsById(int id, String updatedTimings);

    boolean deleteById(int id1);

    List<EventDTO> getEventsInfoByLocation(String loc);

    Object[] getEventsInfoByEventName(String eventName1);


    List<String> getAllManagersName();

    String getEventNameByManagerName(String managerName1);

    List<EventDTO> getAllEventsList();

    String getLocationByTimings(String timings1);

    boolean updateEventManagerNameByEventNameAndEventTime(String eName1, String eTime, String updatedManagerName);

    boolean updateEventTimeByEventName(String eName2, String updatedEventTime);

    boolean deleteEventByEventName(String eventName3);
}
