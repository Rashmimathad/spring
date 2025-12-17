package com.xworkz.productapp;

import com.xworkz.productapp.config.ProductConfiguration;
import com.xworkz.productapp.dto.ProductDTO;
import com.xworkz.productapp.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {
    public static void main(String[] args) {

        ProductDTO productDTO = new ProductDTO("Mobile","Samsung",25000.00,1);
        ProductDTO productDTO1 = new ProductDTO("Crop Top","Tokyo Talkies",250.00,3);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);

        ProductService productService = applicationContext.getBean(ProductService.class);
//        productService.validateAndSave(productDTO);
        productService.validateAndSave(productDTO1);
    }
}
