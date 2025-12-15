package com.xworkz.dependencyinjection.components.busdepot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BusDepot {

    private int id;
    private String name;
    @Autowired
    private Bus bus;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Bus getBus() {
        return bus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "BusDepot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bus=" + bus +
                '}';
    }
}
