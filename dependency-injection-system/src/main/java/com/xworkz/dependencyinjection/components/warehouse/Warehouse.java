package com.xworkz.dependencyinjection.components.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Warehouse {

    private int id;
    private String name;
    @Autowired
    private Inventory inventory;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
