package com.xworkz.dependencyinjection.components.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hotel {

    private int hotelId;
    private String hotelName;
    @Autowired
    private Floor floor;

    public Floor getFloor() {
        return floor;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", floor=" + floor +
                '}';
    }
}
