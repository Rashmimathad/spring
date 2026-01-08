package com.xworkz.clothingcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cloth_table")
public class ClothEntity {

    @Id
    @Column(name = "cloth_id")
    private int clothId;
    @Column(name = "cloth_name")
    private String clothName;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "size")
    private String size;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private double price;
    @Column(name = "stock_qty")
    private int stockQuantity;
    @Column(name = "availability_status")
    private String availabilityStatus;

}
