package com.xworkz.dependencyinjection.components.torch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Torch {

    private int id;
    private String name;
    @Autowired
    private Battery battery;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Torch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", battery=" + battery +
                '}';
    }
}
