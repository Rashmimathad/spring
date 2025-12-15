package com.xworkz.dependencyinjection.components.shirt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Shirt {


    private int id;
    private String name;
    @Autowired
    private Hanger hanger;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Hanger getHanger() {
        return hanger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHanger(Hanger hanger) {
        this.hanger = hanger;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hanger=" + hanger +
                '}';
    }
}
