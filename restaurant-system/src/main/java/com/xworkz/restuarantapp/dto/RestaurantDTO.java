package com.xworkz.restuarantapp.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "restaurant_table")
public class RestaurantDTO implements Serializable {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "restaurant_name")
    private String restaurantName;
    @Column(name = "owner_name")
    private String ownerName;
    @Column(name = "contact_number")
    private Long contactNumber;
    @Column(name = "email")
    private String emailId;
    @Column(name = "restaurant_type")
    private String restaurantType;
    @Column(name = "restaurant_address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "restaurant_timings")
    private String restaurantTimings;
    @Column(name = "food_type")
    private String foodType;
    @Column(name = "restaurant_ratings")
    private double rating;

}
