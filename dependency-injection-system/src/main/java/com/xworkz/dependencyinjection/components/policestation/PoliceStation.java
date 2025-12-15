package com.xworkz.dependencyinjection.components.policestation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PoliceStation {

    private int id;
    private String name;
    @Autowired
    private Police police;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPolice(Police police) {
        this.police = police;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Police getPolice() {
        return police;
    }

    @Override
    public String toString() {
        return "PoliceStation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", police=" + police +
                '}';
    }
}
