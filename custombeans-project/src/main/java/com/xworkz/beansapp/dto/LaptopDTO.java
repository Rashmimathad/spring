package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class LaptopDTO {

    private int laptopId;
    private String brand;
    private String model;
    private String processor;
    private int ramGB;
    private int storageGB;
    private double price;
    private boolean touchScreen;

}
