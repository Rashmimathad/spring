package com.xworkz.dependencyinjection.components.powerplant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PowerPlant {

    private int id;
    private String name;
    @Autowired
    private Turbine turbine;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Turbine getTurbine() {
        return turbine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTurbine(Turbine turbine) {
        this.turbine = turbine;
    }

    @Override
    public String toString() {
        return "PowerPlant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", turbine=" + turbine +
                '}';
    }
}
