package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProductDTO {

    private int productId;
    private String productName;
    private String productDescription;
    private String productCategory;
    private double productPrice;
    private int productStock;
    private double productRating;
    private String manufacturerName;
}
