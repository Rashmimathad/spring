package com.xworkz.productapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProductDTO {

    private int id;
    private String productName;
    private String brandName;
    private double productPrice;
    private int productQuantity;

    public ProductDTO(String productName, String brandName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.brandName = brandName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
}
