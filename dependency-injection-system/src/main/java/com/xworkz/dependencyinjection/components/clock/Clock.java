package com.xworkz.dependencyinjection.components.clock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Clock {

    private int id;
    private String name;
    @Autowired
    private Hand hand;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}
