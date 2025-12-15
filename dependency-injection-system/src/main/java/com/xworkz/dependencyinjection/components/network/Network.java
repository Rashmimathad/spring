package com.xworkz.dependencyinjection.components.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Network {

    private int id;
    private String name;
    @Autowired
    private Router router;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Router getRouter() {
        return router;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    @Override
    public String toString() {
        return "Network{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", router=" + router +
                '}';
    }
}
