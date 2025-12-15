package com.xworkz.dependencyinjection.components.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassRoom {

    private int id;
    private String name;
    @Autowired
    private Board board;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", board=" + board +
                '}';
    }
}
