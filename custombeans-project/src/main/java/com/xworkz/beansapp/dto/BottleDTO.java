package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BottleDTO {

    private int bottleId;
    private String bottleBrandName;
    private String bottleColor;
    private String bottleMaterial;
    private int quantity;
    private int bottleCapacity;
    private double price;
    private String manufacturerName;
}
