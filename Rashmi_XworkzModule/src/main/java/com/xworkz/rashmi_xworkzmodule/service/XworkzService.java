package com.xworkz.rashmi_xworkzmodule.service;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public interface XworkzService {
    boolean validateAndSave(UserDTO userDTO) throws DataInvalidException;

    boolean checkUser(String email, String password) throws UserNotFounException;

    void updateCount(String email);

    int getCount(String email);

    void setCountToZero(String email);

    boolean checkUserExistsByEmail(@NotBlank(message = "Email is required") @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "Enter a valid email address which should include @gmail.com" ) String userEmail);

    boolean checkUserExistsByPhone(@NotBlank(message = "Phone number is required") @Pattern(regexp = "^\\+91[6-9]\\d{9}$",message = "Enter valid number (ex: +919876543210)") String phoneNumber);

    boolean saveOtp(String email,int randomOtp);

    boolean verifyOtp(String email, int otp);


    boolean updatePassword(@NotBlank(message = "Email is required") @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "Enter a valid email address which should include @gmail.com" ) String email,  @NotBlank(message = "Password is required")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d).+$",message = "Password must contain letters and numbers") String newPassword,   @NotBlank(message = "Password is required")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d).+$",message = "Password must contain letters and numbers") String confirmPassword);
}
