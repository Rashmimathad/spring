package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDTO;

public interface ProductService {

    boolean validateAndSave(ProductDTO productDTO);
}
