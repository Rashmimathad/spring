package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ShoeDTO{

    private int shoeId;
    private String brand;
    private String type;
    private double price;
    private String color;
    private int size;
    private String material;
    private boolean waterproof;

}
