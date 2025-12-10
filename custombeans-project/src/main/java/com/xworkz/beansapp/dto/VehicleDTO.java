package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class VehicleDTO {

    private int vehicleId;
    private String vehicleName;
    private String vehicleModel;
    private String vehicleType;
    private String fuelType;
    private int fuelCapacity;
    private double price;
    private int registrationYear;

}
