package com.xworkz.dependencyinjection.components.staircase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Staircase {

    private int id;
    private String name;
    @Autowired
    private Stairs stairs;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Stairs getStairs() {
        return stairs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStairs(Stairs stairs) {
        this.stairs = stairs;
    }

    @Override
    public String toString() {
        return "Staircase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stairs=" + stairs +
                '}';
    }
}
