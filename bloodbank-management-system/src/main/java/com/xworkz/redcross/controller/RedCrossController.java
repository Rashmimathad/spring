package com.xworkz.redcross.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.exceptions.DataInvalidException;
import com.xworkz.redcross.exceptions.DuplicateEmailException;
import com.xworkz.redcross.service.RedCrossService;
import com.xworkz.redcross.utility.NumberValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Optional;

@Controller

public class RedCrossController {

    @Autowired
     private RedCrossService redCrossService;

    public RedCrossController(){
        System.out.println("RedCrossController created");
    }


    @RequestMapping("/index")
    public String getHomePage(){
        return "index.jsp";
    }

    @RequestMapping("/signUp")
    public String getRegPage(){
        return "RegistrationPage.jsp";
    }

    @PostMapping("/createDonorAccount")
    public String addDonorAccount(DonorAccountDTO donorAccountDTO, Model model){

       try {
           boolean isValidatedAndSaved = redCrossService.validateAndSave(donorAccountDTO);
           if (isValidatedAndSaved) {
               System.out.println(donorAccountDTO);
               model.addAttribute("successMsg", "Data Saved Successfully!!!");
           }

       }catch (DuplicateEmailException | DataInvalidException e){
           model.addAttribute("errorMsg", e.getMessage());
           System.err.println("Data not validated and saved");
           e.printStackTrace();
       }
        return "DonorResponse.jsp";
    }

    @RequestMapping("/searchPage")
    public String getSearchPage(){
        return "SearchPage.jsp";
    }

    @GetMapping("/searchByEmail")
    public String getDonorInfo(@RequestParam("email")String email,@RequestParam("submitType")String submitType,Model model){
        if ("clear".equalsIgnoreCase(submitType)){
            model.addAttribute("donorInfo",null);
        }else {
            try {
                Optional<DonorAccountDTO> donorAccountDTO = redCrossService.validateAndSearch(email);
                if (donorAccountDTO.isPresent()) {
                    model.addAttribute("donorInfo", donorAccountDTO.get());
                    System.out.println(donorAccountDTO);
                }
            } catch (DataInvalidException e) {
                model.addAttribute("errorMsg", e.getMessage());
                e.printStackTrace();
            }
        }
        return "SearchPage.jsp";
    }

    @GetMapping("/edit/{id}")
    public String getDonorInfo(@PathVariable("id") String  id, Model model){
        try{
          Optional<DonorAccountDTO> donorAccountDTO =   redCrossService.getDonorInfo(NumberValidation.parseIntSafe(id));
            if (donorAccountDTO.isPresent()){
                model.addAttribute("donor",donorAccountDTO.get());
            }
        }catch (DataInvalidException e){
            model.addAttribute("errorMsg", e.getMessage());
            e.printStackTrace();
        }

        return "/Update.jsp";
    }


    @PostMapping("/updateDonor")
    public String updateDonorInfo(DonorAccountDTO donorAccountDTO, Model model){

        try {
            boolean isValidatedAndSaved = redCrossService.validateAndUpdate(donorAccountDTO);
            if (isValidatedAndSaved) {
                System.out.println(donorAccountDTO);
                model.addAttribute("successMsg", "Data Updated Successfully!!!");
            }

        }catch (DuplicateEmailException | DataInvalidException e){
            model.addAttribute("errorMsg", e.getMessage());
            System.err.println("Data not validated and saved");
            e.printStackTrace();
        }

        return "Update.jsp";
    }

    @GetMapping("/delete/{id}")
    public String deleteDonor(@PathVariable("id") String id,Model model){

        try{
            boolean isDeleted = redCrossService.validateAndDelete(NumberValidation.parseIntSafe(id));
            model.addAttribute("successMsg", "Donor with Id "+id+" Deleted Successfully!!!");
        }catch (DataInvalidException e){
            model.addAttribute("errorMsg", e.getMessage());
            e.printStackTrace();
        }
        return "/DeleteResponse.jsp";
    }
}
