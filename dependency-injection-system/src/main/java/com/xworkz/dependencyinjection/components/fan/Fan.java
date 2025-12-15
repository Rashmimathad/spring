package com.xworkz.dependencyinjection.components.fan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Fan {

    private int id;
    private String name;
    @Autowired
    private Switch aSwitch;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Switch getaSwitch() {
        return aSwitch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setaSwitch(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aSwitch=" + aSwitch +
                '}';
    }
}
