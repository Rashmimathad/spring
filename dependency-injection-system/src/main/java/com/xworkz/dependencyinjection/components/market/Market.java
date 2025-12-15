package com.xworkz.dependencyinjection.components.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Market {

    private int id;
    private String name;
    @Autowired
    private Stall stall;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Stall getStall() {
        return stall;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStall(Stall stall) {
        this.stall = stall;
    }

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stall=" + stall +
                '}';
    }
}
