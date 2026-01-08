package com.xworkz.clothingcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cloth_table")
@NamedQueries({
        @NamedQuery(name = "findClothInfoByCategory",query = "select cloth from ClothEntity cloth where cloth.categoryName=:categoryName"),
        @NamedQuery(name = "findClothInfoByClothName",query = "select cloth from ClothEntity cloth where cloth.clothName=:cName"),
        @NamedQuery(name = "findClothInfoByBrandName",query = "select cloth from ClothEntity cloth where cloth.brandName=:brand"),
        @NamedQuery(name = "findClothInfoBySize",query = "select cloth from ClothEntity cloth where cloth.size=:size"),
        @NamedQuery(name = "findClothInfoByColor",query = "select cloth from ClothEntity cloth where cloth.color=:color"),
        @NamedQuery(name = "filterClothsByCategory",query = "select cloth from ClothEntity cloth where cloth.categoryName=:cCategory"),
        @NamedQuery(name = "filterClothsByBrand",query = "select cloth from ClothEntity cloth where cloth.brandName=:bName"),
        @NamedQuery(name = "findClothNameAndBrandAndPriceByCategory",query = "select cloth.clothName,cloth.size,cloth.brandName,cloth.price from ClothEntity cloth where cloth.categoryName=:cName"),
        @NamedQuery(name = "fetchClothsListByCategoryAndPriceRange",query = "select cloth.clothName,cloth.size,cloth.brandName,cloth.price from ClothEntity cloth where cloth.categoryName=:cName and cloth.price between :min and :max"),
        @NamedQuery(name = "getClothsListByCategoryAndSize",query = "select cloth from ClothEntity cloth where cloth.categoryName=:categoryName and cloth.size=:cSize"),
        @NamedQuery(name = "getAllClothesDetails",query = "select cloth from ClothEntity cloth"),
        @NamedQuery(name = "getAllClothesName",query = "select distinct cloth.clothName from ClothEntity cloth"),
        @NamedQuery(name = "getAllBrandNames",query = "select distinct cloth.brandName from ClothEntity cloth"),
        @NamedQuery(name = "getAllCategories",query = "select distinct cloth.categoryName from ClothEntity cloth"),
        @NamedQuery(name = "getClothsListByCategoryAndColor",query = "select cloth from ClothEntity cloth where cloth.categoryName=:categoryName and cloth.color=:color"),
        @NamedQuery(name = "fetchClothsListByCategoryBrandAndPriceRange",query = "select cloth from ClothEntity cloth where cloth.categoryName=:cName and cloth.brandName=:brand and cloth.price between :min and :max")
})
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
