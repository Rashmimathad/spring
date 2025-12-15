package com.xworkz.dependencyinjection.components.navyship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NavyShip {

    private int id;
    private String name;
    @Autowired
    private Crew crew;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "NavyShip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", crew=" + crew +
                '}';
    }
}
