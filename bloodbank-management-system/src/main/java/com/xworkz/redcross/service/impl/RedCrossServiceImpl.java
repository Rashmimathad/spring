package com.xworkz.redcross.service.impl;

import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.exceptions.DataInvalidException;
import com.xworkz.redcross.exceptions.DuplicateEmailException;
import com.xworkz.redcross.repository.RedCrossRepository;
import com.xworkz.redcross.service.RedCrossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RedCrossServiceImpl implements RedCrossService {

    @Autowired
    private RedCrossRepository redCrossRepository;


    @Override
    public boolean validateAndSave(DonorAccountDTO donorAccountDTO) throws DuplicateEmailException, DataInvalidException {

        boolean isValidated = false;

        if (donorAccountDTO.getEmail() == null || donorAccountDTO.getEmail().trim().isEmpty()) {
            System.err.println("Email is required.");

        }


        if (donorAccountDTO.getDobYear() <= 0 || donorAccountDTO.getDobMonth() == null || donorAccountDTO.getDobMonth().trim().isEmpty() || donorAccountDTO.getDobDay()<=0) {
            System.err.println("Date of birth is incomplete.");
        }

        if (donorAccountDTO.getFirstName() == null || donorAccountDTO.getFirstName().trim().isEmpty()) {
            System.err.println("First name is required.");

        }

        if (donorAccountDTO.getLastName() == null || donorAccountDTO.getLastName().trim().isEmpty()) {
            System.err.println("Last name is required.");

        }

        if (donorAccountDTO.getZip() == null || donorAccountDTO.getZip().trim().isEmpty()) {
            System.err.println("ZIP code is required.");

        }

        if (donorAccountDTO.getUserName() == null || donorAccountDTO.getUserName().trim().isEmpty()) {
            System.err.println("Username is required.");

        }


        if (donorAccountDTO.getPassword() == null || donorAccountDTO.getPassword().length() < 8) {
            System.err.println("Password must be at least 8 characters long.");
        }


        if (donorAccountDTO.getConfirmPassword() == null || !donorAccountDTO.getConfirmPassword().equals(donorAccountDTO.getPassword())) {
            System.err.println("Passwords do not match.");
        }

        else{
            isValidated = true;
        }

        if (isValidated){
            System.out.println("Data Validated");
            boolean isDuplicateEntry = redCrossRepository.duplicateCheck(donorAccountDTO.getEmail());
            if (!isDuplicateEntry) {
                boolean isSaved = redCrossRepository.save(donorAccountDTO);
            }else throw new DuplicateEmailException("Email Already Exists!!");

        }else throw  new DataInvalidException("Data not saved, Please enter valid details!!");
        return isValidated;
    }

    @Override
    public Optional<DonorAccountDTO> validateAndSearch(String email) throws DataInvalidException {

        if (email==null||email.isEmpty()){
            throw new DataInvalidException("Email Does not exists!!");
        }
             return redCrossRepository.getDonorInfo(email);

    }

    @Override
    public Optional<DonorAccountDTO> getDonorInfo(int id) throws DataInvalidException {

        boolean isValidated = false;
        if (id<=0){
            throw new DataInvalidException("ID does not exist!!");
        }
       return  redCrossRepository.getDonorInfoById(id);
    }

    @Override
    public boolean validateAndUpdate(DonorAccountDTO donorAccountDTO) throws DuplicateEmailException, DataInvalidException {
        boolean isValidated = false;

        if (donorAccountDTO.getEmail() == null || donorAccountDTO.getEmail().trim().isEmpty()) {
            System.err.println("Email is required.");

        }


        if (donorAccountDTO.getDobYear() <= 0 || donorAccountDTO.getDobMonth() == null || donorAccountDTO.getDobMonth().trim().isEmpty() || donorAccountDTO.getDobDay()<=0) {
            System.err.println("Date of birth is incomplete.");
        }

        if (donorAccountDTO.getFirstName() == null || donorAccountDTO.getFirstName().trim().isEmpty()) {
            System.err.println("First name is required.");

        }

        if (donorAccountDTO.getLastName() == null || donorAccountDTO.getLastName().trim().isEmpty()) {
            System.err.println("Last name is required.");

        }

        if (donorAccountDTO.getZip() == null || donorAccountDTO.getZip().trim().isEmpty()) {
            System.err.println("ZIP code is required.");

        }

        if (donorAccountDTO.getUserName() == null || donorAccountDTO.getUserName().trim().isEmpty()) {
            System.err.println("Username is required.");

        }


        if (donorAccountDTO.getPassword() == null || donorAccountDTO.getPassword().length() < 8) {
            System.err.println("Password must be at least 8 characters long.");
        }


        if (donorAccountDTO.getConfirmPassword() == null || !donorAccountDTO.getConfirmPassword().equals(donorAccountDTO.getPassword())) {
            System.err.println("Passwords do not match.");
        }

        else{
            isValidated = true;
        }

        if (isValidated){
            System.out.println("Data Validated");
                boolean isUpdated = redCrossRepository.update(donorAccountDTO);
            if (isUpdated) System.out.println("Data Updated");
            else System.err.println("Data not updated");
        }else throw  new DataInvalidException("Data not updated, Please enter valid details!!");
        return isValidated;
    }

    @Override
    public boolean validateAndDelete(int id) throws DataInvalidException {
        boolean isValidated = false;
        if (id<=0){
            throw new DataInvalidException("ID does not exist!!");
        }else {
            isValidated = true;
            boolean isDeleted = redCrossRepository.delete(id);
            if (isDeleted) System.out.println("Donor Data Deleted");
            else System.err.println("Donor data not deleted");
        }
        return isValidated;
    }
}
