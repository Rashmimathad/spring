package com.xworkz.beansapp.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class RestaurantDTO {


    private int restaurantId;
    private String name;
    private String cuisineType;
    private String location;
    private double rating;
    private boolean vegOnly;
    private int seatingCapacity;
    private int establishedYear;


}
