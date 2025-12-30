package com.xworkz.jobportalapp.service.impl;

import com.xworkz.jobportalapp.dto.UserDTO;
import com.xworkz.jobportalapp.exceptions.DataInvalidException;
import com.xworkz.jobportalapp.repository.JobPortalRepository;
import com.xworkz.jobportalapp.service.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JobPortalServiceImpl implements JobPortalService {

    @Autowired
    private JobPortalRepository jobPortalRepository;


    @Override
    public boolean validateAndSave(UserDTO userDTO) throws DataInvalidException {
        boolean isValidated=false;

        if (userDTO.getFirstName() == null || userDTO.getFirstName().trim().isEmpty()) {
            throw new DataInvalidException("First name is required");

        } else if (userDTO.getLastName() == null || userDTO.getLastName().trim().isEmpty()) {
            throw new DataInvalidException("Last name is required");

        } else if (userDTO.getEmail() == null || userDTO.getEmail().trim().isEmpty()) {
            throw new DataInvalidException("Email is required");

        } else if (!userDTO.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new DataInvalidException("Invalid email address");

        } else if (userDTO.getPhoneNumber()<=0) {
            throw new DataInvalidException("Phone number is required");

        } else if (userDTO.getExperienced() == null || userDTO.getExperienced().trim().isEmpty()) {
            throw new DataInvalidException("Please select experience");

        } else if ("YES".equalsIgnoreCase(userDTO.getExperienced())) {

            if (userDTO.getCompanyName() == null || userDTO.getCompanyName().trim().isEmpty()) {
                throw new DataInvalidException("Company name is required");

            } else if (userDTO.getJobTitle() == null || userDTO.getJobTitle().trim().isEmpty()) {
                throw new DataInvalidException("Job title is required");

            } else if (userDTO.getStartDate() == null || userDTO.getStartDate().trim().isEmpty()) {
                throw new DataInvalidException("Start date is required");

            } else if (userDTO.getLastWorkingDate() == null
                    || userDTO.getLastWorkingDate().trim().isEmpty()) {
                throw new DataInvalidException("Last working date is required");
            }


        }if (userDTO.getProfessionalSummary() == null
                    || userDTO.getProfessionalSummary().trim().isEmpty()) {
                throw new DataInvalidException("Professional summary is required");

            } else if (userDTO.getPrimarySkills() == null
                    || userDTO.getPrimarySkills().trim().isEmpty()) {
                throw new DataInvalidException("Primary skills are required");
            } else {
                isValidated = true;
                System.out.println("Data is Validated");
                boolean isSaved = jobPortalRepository.save(userDTO);
                if (isSaved) System.out.println("Data is Saved!!!");
                else System.err.println("Data is not saved!!!");
            }

        return isValidated;
    }
}

