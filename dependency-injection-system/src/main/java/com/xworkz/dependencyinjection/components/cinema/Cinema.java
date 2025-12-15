package com.xworkz.dependencyinjection.components.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cinema {

    private int id;
    private String name;
    @Autowired
    private Screen screen;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", screen=" + screen +
                '}';
    }
}
