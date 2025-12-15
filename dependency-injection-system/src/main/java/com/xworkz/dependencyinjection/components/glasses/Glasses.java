package com.xworkz.dependencyinjection.components.glasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Glasses {

    private int id;
    private String name;
    @Autowired
    private Frame frame;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Glasses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", frame=" + frame +
                '}';
    }
}
