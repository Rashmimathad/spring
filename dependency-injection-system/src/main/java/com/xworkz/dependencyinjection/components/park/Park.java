package com.xworkz.dependencyinjection.components.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Park {

    private int id;
    private String name;
    @Autowired
    private Tree tree;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Tree getTree() {
        return tree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tree=" + tree +
                '}';
    }
}
