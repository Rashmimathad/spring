package com.xworkz.dependencyinjection.components.tv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Tv {

    private int id;
    private String name;
    @Autowired
    private Remote remote;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Remote getRemote() {
        return remote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remote=" + remote +
                '}';
    }
}
