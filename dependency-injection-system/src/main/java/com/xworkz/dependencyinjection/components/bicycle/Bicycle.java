package com.xworkz.dependencyinjection.components.bicycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bicycle {

    private int id;
    private String name;
    @Autowired
    private Pedal pedal;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Pedal getPedal() {
        return pedal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPedal(Pedal pedal) {
        this.pedal = pedal;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pedal=" + pedal +
                '}';
    }
}
