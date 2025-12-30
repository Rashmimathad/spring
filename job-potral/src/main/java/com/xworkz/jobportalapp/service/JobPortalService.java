package com.xworkz.jobportalapp.service;

import com.xworkz.jobportalapp.dto.UserDTO;
import com.xworkz.jobportalapp.exceptions.DataInvalidException;

public interface JobPortalService {

    boolean validateAndSave(UserDTO userDTO) throws DataInvalidException;
}
