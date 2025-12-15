package com.xworkz.dependencyinjection.components.waterplant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WaterPlant {

    private int id;
    private String name;
    @Autowired
    private Reservoir reservoir;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Reservoir getReservoir() {
        return reservoir;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReservoir(Reservoir reservoir) {
        this.reservoir = reservoir;
    }

    @Override
    public String toString() {
        return "WaterPlant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reservoir=" + reservoir +
                '}';
    }
}

