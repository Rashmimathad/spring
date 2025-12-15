package com.xworkz.dependencyinjection.components.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class University {

    private int id;
    private String universityName;
    @Autowired
    private Faculty faculty;

    public int getId() {
        return id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", universityName='" + universityName + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
