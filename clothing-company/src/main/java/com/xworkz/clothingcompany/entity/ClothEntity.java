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
        @NamedQuery(name = "findClothInfoByCategory",query = "select cloth from ClothEntity cloth where cloth.categoryName=:categoryName AND cloth.isDeleted=0"),
        @NamedQuery(name = "findClothInfoByClothName",query = "select cloth from ClothEntity cloth where cloth.clothName=:cName AND cloth.isDeleted=0"),
        @NamedQuery(name = "findClothInfoByBrandName",query = "select cloth from ClothEntity cloth where cloth.brandName=:brand  AND cloth.isDeleted=0"),
        @NamedQuery(name = "findClothInfoBySize",query = "select cloth from ClothEntity cloth where cloth.size=:size  AND cloth.isDeleted=0"),
        @NamedQuery(name = "findClothInfoByColor",query = "select cloth from ClothEntity cloth where cloth.color=:color  AND cloth.isDeleted=0"),
        @NamedQuery(name = "filterClothsByCategory",query = "select cloth from ClothEntity cloth where cloth.categoryName=:cCategory AND cloth.isDeleted=0"),
        @NamedQuery(name = "filterClothsByBrand",query = "select cloth from ClothEntity cloth where cloth.brandName=:bName AND cloth.isDeleted=0"),
        @NamedQuery(name = "findClothNameAndBrandAndPriceByCategory",query = "select cloth.clothName,cloth.size,cloth.brandName,cloth.price from ClothEntity cloth where cloth.categoryName=:cName AND cloth.isDeleted=0"),
        @NamedQuery(name = "fetchClothsListByCategoryAndPriceRange",query = "select cloth.clothId,cloth.clothName,cloth.size,cloth.brandName,cloth.price from ClothEntity cloth where cloth.categoryName=:cName AND cloth.price between :min AND :max AND cloth.isDeleted=0"),
        @NamedQuery(name = "getClothsListByCategoryAndSize",query = "select cloth from ClothEntity cloth where cloth.categoryName=:categoryName and cloth.size=:cSize AND cloth.isDeleted=0"),
        @NamedQuery(name = "getAllClothesDetails",query = "select cloth from ClothEntity cloth where cloth.isDeleted=0"),
        @NamedQuery(name = "getAllClothesName",query = "select distinct cloth.clothName from ClothEntity cloth where cloth.isDeleted=0"),
        @NamedQuery(name = "getAllBrandNames",query = "select distinct cloth.brandName from ClothEntity cloth where cloth.isDeleted=0"),
        @NamedQuery(name = "getAllCategories",query = "select distinct cloth.categoryName from ClothEntity cloth where cloth.isDeleted=0"),
        @NamedQuery(name = "getClothsListByCategoryAndColor",query = "select cloth from ClothEntity cloth where cloth.categoryName=:categoryName AND cloth.color=:color AND cloth.isDeleted=0"),
        @NamedQuery(name = "fetchClothsListByCategoryBrandAndPriceRange",query = "select cloth from ClothEntity cloth where cloth.categoryName=:cName and cloth.brandName=:brand AND cloth.price between :min and :max AND cloth.isDeleted=0"),
        @NamedQuery(name = "getDuplicateEntries", query = "select 1 from ClothEntity entity where entity.clothName=:clothName AND entity.isDeleted=0"),
        @NamedQuery(name = "deleteById",query = "update ClothEntity entity set entity.isDeleted=1 where entity.clothId=:id AND entity.isDeleted=0")
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
    @Column(name = "is_deleted")
    private boolean isDeleted;

}
