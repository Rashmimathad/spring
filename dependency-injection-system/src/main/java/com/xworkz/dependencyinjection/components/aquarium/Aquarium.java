package com.xworkz.dependencyinjection.components.aquarium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Aquarium {
    private int id;
    private String name;
    @Autowired
    private Fish fish;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Fish getFish() {
        return fish;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fish=" + fish +
                '}';
    }
}
