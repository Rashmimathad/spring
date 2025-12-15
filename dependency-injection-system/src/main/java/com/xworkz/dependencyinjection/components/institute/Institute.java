package com.xworkz.dependencyinjection.components.institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Institute {


    private int id;
    private String name;
    @Autowired
    private Trainee trainee;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainee=" + trainee +
                '}';
    }
}
