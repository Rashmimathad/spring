package com.xworkz.clothingcompany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClothDTO {

    private int clothId;
    private String clothName;
    private String brandName;
    private String categoryName;
    private String size;
    private String color;
    private double price;
    private int stockQuantity;
    private String availabilityStatus;

    public ClothDTO(String clothName, String brandName, String categoryName, String size, String color, double price, int stockQuantity, String availabilityStatus) {
        this.clothName = clothName;
        this.brandName = brandName;
        this.categoryName = categoryName;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.availabilityStatus = availabilityStatus;
    }
}
