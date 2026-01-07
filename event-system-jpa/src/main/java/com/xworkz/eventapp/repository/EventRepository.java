package com.xworkz.eventapp.repository;

import com.xworkz.eventapp.entity.EventEntity;

import java.util.List;
import java.util.Optional;

public interface EventRepository {
    boolean save(EventEntity eventEntity);

    Optional<EventEntity> getEventInfoByName(String eName);

    Optional<EventEntity> getEventInfoById(int eId);

    Optional<EventEntity> getEventInfoByLocation(String eventLoc);

    Optional<EventEntity> getEventInfoByTimings(String timings);

    Optional<EventEntity> getEventInfoByManagerName(String managerName);

    boolean updateTimingsById(int id, String updatedTimings);

    boolean deleteById(int id1);

    List<EventEntity> getEventsInfoByLocation(String loc);

    Object[] getEventsInfoByEventName(String eventName1);



    List<String> getAllManagersName();

    String getEventNameByManagerName(String managerName1);

    List<EventEntity> getAllEvents();

    String getEventLocationByTimings(String timings1);
}
