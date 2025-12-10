package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class FridgeDTO {

    private int fridgeId;
    private String brand;
    private int capacityLiters;
    private String type;
    private double price;
    private String color;
    private boolean inverterTechnology;
    private int starRating;

}
