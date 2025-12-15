package com.xworkz.dependencyinjection.components.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Event {

    private int id;
    private String name;
    @Autowired
    private Participant participant;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", participant=" + participant +
                '}';
    }
}
