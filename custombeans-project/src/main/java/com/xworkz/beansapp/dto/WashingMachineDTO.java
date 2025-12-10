package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class WashingMachineDTO {

    private int machineId;
    private String brand;
    private String type;
    private int capacityKg;
    private int rpm;
    private double price;
    private boolean inverterMotor;
    private int starRating;

}
