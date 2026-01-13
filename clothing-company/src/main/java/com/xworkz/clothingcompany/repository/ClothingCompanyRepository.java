package com.xworkz.clothingcompany.repository;

import com.xworkz.clothingcompany.entity.ClothEntity;

import java.util.List;
import java.util.Optional;

public interface ClothingCompanyRepository {


    boolean save(ClothEntity clothEntity);

    Optional<ClothEntity> findClothInfoById(int id);

    boolean updatePriceById(int cId, double updatedPrice);

    boolean deleteById(int clothId);

    Optional<ClothEntity> findClothInfoByCategory(String clothCategory);

    Optional<ClothEntity> findClothInfoByClothName(String clothName);

    Optional<ClothEntity> findClothInfoByBrandName(String brandName);

    Optional<ClothEntity> findClothInfoBySize(String cSize);

    Optional<ClothEntity> findClothInfoByColor(String clothColor);

    List<ClothEntity> filterClothsByCategory(String cCategory);

    List<ClothEntity> filterClothsByBrand(String bName);

    List<Object[]> findClothNameAndBrandAndPriceByCategory(String catgryName);

    List<Object[]> fetchClothsListByCategoryAndPriceRange(String catName, double minPrice, double maxPrice);

    List<ClothEntity> getClothsListByCategoryAndSize(String categoryName, String clSize);

    List<ClothEntity> getAllClothesDetails();

    List<String> getAllClothesName();

    List<String> getAllBrandNames();

    List<String> getAllCategories();

    List<ClothEntity> getClothsListByCategoryAndColor(String categoryName1, String color1);

    List<ClothEntity> fetchClothsListByCategoryBrandAndPriceRange(String ctName, String bName1, double minPrice1, double maxPrice1);

    boolean checkDuplicateClothEntry(String clothName);
}
