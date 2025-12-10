package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ShoppingMallDTO {

    private int mallId;
    private String name;
    private String location;
    private int numberOfShops;
    private int floors;
    private boolean parkingAvailable;
    private double areaSqFt;
    private int establishedYear;

}
