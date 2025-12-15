package com.xworkz.dependencyinjection.components.farm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Farm {

    private int id;
    private String name;
    @Autowired
    private Crop crop;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", crop=" + crop +
                '}';
    }
}
