package com.xworkz.productapp.repository;

import com.xworkz.productapp.dto.ProductDTO;

public interface ProductRepository {

    boolean save(ProductDTO productDTO);
}
