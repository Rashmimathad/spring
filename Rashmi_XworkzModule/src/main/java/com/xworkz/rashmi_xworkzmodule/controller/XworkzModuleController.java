package com.xworkz.rashmi_xworkzmodule.controller;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserAlreadyExistsException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;
import com.xworkz.rashmi_xworkzmodule.service.EmailService;
import com.xworkz.rashmi_xworkzmodule.service.XworkzService;
import com.xworkz.rashmi_xworkzmodule.util.OTPUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Random;


@Controller
public class XworkzModuleController {

    @Autowired
    private XworkzService xworkzService;

    @Autowired
    private EmailService emailService;

    @RequestMapping("/index")
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping("/signUp")
    public String getSignUpPage() {
        return "RegistrationPage";
    }

    @RequestMapping("/signInPage")
    public String getSignInPage() {
        return "SignIn";
    }

    @RequestMapping("/sendOtp")
    public String getSignInWithOTP() {
        return "SignInWithOTP";
    }

    @RequestMapping("/resetPassword")
    public String getResetPasswordPage() {
        return "ResetPassword";
    }

    @PostMapping("/registerUser")
    public ModelAndView registerUser(@Valid UserDTO userDTO, BindingResult bindingResult, ModelAndView model) {
        try {
//            if (bindingResult.hasErrors()){
//                if (bindingResult.hasFieldErrors("userName")){
//                    model.addObject("nameError",bindingResult.getFieldError("userName"));
//                }
//                if (bindingResult.hasFieldErrors("userEmail")){
//                    model.addObject("emailError",bindingResult.getFieldError("userEmail"));
//                }
//                if (bindingResult.hasFieldErrors("phoneNumber")){
//                    model.addObject("phoneNumberError",bindingResult.getFieldError("phoneNumber"));
//                }
//                if (bindingResult.hasFieldErrors("age")){
//                    model.addObject("ageError",bindingResult.getFieldError("age"));
//                }
//                if (bindingResult.hasFieldErrors("gender")){
//                    model.addObject("genderError",bindingResult.getFieldError("gender"));
//                }
//                if (bindingResult.hasFieldErrors("address")){
//                    model.addObject("addressError",bindingResult.getFieldError("address"));
//                }
//                if (bindingResult.hasFieldErrors("password")){
//                    model.addObject("passwordError",bindingResult.getFieldError("password"));
//                }
//                if (bindingResult.hasFieldErrors("confirmPassword")){
//                    model.addObject("confirmPasswordError",bindingResult)
//                }
//            }

            if (bindingResult.hasErrors()) {
                bindingResult.getFieldErrors().forEach(error ->
                        model.addObject(error.getField() + "Error", error.getDefaultMessage()));
                model.setViewName("RegistrationPage");

            } else {
                if (!xworkzService.checkUserExistsByEmail(userDTO.getUserEmail()) && !xworkzService.checkUserExistsByPhone(userDTO.getPhoneNumber())) {
                    boolean isSaved = xworkzService.validateAndSave(userDTO);
                    if (isSaved)
                        model.setViewName("SignIn");
                    else {
                        model.addObject("confirmPasswordError", "Password does not match");
                        model.setViewName("RegistrationPage");
                    }
                }
            }
        } catch (DataInvalidException | UserAlreadyExistsException e) {
            model.addObject("errorMsg", e.getMessage());
            model.setViewName("RegistrationPage");
        }
        return model;
    }


    @PostMapping("/signIn")
    public String signIn(@RequestParam("userEmail") String email, @RequestParam("password") String password, Model model) {
        boolean isUserExists = false;

        try {
            isUserExists = xworkzService.checkUser(email, password);
            if (isUserExists) {
                int count = xworkzService.getCount(email);
                if (count < 2) {
                    xworkzService.setCountToZero(email);
                    return "Home";
                } else {
                    model.addAttribute("loginAttemptsMsg", "Too many attempts cannot login with password");
                    model.addAttribute("disableLogin", true);
                    model.addAttribute("showForgot", true);
                    return "SignIn";
                }
            }
        } catch (UserNotFounException e) {
            int count = xworkzService.getCount(email);
            model.addAttribute("userEmail", email);
            System.out.println(count);
            if (count >= 2) {
                model.addAttribute("disableLogin", true);
                model.addAttribute("showForgot", true);
                return "SignIn";
            } else {
                xworkzService.updateCount(email);
                model.addAttribute("errorMsg", e.getMessage());
            }

        }
        return "SignIn";
    }

    @GetMapping("/checkEmailExists")
    @ResponseBody
    public String checkEmailText(@Valid @RequestParam String email) {
        try {
            boolean exists = xworkzService.checkUserExistsByEmail(email);

            if (exists) {
                return "Email already exists";
            } else {
                return "OK";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Server error";
        }
    }

    @PostMapping("/sendOtp")
    public ModelAndView sendOtp(@RequestParam("userEmail") String email, ModelAndView model) {
        System.out.println("User entered email : " + email);
        int randomOtp = OTPUtil.getRandomOtp();
        boolean isOtpSaved = xworkzService.saveOtp(email, randomOtp);
        if (isOtpSaved) {
            model.addObject("email", email);
            String subject = "OTP Details";
            String text = "Your OTP for verification is: " + randomOtp;
            emailService.sendSimpleMessage(email, subject, text);
            model.setViewName("SignInWithOTP");
        } else {
            model.addObject("email", email);
        }

        return model;
    }

    @PostMapping("/verifyOtp")
    public ModelAndView verifyOtp(@RequestParam("otp") int otp, @RequestParam("userEmail") String email, ModelAndView model) {

        System.out.println("Otp Entered by User : " + otp);
        boolean isOtpVerified = xworkzService.verifyOtp(email, otp);
        if (isOtpVerified) {
            model.addObject("email", email);
            System.out.println("Otp Verified? " + isOtpVerified);
            model.setViewName("ResetPassword");
        } else {
            model.addObject("email", email);
            model.addObject("invalidOtp", "Incorrect OTP");
            model.setViewName("SignInWithOTP");
        }
        return model;
    }

    @PostMapping("/resetPassword")
    public ModelAndView resetPassword( @RequestParam("userEmail")String email, @RequestParam("newPassword")String newPassword, @RequestParam("confirmPassword")String confirmPassword,ModelAndView model){

       boolean isUpdated =  xworkzService.updatePassword(email,newPassword,confirmPassword);
        System.out.println("Is Password Updated : "+isUpdated);
        if (isUpdated){
            xworkzService.setCountToZero(email);
            model.setViewName("SignIn");
        }
        return model;
    }
}
