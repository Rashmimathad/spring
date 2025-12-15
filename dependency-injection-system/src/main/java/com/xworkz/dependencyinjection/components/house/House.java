package com.xworkz.dependencyinjection.components.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class House {

    private int id;
    private String name;
    @Autowired
    private Room room;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Room getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", room=" + room +
                '}';
    }
}
