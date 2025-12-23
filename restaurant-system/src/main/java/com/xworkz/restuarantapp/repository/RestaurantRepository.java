package com.xworkz.restuarantapp.repository;

import com.xworkz.restuarantapp.dto.RestaurantDTO;

import java.util.Optional;

public interface RestaurantRepository {

    boolean save(RestaurantDTO restaurantDTO);

    Optional<RestaurantDTO> getRestaurantInfo(String restaurantName);
}
