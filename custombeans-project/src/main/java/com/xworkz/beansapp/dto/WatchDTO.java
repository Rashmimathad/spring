package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class WatchDTO {

    private int watchId;
    private String brand;
    private String type;
    private String strapMaterial;
    private double price;
    private boolean waterResistant;
    private String color;
    private double dialSize;

}
