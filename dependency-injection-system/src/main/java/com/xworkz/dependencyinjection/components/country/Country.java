package com.xworkz.dependencyinjection.components.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Country {

    private int id;
    private String name;
    @Autowired
    private State state;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
