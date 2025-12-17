package com.xworkz.patientapp.service;

import com.xworkz.patientapp.dto.PatientDTO;

public interface PatientService {

    boolean validateAndSave(PatientDTO patientDTO);
}
