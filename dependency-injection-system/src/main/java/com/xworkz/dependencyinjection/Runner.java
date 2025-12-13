package com.xworkz.dependencyinjection;

import com.xworkz.dependencyinjection.components.hospital.Hospital;
import com.xworkz.dependencyinjection.components.hotel.Hotel;
import com.xworkz.dependencyinjection.conf.ComponentConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main( String[] args ) {
        System.out.println("Main started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);

        Hospital hospital = applicationContext.getBean(Hospital.class);
        hospital.setHospitalId(1);
        hospital.setHospitalName("Apollo Hospitals");
        hospital.setPatient(hospital.getPatient());
        System.out.println("Hospital : "+hospital);

        Hospital hospital1 = applicationContext.getBean(Hospital.class);
        hospital1.setHospitalId(2);
        hospital1.setHospitalName("RK Hospitals");
        hospital1.setPatient(hospital1.getPatient());
        System.out.println("Hospital1 : "+hospital1);

        System.out.println();
        Hotel hotel = applicationContext.getBean(Hotel.class);
        hotel.setHotelId(1);
        hotel.setHotelName("Nakshatra");
        hotel.setFloor(hotel.getFloor());
        System.out.println("Hotel : "+hotel);

        Hotel hotel1 = applicationContext.getBean(Hotel.class);
        hotel1.setHotelId(2);
        hotel1.setHotelName("Taj Krishna");
        hotel1.setFloor(hotel1.getFloor());
        System.out.println("Hotel1 : "+ hotel1);

        System.out.println("Main ended");
    }
}
