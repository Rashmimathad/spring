package com.xworkz.rashmi_xworkzmodule.service.impl;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.entity.UserEntity;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;
import com.xworkz.rashmi_xworkzmodule.repository.XworkzRepository;
import com.xworkz.rashmi_xworkzmodule.service.XworkzService;
import com.xworkz.rashmi_xworkzmodule.util.PasswordEncryption;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XworkzServiceImpl implements XworkzService {

    @Autowired
    private XworkzRepository xworkzRepository;

    @Autowired
    private PasswordEncryption passwordEncryption;

    public boolean validateUserInfo(UserDTO userDTO) throws DataInvalidException {

        boolean isValidated = false;

        if (userDTO==null){
            System.err.println("Failed to save data");
            throw new DataInvalidException("Failed to Save data");
        }else if (userDTO.getUserName()==null||userDTO.getUserName().isEmpty()){
            System.err.println("Invalid User Name");
            throw new DataInvalidException("Invalid User Name");
        } else if (userDTO.getUserEmail()==null||userDTO.getUserEmail().isEmpty()) {
            System.err.println("Invalid user email");
            throw new DataInvalidException("Invalid User Email");
        }  else if (userDTO.getPhoneNumber()==null||userDTO.getPhoneNumber().isEmpty()) {
            System.err.println("Invalid Phone Number");
            throw new DataInvalidException("Invalid Phone Number");
        } else if (userDTO.getAge()<18) {
            System.err.println("Invalid Age");
            throw new DataInvalidException("Invalid Age");
        } else if (userDTO.getGender()==null||userDTO.getGender().isEmpty()) {
            System.err.println("Invalid Gender");
            throw new DataInvalidException("Please Select gender");
        } else if (userDTO.getAddress()==null||userDTO.getAddress().isEmpty()) {
            System.err.println("Invalid Address");
            throw new DataInvalidException("Invalid Address");
        }else if (userDTO.getPassword()==null||userDTO.getPassword().isEmpty()){
            System.err.println("Invalid Password");
            throw new DataInvalidException("Invalid Password");
        }else if (userDTO.getConfirmPassword()==null||userDTO.getConfirmPassword().isEmpty()){
            System.err.println("Re-enter the Password");
            throw new DataInvalidException("Re-enter the Password");
        } else if (!userDTO.getConfirmPassword().equals(userDTO.getPassword())) {
            System.err.println("Password does not match");
            throw new DataInvalidException("Password does not match");
        }else {
            isValidated=true;

        }
        return isValidated;
    }

    @Override
    public boolean validateAndSave(UserDTO userDTO) throws DataInvalidException {

        System.out.println("User Info received from Jsp : "+userDTO);
        boolean isSaved = false;
        boolean isValidated = validateUserInfo(userDTO);
        if (isValidated){

          String encryptedPassword =  passwordEncryption.encrypt(userDTO.getPassword());
            System.out.println("Encrypted Password : "+encryptedPassword);
            userDTO.setPassword(encryptedPassword);

            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(userDTO,userEntity);
            isSaved = xworkzRepository.save(userEntity);
            if (isSaved) {
                System.out.println("Data Saved Successfully!!");
                System.out.println("Saved User Info : "+userEntity);
            }
            else System.err.println("Failed to Saved Data");
        }
        return isSaved;
    }

    @Override
    public boolean checkUser(String email, String password) throws UserNotFounException {
        boolean isUserExists=false;
        if (email==null||email.isEmpty()){
            System.err.println("Invalid email");
        }else if (password==null||password.isEmpty()){
            System.err.println("Invalid password");
        }else {

            String pwd =xworkzRepository.checkUser(email);
            if (pwd !=null&&!pwd.isEmpty()) {
                String decryptedPassword = passwordEncryption.decrypt(pwd);
                if (decryptedPassword.equals(password)) {
                    isUserExists = true;
                }else{
                   int count =  xworkzRepository.getCount(email);
                    throw new UserNotFounException("Invalid password, you have "+(3-(count+1))+" attempts!!");
                }
            }else throw new UserNotFounException("User Not Found!!");
        }
        return isUserExists;
    }

    @Override
    public void updateCount(String email) {
        xworkzRepository.updateCount(email);
    }

    @Override
    public int getCount(String email) {
        return xworkzRepository.getCount(email);
    }
}
