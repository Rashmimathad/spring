package com.xworkz.dependencyinjection.components.radio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Radio {

    private int id;
    private String name;
    @Autowired
    private Antenna antenna;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Antenna getAntenna() {
        return antenna;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAntenna(Antenna antenna) {
        this.antenna = antenna;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", antenna=" + antenna +
                '}';
    }
}
