package com.xworkz.dependencyinjection.components.softwaresystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SoftwareSystem {

    private int id;
    private String name;
    @Autowired
    private Module module;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Module getModule() {
        return module;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "SoftwareSystem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", module=" + module +
                '}';
    }
}
