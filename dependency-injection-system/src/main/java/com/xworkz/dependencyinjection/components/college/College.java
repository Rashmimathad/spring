package com.xworkz.dependencyinjection.components.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class College {

    private int collegeId;
    private String collegeName;
    @Autowired
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", department=" + department +
                '}';
    }
}

