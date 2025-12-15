package com.xworkz.dependencyinjection.components.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mobile {

    private int id;
    private String name;
    @Autowired
    private Sim sim;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Sim getSim() {
        return sim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sim=" + sim +
                '}';
    }
}
