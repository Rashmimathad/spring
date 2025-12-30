package com.xworkz.jobportalapp.controller;

import com.xworkz.jobportalapp.dto.UserDTO;
import com.xworkz.jobportalapp.exceptions.DataInvalidException;
import com.xworkz.jobportalapp.service.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobPortalController {

    @Autowired
    private JobPortalService jobPortalService;

    public JobPortalController(){
        System.out.println("JobPortalController created");
    }

    @RequestMapping("/register")
    public String getRegisterPage(){
        return "RegistrationPage.jsp";
    }

    @PostMapping("/registerUser")
    public String registerUser(UserDTO userDTO, Model model){
        try {
         boolean isValidatedANdSaved = jobPortalService.validateAndSave(userDTO);
         if (isValidatedANdSaved) System.out.println("Validated and saved");
         else System.err.println("Not Validated");
        } catch (DataInvalidException e) {
            e.printStackTrace();
        }
        return "RegisterResponse.jsp";
    }
}
