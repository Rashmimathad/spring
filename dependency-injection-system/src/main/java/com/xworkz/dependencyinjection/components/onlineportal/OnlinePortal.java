package com.xworkz.dependencyinjection.components.onlineportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OnlinePortal {

    private int id;
    private String name;
    @Autowired
    private User user;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OnlinePortal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
