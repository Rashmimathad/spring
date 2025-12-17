package com.xworkz.productapp.repository.impl;

import com.xworkz.productapp.constants.DBConstants;
import com.xworkz.productapp.dto.ProductDTO;
import com.xworkz.productapp.repository.ProductRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@Component
public class ProductRepositoryImpl implements ProductRepository {


    @Override
    @SneakyThrows
    public boolean save(ProductDTO productDTO) {

        boolean isSaved = false;
        String insertQuery = "insert into product_table(product_name,product_brand_name,product_price,product_quantity) values (?,?,?,?);";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);){

            preparedStatement.setString(1,productDTO.getProductName());
            preparedStatement.setString(2,productDTO.getBrandName());
            preparedStatement.setDouble(3,productDTO.getProductPrice());
            preparedStatement.setInt(4,productDTO.getProductQuantity());

             int rowsAffected = preparedStatement.executeUpdate();
             if (rowsAffected>0){
                 isSaved = true;
                 System.out.println("Rows Affected : "+rowsAffected);
             }
        }

        return isSaved;
    }
}
