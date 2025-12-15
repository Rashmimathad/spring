package com.xworkz.dependencyinjection.components.stove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Stove {

    private int id;
    private String name;
    @Autowired
    private Gas gas;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gas getGas() {
        return gas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Stove{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gas=" + gas +
                '}';
    }
}
