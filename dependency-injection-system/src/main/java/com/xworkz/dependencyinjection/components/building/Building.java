package com.xworkz.dependencyinjection.components.building;

import com.xworkz.dependencyinjection.components.hotel.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Building {

    private int id;
    private String name;
    @Autowired
    private Floor floor;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                '}';
    }
}
