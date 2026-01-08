package com.xworkz.clothingcompany.service;

import com.xworkz.clothingcompany.dto.ClothDTO;

import java.util.List;
import java.util.Optional;

public interface ClothingCompanyService {


    boolean validateAndSave(ClothDTO clothDTO);

    Optional<ClothDTO> findClothInfoById(int id);

    boolean updatePriceById(int cId, double updatedPrice);

    boolean deleteById(int clothId);

    Optional<ClothDTO> findClothInfoByCategory(String clothCategory);

    Optional<ClothDTO> findClothInfoByClothName(String clothName);

    Optional<ClothDTO> findClothInfoByBrandName(String brandName);

    Optional<ClothDTO> findClothInfoBySize(String cSize);

    Optional<ClothDTO> findClothInfoByColor(String clothColor);

    List<ClothDTO> filterClothsByCategory(String cCategory);

    List<ClothDTO> filterClothsByBrand(String bName);

    List<Object[]> findClothNameAndBrandAndPriceByCategory(String catgryName);

    List<Object[]> fetchClothsListByCategoryAndPriceRange(String catName, double minPrice, double maxPrice);

    List<ClothDTO> getClothsListByCategoryAndSize(String categoryName, String clSize);

    List<ClothDTO> getAllClothesDetails();

    List<String> getAllClothesName();

    List<String> getAllBrandNames();

    List<String> getAllCategories();

    List<ClothDTO> getClothsListByCategoryAndColor(String categoryName1, String color1);

    List<ClothDTO> fetchClothsListByCategoryBrandAndPriceRange(String ctName, String bName1, double minPrice1, double maxPrice1);
}
