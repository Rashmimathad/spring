package com.xworkz.ticketbookingapp.repository.impl;

import com.xworkz.ticketbookingapp.constants.DBConstants;
import com.xworkz.ticketbookingapp.dto.TicketBookingDTO;
import com.xworkz.ticketbookingapp.repository.TicketBookingRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@Component
public class TicketBookingRepositoryImpl implements TicketBookingRepository {


    @Override
    @SneakyThrows
    public boolean save(TicketBookingDTO ticketBookingDTO) {
        boolean isSaved = false;

        String insertQuery = "insert into ticket_booking_table(user_name,user_age,user_gender,source,destination,ticket_price) values (?,?,?,?,?,?);";

        try(Connection connection = DriverManager.getConnection(DBConstants.DB.getUrl(),DBConstants.DB.getUserName(), DBConstants.DB.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);){

            preparedStatement.setString(1,ticketBookingDTO.getUserName());
            preparedStatement.setInt(2,ticketBookingDTO.getUserAge());
            preparedStatement.setString(3,ticketBookingDTO.getUserGender());
            preparedStatement.setString(4,ticketBookingDTO.getSource());
            preparedStatement.setString(5,ticketBookingDTO.getDestination());
            preparedStatement.setDouble(6,ticketBookingDTO.getTicketPrice());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected>0){
                System.out.println("Rows Affected : "+rowsAffected);
                isSaved = true;
            }else System.err.println("Data is not inserted");
        }

        return isSaved;
    }
}
