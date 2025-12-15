package com.xworkz.dependencyinjection.components.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Company {

    private int id;
    private String companyName;
    @Autowired
    private Employee employee;

    public int getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", employee=" + employee +
                '}';
    }

}
