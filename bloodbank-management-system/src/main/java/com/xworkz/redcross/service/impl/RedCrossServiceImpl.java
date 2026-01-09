package com.xworkz.redcross.service.impl;

import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.entity.DonorAccountEntity;
import com.xworkz.redcross.exceptions.DataInvalidException;
import com.xworkz.redcross.exceptions.DuplicateEmailException;
import com.xworkz.redcross.repository.RedCrossRepository;
import com.xworkz.redcross.service.RedCrossService;
import org.springframework.beans.BeanUtils;
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
                DonorAccountEntity donorAccountEntity = new DonorAccountEntity();
                BeanUtils.copyProperties(donorAccountDTO,donorAccountEntity);
                boolean isSaved = redCrossRepository.save(donorAccountEntity);
                if (isSaved) System.out.println("Data Saved Successfully!!!");
                else System.err.println("Data not Saved");
            }else throw new DuplicateEmailException("Email Already Exists!!");

        }else throw  new DataInvalidException("Data not saved, Please enter valid details!!");
        return isValidated;
    }

    @Override
    public Optional<DonorAccountDTO> validateAndSearch(String email) throws DataInvalidException {

        if (email==null||email.isEmpty()){
            throw new DataInvalidException("Email Does not exists!!");
        }else {
            DonorAccountDTO donorAccountDTO = new DonorAccountDTO();
            Optional<DonorAccountEntity> donorAccountEntity = redCrossRepository.getDonorInfoByEmail(email);
            if (donorAccountEntity.isPresent()) {
                BeanUtils.copyProperties(donorAccountEntity.get(), donorAccountDTO);
                return Optional.of(donorAccountDTO);
            }else throw new DataInvalidException("Email Does not exists!!");
        }
    }

    @Override
    public Optional<DonorAccountDTO> getDonorInfo(int id) throws DataInvalidException {

        if (id<=0){
            throw new DataInvalidException("ID does not exist!!");
        }
        else {
            DonorAccountDTO donorAccountDTO = new DonorAccountDTO();
            Optional<DonorAccountEntity> donorAccountEntity = redCrossRepository.getDonorInfoById(id);
            if (donorAccountEntity.isPresent()) {
                BeanUtils.copyProperties(donorAccountEntity.get(), donorAccountDTO);
                return Optional.of(donorAccountDTO);
            }else throw new DataInvalidException("ID Does not exists!!");
        }
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
            DonorAccountEntity donorAccountEntity = new DonorAccountEntity();
            BeanUtils.copyProperties(donorAccountDTO,donorAccountEntity);
                boolean isUpdated = redCrossRepository.update(donorAccountEntity);
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
