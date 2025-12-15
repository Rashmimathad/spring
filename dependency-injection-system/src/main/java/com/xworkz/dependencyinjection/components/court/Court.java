package com.xworkz.dependencyinjection.components.court;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Court {

    private int id;
    private String name;
    @Autowired
    private Judge judge;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Judge getJudge() {
        return judge;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    @Override
    public String toString() {
        return "Court{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", judge=" + judge +
                '}';
    }
}
