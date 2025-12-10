package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class DroneDTO {

    private int droneId;
    private String brand;
    private int rangeMeters;
    private int batteryMinutes;
    private double price;
    private boolean gps;
    private int cameraMP;
    private String type;

}
