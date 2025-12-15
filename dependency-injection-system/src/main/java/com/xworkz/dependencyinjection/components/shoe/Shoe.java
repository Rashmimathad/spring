package com.xworkz.dependencyinjection.components.shoe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Shoe {

    private int id;
    private String name;
    @Autowired
    private Lace lace;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Lace getLace() {
        return lace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLace(Lace lace) {
        this.lace = lace;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lace=" + lace +
                '}';
    }
}
