package com.xworkz.dependencyinjection.components.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Airline {

    private int id;
    private String name;
    @Autowired
    private Flights flights;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlights(Flights flights) {
        this.flights = flights;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Flights getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flights=" + flights +
                '}';
    }
}
