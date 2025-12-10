package com.xworkz.beansapp.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class BagDTO {

    private int bagId;
    private String brand;
    private String type;
    private int capacityLiters;
    private String color;
    private String material;
    private double price;
    private boolean laptopCompatible;

}
