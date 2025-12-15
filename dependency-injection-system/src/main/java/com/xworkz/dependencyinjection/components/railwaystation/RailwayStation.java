package com.xworkz.dependencyinjection.components.railwaystation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RailwayStation {

    private int id;
    private String name;
    @Autowired
    private Platform platform;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "RailwayStation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", platform=" + platform +
                '}';
    }
}
