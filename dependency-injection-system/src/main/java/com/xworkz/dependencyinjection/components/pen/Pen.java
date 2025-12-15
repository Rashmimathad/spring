package com.xworkz.dependencyinjection.components.pen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pen {

    private int id;
    private String name;
    @Autowired
    private Ink ink;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Ink getInk() {
        return ink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ink=" + ink +
                '}';
    }


}
