package com.xworkz.clothingcompany.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.clothingcompany.dto.ClothDTO;
import com.xworkz.clothingcompany.exceptions.DataInvalidException;
import com.xworkz.clothingcompany.exceptions.DataNotFoundException;
import com.xworkz.clothingcompany.exceptions.DuplicateEntryException;
import com.xworkz.clothingcompany.service.ClothingCompanyService;
import com.xworkz.clothingcompany.util.NumberValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClothingCompanyController {

    @Autowired
    private ClothingCompanyService clothingCompanyService;

    public ClothingCompanyController(){
        System.out.println("ClothingCompanyController created");
    }

    @RequestMapping("/index")
    public String getHomePage(){
        return "/index.jsp";
    }

    @RequestMapping("/signUpPage")
    public String getRegisterPage(){
        return "RegistrationPage.jsp";
    }

    @RequestMapping("/searchPage")
    public String getSearchPage(){
        return "Search.jsp";
    }

    @RequestMapping("/filter")
    public String getFilterPage(){
        return "Filter.jsp";
    }

    @RequestMapping("/filterByBrandPage")
    public String getBrandFilterPage(){
        return "FilterByBrand.jsp";
    }

    @RequestMapping("/filterByCategoryPage")
    public String getCategoryFilterPage(){
        return "FilterByCategory.jsp";
    }

    @RequestMapping("/filterByCategoryAndPricePage")
    public String getCategoryAndPriceFilterPage(){
        return "FilterByCategoryAndPrice.jsp";
    }

    @PostMapping("/registerCloth")
    public String addCloth( ClothDTO clothDTO, Model model) {

        System.out.println("DTO from Register Page : " + clothDTO);

        try {
            clothingCompanyService.validateAndSave(clothDTO);

            System.out.println("Saved DTO : " + clothDTO);
            model.addAttribute("successMessage", "Data Saved Successfully!!!");

        } catch (DataInvalidException | DuplicateEntryException e) {

            model.addAttribute("errorMessage", e.getMessage());
            System.err.println("Data not validated and saved");
            e.printStackTrace();
        }

        return "RegisterResponse.jsp";
    }

    @GetMapping("/searchByClothName")
    public String getClothInfoByName(@RequestParam("clothName")String clothName,@RequestParam("submitType")String submitType, Model model){
        try {
            if ("clear".equalsIgnoreCase(submitType)){
                model.addAttribute("clothInfo", null);
            }else {
                Optional<ClothDTO> clothDTO = clothingCompanyService.findClothInfoByClothName(clothName);
                if (clothDTO.isPresent()) {
                    System.out.println(clothDTO.get());
                    model.addAttribute("clothInfo", clothDTO.get());
                }
            }
        } catch (DataNotFoundException e) {
            model.addAttribute("errorMessage", e.getMessage());
        }
        return "Search.jsp";
    }

    @GetMapping("edit/{id}")
    public String getClothInfoById(@PathVariable("id")String id, Model model){
        Optional<ClothDTO> clothDTO = clothingCompanyService.findClothInfoById(NumberValidation.parseIntSafe(id));
        if (clothDTO.isPresent()) {
            System.out.println(clothDTO.get());
            model.addAttribute("clothInfo", clothDTO.get());
        }
        return "/Update.jsp";
    }

    @PostMapping("/updateClothInfo")
    public String updateClothInfo(ClothDTO clothDTO,Model model){
        boolean isUpdated = clothingCompanyService.updatePriceById(clothDTO.getClothId(),clothDTO.getPrice());
        if (isUpdated) {
            System.out.println("Updated Successfully!!!");
            model.addAttribute("successMsg","Updated Successfully!!!");
        }else {
            model.addAttribute("errorMsg","Failed to update!!!");
        }
        return "Update.jsp";
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable("id")String id,Model model){

        try{
             boolean isDeleted = clothingCompanyService.deleteById(NumberValidation.parseIntSafe(id));
            if (isDeleted){
                System.out.println("Deleted Successfully!!");
                model.addAttribute("successMessage","Cloth with id "+id+" deleted Successfully!!!");
            }
        }catch (DataNotFoundException e){
            model.addAttribute("errorMessage",e.getMessage());
        }
        return "/DeleteResponse.jsp";
    }

    @GetMapping("/filterByBrandName")
    public String filterClothsByBrandName(@RequestParam("brandName")String brandName,@RequestParam("submitType")String submitType, Model model){
        try {
            if ("clear".equalsIgnoreCase(submitType)){
                model.addAttribute("clothsListByBrand", null);
            }else {
                List<ClothDTO> clothsList = clothingCompanyService.filterClothsByBrand(brandName);
                if (clothsList!=null) {
                    System.out.println("Cloths List filtered by Brand Name : ");
                    clothsList.forEach(clothDTO -> {
                        System.out.println(clothDTO);
                    });
                    model.addAttribute("clothsListByBrand", clothsList);
                }
            }
        } catch (DataNotFoundException e) {
            model.addAttribute("errorMessage", e.getMessage());
        }
        return "FilterByBrand.jsp";
    }

    @GetMapping("/filterByCategoryName")
    public String filterClothsByCategoryName(@RequestParam("categoryName")String categoryName,@RequestParam("submitType")String submitType, Model model){
        try {
            if ("clear".equalsIgnoreCase(submitType)){
                model.addAttribute("clothsListByCategory", null);
            }else {
                List<ClothDTO> clothsList = clothingCompanyService.filterClothsByCategory(categoryName);
                if (clothsList!=null) {
                    System.out.println("Cloths List filtered by Category Name : ");
                    clothsList.forEach(clothDTO -> {
                        System.out.println(clothDTO);
                    });
                    model.addAttribute("clothsListByCategory", clothsList);
                }
            }
        } catch (DataNotFoundException e) {
            model.addAttribute("errorMessage", e.getMessage());
        }
        return "FilterByCategory.jsp";
    }

    @RequestMapping("/filterByCategoryNameAndPrice")
    public String filterByCategoryNameAndPrice(@RequestParam("categoryName")String categoryName,@RequestParam("minPrice")String minPrice,@RequestParam("maxPrice")String maxPrice,@RequestParam("submitType")String submitType,Model model){

        try {
            if ("clear".equalsIgnoreCase(submitType)&&(minPrice == null || maxPrice == null)){
                model.addAttribute("clothsListByCategoryAndPrice", null);
            }else {
                List<Object[]> clothsList = clothingCompanyService.fetchClothsListByCategoryAndPriceRange(categoryName, NumberValidation.parseDoubleSafe(minPrice), NumberValidation.parseDoubleSafe(maxPrice));
                if (clothsList != null) {
                    System.out.println("Cloths List filtered by Category Name And Price : ");
                    clothsList.forEach(clothDTO -> {
                        System.out.println(clothDTO);
                    });
                    model.addAttribute("clothsListByCategoryAndPrice", clothsList);
                } else if (minPrice == null || maxPrice == null) {
                    model.addAttribute("errorMessage", "Please enter min and max price");
                }
            }
        } catch (DataNotFoundException e) {
            model.addAttribute("errorMessage", e.getMessage());
        }
        return "FilterByCategoryAndPrice.jsp";
    }
}
