package com.xworkz.restuarantapp.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RestaurantDTO implements Serializable {

    private int id;
    private String restaurantName;
    private String ownerName;
    private Long contactNumber;
    private String emailId;
    private String restaurantType;
    private String address;
    private String city;
    private String restaurantTimings;
    private String foodType;
    private double rating;

}
