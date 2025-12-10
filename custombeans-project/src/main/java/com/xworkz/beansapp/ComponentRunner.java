package com.xworkz.beansapp;


import com.xworkz.beansapp.config.CoreConfiguration;
import com.xworkz.beansapp.dto.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ComponentRunner{
    public static void main( String[] args ){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);


        List<AirConditionerDTO> airConditionerDTOList = (List<AirConditionerDTO>) applicationContext.getBean("airConditioners");
        System.out.println("Air Conditioners List : ");
        airConditionerDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<BagDTO> bagDTOList = (List<BagDTO>) applicationContext.getBean("bags");
        System.out.println("Bags List : ");
        bagDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<BookDTO> bookDTOList = (List<BookDTO>) applicationContext.getBean("books");
        System.out.println("Books List : ");
        bookDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<BottleDTO> bottleDTOList = (List<BottleDTO>) applicationContext.getBean("bottles");
        System.out.println("Bottles List : ");
        bottleDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<CameraDTO> cameraDTOList = (List<CameraDTO>) applicationContext.getBean("cameras");
        System.out.println("Cameras List : ");
        cameraDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<CustomerDTO> customerDTOList = (List<CustomerDTO>) applicationContext.getBean("customers");
        System.out.println("Customers List : ");
        customerDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<CycleDTO> cycleDTOList = (List<CycleDTO>) applicationContext.getBean("cycles");
        System.out.println("Cycles List : ");
        cycleDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<DroneDTO> droneDTOList = (List<DroneDTO>) applicationContext.getBean("drones");
        System.out.println("Drones List : ");
        droneDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<EmployeeDTO> employeeDTOList = (List<EmployeeDTO>) applicationContext.getBean("employees");
        System.out.println("Employees List : ");
        employeeDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<FridgeDTO> fridgeDTOList = (List<FridgeDTO>) applicationContext.getBean("fridges");
        System.out.println("Fridges List : ");
        fridgeDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<HospitalDTO> hospitalDTOList = (List<HospitalDTO>) applicationContext.getBean("hospitals");
        System.out.println("Hospitals List : ");
        hospitalDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<InvoiceDTO> invoiceDTOList = (List<InvoiceDTO>) applicationContext.getBean("invoices");
        System.out.println("Invoices List : ");
        invoiceDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<LaptopDTO> laptopDTOList = (List<LaptopDTO>) applicationContext.getBean("laptops");
        System.out.println("Laptops List : ");
        laptopDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<LibraryDTO> libraryDTOList = (List<LibraryDTO>) applicationContext.getBean("libraries");
        System.out.println("Libraries List : ");
        libraryDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<MedicalStoreDTO> medicalStoreDTOList = (List<MedicalStoreDTO>) applicationContext.getBean("medicalStores");
        System.out.println("Medical Stores List : ");
        medicalStoreDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<MobileDTO> mobileDTOList = (List<MobileDTO>) applicationContext.getBean("mobiles");
        System.out.println("Mobiles List : ");
        mobileDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<MovieDTO> movieDTOList = (List<MovieDTO>) applicationContext.getBean("movies");
        System.out.println("Movies List : ");
        movieDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<OrderDTO> orderDTOList = (List<OrderDTO>) applicationContext.getBean("orders");
        System.out.println("Orders List : ");
        orderDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<ProductDTO> productDTOList = (List<ProductDTO>) applicationContext.getBean("products");
        System.out.println("Products List : ");
        productDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<ProjectorDTO> projectorDTOList = (List<ProjectorDTO>) applicationContext.getBean("projectors");
        System.out.println("Projectors List : ");
        projectorDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<RestaurantDTO> restaurantDTOList = (List<RestaurantDTO>) applicationContext.getBean("restaurants");
        System.out.println("Restaurants List : ");
        restaurantDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<RouterDTO> routerDTOList = (List<RouterDTO>) applicationContext.getBean("routers");
        System.out.println("Routers List : ");
        routerDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<ShoeDTO> shoeDTOList = (List<ShoeDTO>) applicationContext.getBean("shoes");
        System.out.println("Shoes List : ");
        shoeDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<ShoppingMallDTO> shoppingMallDTOList = (List<ShoppingMallDTO>) applicationContext.getBean("shoppingMall");
        System.out.println("Shopping Mall List : ");
        shoppingMallDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<SpeakerDTO> speakerDTOList = (List<SpeakerDTO>) applicationContext.getBean("speakers");
        System.out.println("Speakers List : ");
        speakerDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<SportDTO> sportDTOList = (List<SportDTO>) applicationContext.getBean("sports");
        System.out.println("Sports List : ");
        sportDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<SuperMarketDTO> superMarketDTOList = (List<SuperMarketDTO>) applicationContext.getBean("superMarket");
        System.out.println("Super Market List : ");
        superMarketDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<TvDTO> tvDTOList = (List<TvDTO>) applicationContext.getBean("tv");
        System.out.println("TV List : ");
        tvDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<UserDTO> userDTOList = (List<UserDTO>) applicationContext.getBean("users");
        System.out.println("Users List : ");
        userDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<VehicleDTO> vehicleDTOList = (List<VehicleDTO>) applicationContext.getBean("vehicles");
        System.out.println("Vehicles List : ");
        vehicleDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<WashingMachineDTO> washingMachineDTOList = (List<WashingMachineDTO>) applicationContext.getBean("washingMachine");
        System.out.println("Washing Machine List : ");
        washingMachineDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<WatchDTO> watchDTOList = (List<WatchDTO>) applicationContext.getBean("watches");
        System.out.println("Watches List : ");
        watchDTOList.stream().forEach(System.out::println);
        System.out.println();

        List<WeaponDTO> weaponDTOList = (List<WeaponDTO>) applicationContext.getBean("weapons");
        System.out.println("Weapons List : ");
        weaponDTOList.stream().forEach(System.out::println);
        System.out.println();

    }
}
