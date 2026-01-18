package com.xworkz.rashmi_xworkzmodule.controller;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;
import com.xworkz.rashmi_xworkzmodule.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class XworkzModuleController {

    @Autowired
    private XworkzService xworkzService;

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/signUp")
    public String getSignUpPage(){
        return "RegistrationPage";
    }

    @RequestMapping("/signInPage")
    public String getSignInPage(){
        return "SignIn";
    }

    @PostMapping("/registerUser")
    public String registerUser(UserDTO userDTO, Model model){
        try {
            boolean isSaved = xworkzService.validateAndSave(userDTO);
        } catch (DataInvalidException e) {
            model.addAttribute("errorMsg",e.getMessage());
        }
        return "SignIn";
    }

    @PostMapping("/signIn")
    public String signIn(@RequestParam("userEmail")String email,@RequestParam("password")String password,Model model){
        boolean isUserExists = false;

        try {
             isUserExists =  xworkzService.checkUser(email, password);
            if (isUserExists) {
                model.addAttribute("faceStatus","correct");
                return "Home";
            }
        } catch (UserNotFounException e) {
          int count =  xworkzService.getCount(email);
            System.out.println(count);
            if (count>=2){
                model.addAttribute("faceStatus", "neutral");
                return "SignInWithOTP";
            }else{
                xworkzService.updateCount(email);
                model.addAttribute("faceStatus", "wrong");
                model.addAttribute("errorMsg",e.getMessage());
            }

        }
        return "SignIn";
    }

}
