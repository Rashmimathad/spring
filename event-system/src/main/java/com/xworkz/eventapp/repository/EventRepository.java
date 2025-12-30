package com.xworkz.eventapp.repository;

import com.xworkz.eventapp.entity.EventEntity;

import java.util.Optional;

public interface EventRepository {
    boolean save(EventEntity entity);

    Optional<EventEntity> getEventInfoById(int id);

    boolean deleteById(int i);
}
