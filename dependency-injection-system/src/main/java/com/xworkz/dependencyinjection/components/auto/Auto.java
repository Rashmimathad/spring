package com.xworkz.dependencyinjection.components.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Auto {

    private int id;
    private String name;
    @Autowired
    private Meter meter;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meter=" + meter +
                '}';
    }
}
