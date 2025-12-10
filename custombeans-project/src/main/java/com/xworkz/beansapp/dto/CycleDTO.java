package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CycleDTO {

    private int cycleId;
    private String brand;
    private String type;
    private int gearCount;
    private double price;
    private String frameMaterial;
    private String color;
    private int wheelSize;

}
