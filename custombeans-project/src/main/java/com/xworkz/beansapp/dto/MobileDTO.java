package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class MobileDTO {

    private int mobileId;
    private String brand;
    private String model;
    private int ramGB;
    private int storageGB;
    private double price;
    private String processor;
    private int batteryMah;

}
