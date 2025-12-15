package com.xworkz.dependencyinjection.components.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Airport {

    private int id;
    private String name;
    @Autowired
    private Terminal terminal;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", terminal=" + terminal +
                '}';
    }
}

