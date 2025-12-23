package com.xworkz.restuarantapp.service.impl;

import com.xworkz.restuarantapp.dto.RestaurantDTO;
import com.xworkz.restuarantapp.repository.RestaurantRepository;
import com.xworkz.restuarantapp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;
import java.util.Optional;

@Component
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public boolean validateAndSave(RestaurantDTO dto) {

        boolean isValidated = false;
        if (dto.getRestaurantName() == null || dto.getRestaurantName().trim().isEmpty()) {
            System.err.println("Restaurant name is required");
        }
        else if (dto.getRestaurantName().length() < 3) {
            System.err.println("Restaurant name must be at least 3 characters");
        }
        else if (dto.getOwnerName() == null || dto.getOwnerName().trim().isEmpty()) {
            System.err.println("Owner name is required");
        }
        else if (dto.getContactNumber() == null) {
            System.err.println("Contact number is required");
        }
        else if (dto.getEmailId() == null || dto.getEmailId().trim().isEmpty()) {
            System.err.println("Email is required");
        }
        else if (dto.getRestaurantType() == null || dto.getRestaurantType().trim().isEmpty()) {
            System.err.println("Restaurant type is required");
        }
        else if (dto.getAddress() == null || dto.getAddress().trim().isEmpty()) {
            System.err.println("Address is required");
        }
        else if (dto.getCity() == null || dto.getCity().trim().isEmpty()) {
            System.err.println("City is required");
        }

       else  if (dto.getRestaurantTimings() == null || dto.getRestaurantTimings().trim().isEmpty()) {
            System.err.println("Restaurant timings are required");
        }

        else if (dto.getFoodType() == null || dto.getFoodType().trim().isEmpty()) {
            System.err.println("Food type is required");
        }

        else if (dto.getRating() < 0 || dto.getRating() > 5) {
            System.err.println("Rating must be between 0 and 5");
        }else {
            isValidated=true;
        }
        if (isValidated) {
            boolean isSaved = restaurantRepository.save(dto);
            if (isSaved)
                System.out.println(dto);
            else System.err.println("Data not saved");
        }
        else System.err.println("Data not validated");
        return true;
    }

    @Override
    public Optional<RestaurantDTO> getRestaurantInfo(String restaurantName) {

        if (restaurantName!=null||!restaurantName.isEmpty()){
            return restaurantRepository.getRestaurantInfo(restaurantName);
        }
        return Optional.empty();
    }
}
