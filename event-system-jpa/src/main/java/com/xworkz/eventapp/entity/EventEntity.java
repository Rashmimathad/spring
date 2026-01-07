package com.xworkz.eventapp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "event_table")
public class EventEntity {
    @Id
    @Column(name = "event_id")
    private int eventId;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "event_location")
    private String eventLocation;
    @Column(name = "event_timings")
    private String eventTimings;
    @Column(name = "event_manager_name")
    private String eventManagerName;
}
