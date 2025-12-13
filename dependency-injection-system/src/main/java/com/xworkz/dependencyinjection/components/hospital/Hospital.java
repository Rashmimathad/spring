package com.xworkz.dependencyinjection.components.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Hospital {

    private int hospitalId;
    private String hospitalName;

    @Autowired
    private Patient patient;

    public int getHospitalId() {
        return hospitalId;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", patient=" + patient +
                '}';
    }
}
