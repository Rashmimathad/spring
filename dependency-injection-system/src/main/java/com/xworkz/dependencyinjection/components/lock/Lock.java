package com.xworkz.dependencyinjection.components.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Lock {

    private int id;
    private String name;
    @Autowired
    private Key key;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Key getKey() {
        return key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Lock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", key=" + key +
                '}';
    }
}
