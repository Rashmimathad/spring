package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CameraDTO {

    private int cameraId;
    private String brand;
    private String model;
    private int megaPixels;
    private boolean dslr;
    private double price;
    private String lensType;
    private int batteryLifeShots;

}
