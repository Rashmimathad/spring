package com.xworkz.dependencyinjection.components.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Zoo {

    private int id;
    private String name;
    @Autowired
    private Animal animal;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }
}
