package com.xworkz.restuarantapp.repository.impl;

import com.xworkz.restuarantapp.constants.DBConstants;
import com.xworkz.restuarantapp.dto.RestaurantDTO;
import com.xworkz.restuarantapp.repository.RestaurantRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.Optional;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {


    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean save(RestaurantDTO dto) {
        String query = "INSERT INTO restaurant_table" +
                "(restaurant_name, owner_name, contact_number, email, restaurant_type, " +
                "restaurant_address, city, restaurant_timings, food_type, restaurant_ratings) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (
                Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(),DBConstants.DB.getPassword());
                PreparedStatement ps = connection.prepareStatement(query)
        ) {

            ps.setString(1, dto.getRestaurantName());
            ps.setString(2, dto.getOwnerName());
            ps.setLong(3, dto.getContactNumber());
            ps.setString(4, dto.getEmailId());
            ps.setString(5, dto.getRestaurantType());
            ps.setString(6, dto.getAddress());
            ps.setString(7, dto.getCity());
            ps.setString(8, dto.getRestaurantTimings());
            ps.setString(9, dto.getFoodType());
            ps.setDouble(10, dto.getRating());

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    @SneakyThrows
    public Optional<RestaurantDTO> getRestaurantInfo(String restaurantName) {
        String searchQuery = "select * from restaurant_table where restaurant_name=?;";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(searchQuery)){
            preparedStatement.setString(1,restaurantName);

            ResultSet set = preparedStatement.executeQuery();
            if (set.next()){
              int id =  set.getInt(1);
              String name =  set.getString(2);
              String owner =  set.getString(3);
              long contactNo =  set.getLong(4);
              String email =  set.getString(5);
              String restaurantType =   set.getString(6);
              String address =   set.getString(7);
              String city =  set.getString(8);
              String timings =  set.getString(9);
              String foodType =  set.getString(10);
              double ratings =  set.getDouble(11);

              RestaurantDTO restaurantDTO = new RestaurantDTO(id,name,owner,contactNo,email,restaurantType,address,city,timings,foodType,ratings);
              return Optional.of(restaurantDTO);
            }
        }

        return Optional.empty();
    }
}
