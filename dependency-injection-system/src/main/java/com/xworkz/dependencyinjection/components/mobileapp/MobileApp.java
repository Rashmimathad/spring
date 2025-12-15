package com.xworkz.dependencyinjection.components.mobileapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MobileApp {

    private int id;
    private String name;
    @Autowired
    private Feature feature;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", feature=" + feature +
                '}';
    }
}
