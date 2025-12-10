package com.xworkz.beansapp.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AirConditionerDTO {

    private int acId;
    private String brand;
    private double tonnage;
    private int starRating;
    private boolean inverter;
    private double price;
    private String type;
    private String color;

}
