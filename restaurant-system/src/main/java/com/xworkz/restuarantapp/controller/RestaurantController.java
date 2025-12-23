package com.xworkz.restuarantapp.controller;

import com.xworkz.restuarantapp.dto.RestaurantDTO;
import com.xworkz.restuarantapp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Component
@RequestMapping("/")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    public RestaurantController(){
        System.out.println("RestaurantController object created");
    }


    @PostMapping("/addRestaurant")
    public String addRestaurant(RestaurantDTO restaurantDTO){
       boolean isValidatedAndSaved =  restaurantService.validateAndSave(restaurantDTO);
       if (isValidatedAndSaved)
        return "RegisterSuccess.jsp";
       else return "RegisterFailure.jsp";
    }

    @RequestMapping("/registerpage")
    public String getRegisterPage(){
        return "RegisterationForm.jsp";
    }

    @RequestMapping("/searchPage")
    public String getSearchPage(){
        return "Search.jsp";
    }

    @GetMapping("/searchByRestaurantName")
    public String getRestaurantInfo(@RequestParam("restaurantName") String restaurantName, Model model){

        Optional<RestaurantDTO> restaurantDTO = restaurantService.getRestaurantInfo(restaurantName);
        if (restaurantDTO.isPresent()){
            System.out.println(restaurantDTO.get());
            model.addAttribute("restaurant",restaurantDTO.get());
        }else{
            model.addAttribute("errorMsg","Restaurant not found!!!");
        }
        return "Search.jsp";
    }



}
