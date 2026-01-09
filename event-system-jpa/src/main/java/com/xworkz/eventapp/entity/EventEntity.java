package com.xworkz.eventapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "event_table")
@NamedQueries({
        @NamedQuery(name = "getEventInfoByName", query = "select eventInfo from EventEntity eventInfo where eventInfo.eventName=:name"),
        @NamedQuery(name = "getEventInfoByLocation", query = "select eventInfo from EventEntity eventInfo where eventInfo.eventLocation=:loc"),
        @NamedQuery(name = "getEventInfoByTimings", query = "select eventInfo from EventEntity eventInfo where eventInfo.eventTimings=:eventTimings"),
        @NamedQuery(name = "getEventInfoByManagerName", query = "select eventInfo from EventEntity eventInfo where eventInfo.eventManagerName=:eventManager"),
        @NamedQuery(name = "getEventsInfoByLocation", query = "select entities from EventEntity entities where entities.eventLocation=:location"),
        @NamedQuery(name = "getEventsInfoByEventName", query = "select eventInfo.eventLocation,eventInfo.eventManagerName from EventEntity eventInfo where eventInfo.eventName=:eName"),
        @NamedQuery(name = "getAllManagerNames", query = "select event.eventManagerName from EventEntity event"),
        @NamedQuery(name = "getEventNameByManagerName",query = "select event.eventName from EventEntity event where event.eventManagerName=:managerName")
})
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
