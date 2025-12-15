package com.xworkz.dependencyinjection.components.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Exam {

    private int id;
    private String name;
    @Autowired
    private Question question;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", question=" + question +
                '}';
    }
}
