package com.xworkz.dependencyinjection.components.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Vehicle {

    private int id;
    private String name;
    @Autowired
    private Wheel wheel;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}
