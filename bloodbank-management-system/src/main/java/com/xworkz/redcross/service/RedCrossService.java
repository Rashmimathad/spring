package com.xworkz.redcross.service;

import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.exceptions.DataInvalidException;
import com.xworkz.redcross.exceptions.DuplicateEmailException;

import java.util.Optional;

public interface RedCrossService {
    boolean validateAndSave(DonorAccountDTO donorAccountDTO) throws DuplicateEmailException, DataInvalidException;

    Optional<DonorAccountDTO> validateAndSearch(String email) throws DataInvalidException;

    Optional<DonorAccountDTO> getDonorInfo(int id) throws DataInvalidException;

    boolean validateAndUpdate(DonorAccountDTO donorAccountDTO)throws DuplicateEmailException, DataInvalidException;

    boolean validateAndDelete(int id)throws DataInvalidException;;
}
