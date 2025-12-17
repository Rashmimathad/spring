package com.xworkz.productapp.service.impl;

import com.xworkz.productapp.dto.ProductDTO;
import com.xworkz.productapp.repository.ProductRepository;
import com.xworkz.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean validateAndSave(ProductDTO productDTO) {

        boolean isValidated = false;

        if (productDTO.getProductName()==null||productDTO.getProductName().isEmpty()||productDTO.getProductName().length()<3){
            System.err.println("Invalid Product Name");
        } else if (productDTO.getBrandName()==null||productDTO.getBrandName().isEmpty()||productDTO.getBrandName().length()<3) {
            System.err.println("Invalid Brand Name");
        } else if (productDTO.getProductPrice()<=0.0) {
            System.err.println("Invalid Price");
        } else if (productDTO.getProductQuantity()<=0) {
            System.err.println("Invalid Quantity");
        }else isValidated=true;

        if (isValidated){
            System.out.println("Product data validated");
            boolean isSaved = productRepository.save(productDTO);
            if (isSaved) System.out.println("Product data saved successfully!!");
            else System.err.println("Product data not saved successfully!!!");
        }else System.err.println("Product data not validated");

        return isValidated;
    }
}
