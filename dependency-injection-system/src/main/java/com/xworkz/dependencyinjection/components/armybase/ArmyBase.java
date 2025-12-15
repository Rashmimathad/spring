package com.xworkz.dependencyinjection.components.armybase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ArmyBase {
    private int id;
    private String name;
    @Autowired
    private Soldier soldier;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public String toString() {
        return "ArmyBase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", soldier=" + soldier +
                '}';
    }
}
