package com.xworkz.clothingcompany.service.impl;

import com.xworkz.clothingcompany.dto.ClothDTO;
import com.xworkz.clothingcompany.entity.ClothEntity;
import com.xworkz.clothingcompany.repository.ClothingCompanyRepository;
import com.xworkz.clothingcompany.repository.impl.ClothingCompanyRepositoryImpl;
import com.xworkz.clothingcompany.service.ClothingCompanyService;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ClothingCompanyServiceImpl implements ClothingCompanyService {

    ClothingCompanyRepository clothingCompanyRepository = new ClothingCompanyRepositoryImpl();


    @Override
    public boolean validateAndSave(ClothDTO clothDTO) {
        boolean isValidated = validateClothInfo(clothDTO);

        if (isValidated){
            ClothEntity clothEntity = new ClothEntity();
            BeanUtils.copyProperties(clothDTO,clothEntity);
            boolean isSaved = clothingCompanyRepository.save(clothEntity);
            if (isSaved) System.out.println("Data Saved Successfully!!!");
            else System.err.println("Failed to save data");
        }else System.err.println("Data not validated");
        return isValidated;
    }

    @Override
    public Optional<ClothDTO> findClothInfoById(int id) {
        if (id>0){
            ClothDTO clothDTO = new ClothDTO();

           Optional<ClothEntity> clothEntity = clothingCompanyRepository.findClothInfoById(id);
           BeanUtils.copyProperties(clothEntity.get(),clothDTO);
           return Optional.of(clothDTO);
        }else System.err.println("Invalid Id");
        return Optional.empty();
    }

    @Override
    public boolean updatePriceById(int cId, double updatedPrice) {
        boolean isValidated=false;
        if(cId<=0){
            System.err.println("Invalid Id");
        } else if (updatedPrice<=0.0) {
            System.err.println("Invalid Price");
        }else {
            isValidated = true;
            boolean isUpdated = clothingCompanyRepository.updatePriceById(cId,updatedPrice);
            if (isUpdated) System.out.println("Cloth Price updated successfully!!");
            else System.err.println("Failed to update Price by Id");
        }


        return isValidated;
    }

    @Override
    public boolean deleteById(int clothId) {
        boolean isDeleted=false;
        if (clothId>0){
            isDeleted = clothingCompanyRepository.deleteById(clothId);
            if (isDeleted) System.out.println("Cloth Data deleted successfully!!!");
            else System.err.println("Failed to delete data");
        }
        return isDeleted;
    }



    @Override
    public Optional<ClothDTO> findClothInfoByCategory(String clothCategory) {
        if (clothCategory!=null||!clothCategory.isEmpty()){
            ClothDTO clothDTO = new ClothDTO();
            Optional<ClothEntity> clothEntity = clothingCompanyRepository.findClothInfoByCategory(clothCategory);
            BeanUtils.copyProperties(clothEntity.get(),clothDTO);
            return Optional.of(clothDTO);
        }else System.err.println("Invalid Category");
        return Optional.empty();
    }

    @Override
    public Optional<ClothDTO> findClothInfoByClothName(String clothName) {
        if (clothName!=null||!clothName.isEmpty()){
            ClothDTO clothDTO = new ClothDTO();
            Optional<ClothEntity> clothEntity = clothingCompanyRepository.findClothInfoByClothName(clothName);
            BeanUtils.copyProperties(clothEntity.get(),clothDTO);
            return Optional.of(clothDTO);
        }else System.err.println("Invalid Category");
        return Optional.empty();
    }

    @Override
    public Optional<ClothDTO> findClothInfoByBrandName(String brandName) {
        if (brandName!=null||!brandName.isEmpty()){
            ClothDTO clothDTO = new ClothDTO();
            Optional<ClothEntity> clothEntity = clothingCompanyRepository.findClothInfoByBrandName(brandName);
            BeanUtils.copyProperties(clothEntity.get(),clothDTO);
            return Optional.of(clothDTO);
        }else System.err.println("Invalid brand name");
        return Optional.empty();
    }

    @Override
    public Optional<ClothDTO> findClothInfoBySize(String cSize) {
        if (cSize!=null||!cSize.isEmpty()){
            ClothDTO clothDTO = new ClothDTO();
            Optional<ClothEntity> clothEntity = clothingCompanyRepository.findClothInfoBySize(cSize);
            BeanUtils.copyProperties(clothEntity.get(),clothDTO);
            return Optional.of(clothDTO);
        }else System.err.println("Invalid size");
        return Optional.empty();
    }

    @Override
    public Optional<ClothDTO> findClothInfoByColor(String clothColor) {
        if (clothColor!=null||!clothColor.isEmpty()){
            ClothDTO clothDTO = new ClothDTO();
            Optional<ClothEntity> clothEntity = clothingCompanyRepository.findClothInfoByColor(clothColor);
            BeanUtils.copyProperties(clothEntity.get(),clothDTO);
            return Optional.of(clothDTO);
        }else System.err.println("Invalid color");
        return Optional.empty();
    }

    @Override
    public List<ClothDTO> filterClothsByCategory(String cCategory) {

        if (cCategory!=null||!cCategory.isEmpty()){
            List<ClothDTO> clothDTOList = new ArrayList<>();
            List<ClothEntity> clothEntities = clothingCompanyRepository.filterClothsByCategory(cCategory);
            clothEntities.stream().forEach(clothEntity -> {
                ClothDTO clothDTO = new ClothDTO();
                BeanUtils.copyProperties(clothEntity,clothDTO);
                clothDTOList.add(clothDTO);
            });
            return clothDTOList;
        }

        return Collections.emptyList();
    }

    @Override
    public List<ClothDTO> filterClothsByBrand(String bName) {
        if (bName!=null||!bName.isEmpty()){
            List<ClothDTO> clothDTOList = new ArrayList<>();
            List<ClothEntity> clothEntities = clothingCompanyRepository.filterClothsByBrand(bName);
            clothEntities.stream().forEach(clothEntity -> {
                ClothDTO clothDTO = new ClothDTO();
                BeanUtils.copyProperties(clothEntity,clothDTO);
                clothDTOList.add(clothDTO);
            });
            return clothDTOList;
        }

        return Collections.emptyList();
    }

    @Override
    public List<Object[]> findClothNameAndBrandAndPriceByCategory(String catgryName) {
        if (catgryName!=null||!catgryName.isEmpty()){
            List<Object[]> clothDetailsList = clothingCompanyRepository.findClothNameAndBrandAndPriceByCategory(catgryName);
            if (clothDetailsList!=null){
                return clothDetailsList;
            }else System.err.println("Data not Available!!!");
        }
        return Collections.emptyList();
    }

    @Override
    public List<Object[]> fetchClothsListByCategoryAndPriceRange(String catName, double minPrice, double maxPrice) {
        if (catName==null||catName.isEmpty()) {
            System.err.println("Invalid category");
        } else if (minPrice<=0.0) {
            System.err.println("Invalid minimum price");
        } else if (maxPrice<minPrice||maxPrice<=0.0) {
            System.err.println("Invalid maximum price");
        } else{
            List<Object[]> clothDetailsList = clothingCompanyRepository.fetchClothsListByCategoryAndPriceRange(catName,minPrice,maxPrice);
            if (clothDetailsList!=null){
                return clothDetailsList;
            }else System.err.println("Data not Available!!!");
        }
        return Collections.emptyList();
    }

    @Override
    public List<ClothDTO> getClothsListByCategoryAndSize(String categoryName, String clSize) {
        if (categoryName==null||categoryName.isEmpty()){
            System.err.println("Invalid category");
        } else if (clSize==null||clSize.isEmpty()) {
            System.err.println("Invalid size");
        }else {
            List<ClothDTO> clothDTOList = new ArrayList<>();
            List<ClothEntity> clothEntities = clothingCompanyRepository.getClothsListByCategoryAndSize(categoryName,clSize);
            if (clothEntities!=null){
                clothEntities.stream().forEach(clothEntity -> {
                    ClothDTO clothDTO = new ClothDTO();
                    BeanUtils.copyProperties(clothEntity,clothDTO);
                    clothDTOList.add(clothDTO);
                });
            }else System.err.println("Data Not Available");
            return clothDTOList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<ClothDTO> getAllClothesDetails() {
        List<ClothDTO> clothDTOS = new ArrayList<>();
        List<ClothEntity> clothEntities = clothingCompanyRepository.getAllClothesDetails();
        if (clothEntities!=null){
            clothEntities.stream().forEach(clothEntity -> {
                ClothDTO clothDTO = new ClothDTO();
                BeanUtils.copyProperties(clothEntity,clothDTO);
                clothDTOS.add(clothDTO);
            });
            return clothDTOS;
        }else System.err.println("Data Not Available!!!");

        return Collections.emptyList();
    }

    @Override
    public List<String> getAllClothesName() {
        List<String> clothNamesList = clothingCompanyRepository.getAllClothesName();
        if (clothNamesList !=null){
            return clothNamesList;
        }else System.err.println("Data Not Available!!!");

        return Collections.emptyList();
    }

    @Override
    public List<String> getAllBrandNames() {
        List<String> brandNamesList = clothingCompanyRepository.getAllBrandNames();
        if (brandNamesList !=null){
            return brandNamesList;
        }else System.err.println("Data Not Available!!!");
        return Collections.emptyList();
    }

    @Override
    public List<String> getAllCategories() {
        List<String> categoriesList = clothingCompanyRepository.getAllCategories();
        if (categoriesList !=null){
            return categoriesList;
        }else System.err.println("Data Not Available!!!");
        return Collections.emptyList();
    }

    @Override
    public List<ClothDTO> getClothsListByCategoryAndColor(String categoryName1, String color1) {
        if (categoryName1==null||categoryName1.isEmpty()){
            System.err.println("Invalid category");
        } else if (color1==null||color1.isEmpty()) {
            System.err.println("Invalid color");
        }else {
            List<ClothDTO> clothDTOList = new ArrayList<>();
            List<ClothEntity> clothEntities = clothingCompanyRepository.getClothsListByCategoryAndColor(categoryName1,color1);
            if (clothEntities!=null){
                clothEntities.stream().forEach(clothEntity -> {
                    ClothDTO clothDTO = new ClothDTO();
                    BeanUtils.copyProperties(clothEntity,clothDTO);
                    clothDTOList.add(clothDTO);
                });
            }else System.err.println("Data Not Available");
            return clothDTOList;
        }
        return Collections.emptyList();
    }

    @Override
    public List<ClothDTO> fetchClothsListByCategoryBrandAndPriceRange(String ctName, String bName1, double minPrice1, double maxPrice1) {
        if (ctName==null||ctName.isEmpty()) {
            System.err.println("Invalid category");
        } else if (bName1==null||bName1.isEmpty()) {
            System.err.println("Invalid brand name");
        } else if (minPrice1<=0.0) {
            System.err.println("Invalid minimum price");
        } else if (maxPrice1<minPrice1||maxPrice1<=0.0) {
            System.err.println("Invalid maximum price");
        }else {
            List<ClothDTO> clothDTOS = new ArrayList<>();
            List<ClothEntity> clothEntities = clothingCompanyRepository.fetchClothsListByCategoryBrandAndPriceRange(ctName,bName1,minPrice1,maxPrice1);
            if (clothEntities!=null){
                clothEntities.stream().forEach(clothEntity1 -> {
                    ClothDTO clothDTO = new ClothDTO();
                    BeanUtils.copyProperties(clothEntity1,clothDTO);
                    clothDTOS.add(clothDTO);
                });
                return clothDTOS;
            }else System.err.println("Data Not Available");
        }
        return Collections.emptyList();
    }

    private boolean validateClothInfo(ClothDTO clothDTO) {
        if (clothDTO.getClothName() == null || clothDTO.getClothName().trim().isEmpty()) {
            System.err.println("Invalid cloth name");
            return false;
        }

        if (clothDTO.getCategoryName() == null || clothDTO.getCategoryName().trim().isEmpty()) {
            System.err.println("Invalid category name");
            return false;
        }

        if (clothDTO.getSize() == null || clothDTO.getSize().trim().isEmpty()) {
            System.err.println("Invalid size");
            return false;
        }

        if (clothDTO.getColor() == null || clothDTO.getColor().trim().isEmpty()) {
            System.err.println("Invalid color");
            return false;
        }

        if (clothDTO.getPrice() <= 0) {
            System.err.println("Invalid price");
            return false;
        }

        if (clothDTO.getStockQuantity() < 0) {
            System.err.println("Invalid stock quantity");
            return false;
        }

        if (clothDTO.getAvailabilityStatus() == null
                || clothDTO.getAvailabilityStatus().trim().isEmpty()) {
            System.err.println("Invalid availability status");
            return false;
        }

        return true;
    }
}
