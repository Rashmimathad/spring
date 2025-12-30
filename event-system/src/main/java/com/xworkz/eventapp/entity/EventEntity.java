package com.xworkz.eventapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EventEntity {

    @Id
    @Column(name = "event_id")
    private int eventId;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "location")
    private String location;
    @Column(name = "event_manager")
    private String eventManager;
    @Column(name = "event_time")
    private String eventTime;
}
