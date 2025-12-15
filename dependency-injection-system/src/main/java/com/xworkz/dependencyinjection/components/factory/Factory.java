package com.xworkz.dependencyinjection.components.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Factory {

    private int id;
    private String name;
    @Autowired
    private Machine machine;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", machine=" + machine +
                '}';
    }
}
