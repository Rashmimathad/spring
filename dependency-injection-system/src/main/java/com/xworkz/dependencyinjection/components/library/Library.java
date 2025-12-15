package com.xworkz.dependencyinjection.components.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Library {

    private int id;
    private String name;
    @Autowired
    private Book book;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
