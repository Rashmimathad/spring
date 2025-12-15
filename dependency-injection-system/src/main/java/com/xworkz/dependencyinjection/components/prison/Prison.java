package com.xworkz.dependencyinjection.components.prison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prison {

    private int id;
    private String name;
    @Autowired
    private Cell cell;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Cell getCell() {
        return cell;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Prison{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cell=" + cell +
                '}';
    }
}
