package com.xworkz.dependencyinjection.components.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bank {

    private int id;
    private String name;
    @Autowired
    private Account account;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}

