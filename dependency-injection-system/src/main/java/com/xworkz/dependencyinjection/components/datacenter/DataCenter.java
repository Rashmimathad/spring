package com.xworkz.dependencyinjection.components.datacenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DataCenter {

    private int id;
    private String name;
    @Autowired
    private Server server;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Server getServer() {
        return server;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return "DataCenter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", server=" + server +
                '}';
    }
}
