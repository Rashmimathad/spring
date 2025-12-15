package com.xworkz.dependencyinjection.components.school;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class School {

    private int schoolId;
    private String schoolName;
    @Autowired
    private Student student;

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", student=" + student +
                '}';
    }
}
