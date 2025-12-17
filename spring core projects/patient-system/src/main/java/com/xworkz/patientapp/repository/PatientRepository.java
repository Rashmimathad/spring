package com.xworkz.patientapp.repository;

import com.xworkz.patientapp.dto.PatientDTO;

public interface PatientRepository {

    boolean save(PatientDTO patientDTO);
}
