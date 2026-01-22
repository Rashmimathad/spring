package com.xworkz.rashmi_xworkzmodule.service.impl;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.entity.UserEntity;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserAlreadyExistsException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;
import com.xworkz.rashmi_xworkzmodule.repository.XworkzRepository;
import com.xworkz.rashmi_xworkzmodule.service.XworkzService;
import com.xworkz.rashmi_xworkzmodule.util.PasswordEncryptionUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Service
public class XworkzServiceImpl implements XworkzService {

    @Autowired
    private XworkzRepository xworkzRepository;





    @Override
    public boolean validateAndSave(UserDTO userDTO) throws DataInvalidException {

        System.out.println("User Info received from Jsp : "+userDTO);
        boolean isSaved = false;
        if (userDTO.getConfirmPassword().equals(userDTO.getPassword())){

          String encryptedPassword =  PasswordEncryptionUtil.encrypt(userDTO.getPassword());
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
                String decryptedPassword = PasswordEncryptionUtil.decrypt(pwd);
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

    @Override
    public void setCountToZero(String email) {
        xworkzRepository.setCountToZero(email);
    }

    @Override
    public boolean checkUserExistsByEmail(String userEmail) {
        boolean isUserExists=false;
        isUserExists = xworkzRepository.checkUserExistsByEmail(userEmail);
        if (isUserExists) isUserExists=true;
        return isUserExists;
    }


    @Override
    public boolean checkUserExistsByPhone(String phoneNumber) {
        boolean isUserExists=false;
        isUserExists = xworkzRepository.checkUserExistsByPhone(phoneNumber);
        if (isUserExists) throw new UserAlreadyExistsException("Contact Number Already Exists");
        return isUserExists;
    }

    @Override
    public boolean saveOtp(String email, int randomOtp) {
        if (randomOtp!=0) {
            System.out.println("Is OTP Saved : " + xworkzRepository.saveOtp(email, randomOtp));
            return xworkzRepository.saveOtp(email, randomOtp);
        }
        else return false;
    }

    @Override
    public boolean verifyOtp(String email, int otp) {
        int otpFromDb=  xworkzRepository.getOtp(email);
        if (otpFromDb==otp) {
            System.out.println("Otp matched");
            return true;
        }
        return false;
    }

    @Override
    public boolean updatePassword(String email, String newPassword,  String confirmPassword) {
        boolean isUpdated = false;
        if (newPassword.equals(confirmPassword)){
          String encryptedPassword =  PasswordEncryptionUtil.encrypt(newPassword);
            System.out.println("Encrypted New Password : "+encryptedPassword);
          isUpdated =  xworkzRepository.updatePassword(email,encryptedPassword);
        }
        return isUpdated;
    }


}
