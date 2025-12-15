package com.xworkz.dependencyinjection.components.conference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Conference {

    private int id;
    private String name;
    @Autowired
    private Session session;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Session getSession() {
        return session;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", session=" + session +
                '}';
    }
}
