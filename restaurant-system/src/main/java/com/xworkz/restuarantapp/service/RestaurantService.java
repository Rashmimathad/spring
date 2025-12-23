package com.xworkz.restuarantapp.service;

import com.xworkz.restuarantapp.dto.RestaurantDTO;

import java.util.Optional;

public interface RestaurantService {

    boolean validateAndSave(RestaurantDTO restaurantDTO);

    Optional<RestaurantDTO> getRestaurantInfo(String ownerName);
}
