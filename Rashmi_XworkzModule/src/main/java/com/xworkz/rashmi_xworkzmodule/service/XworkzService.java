package com.xworkz.rashmi_xworkzmodule.service;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;

public interface XworkzService {
    boolean validateAndSave(UserDTO userDTO) throws DataInvalidException;

    boolean checkUser(String email, String password) throws UserNotFounException;
}
