package com.xworkz.beansapp.config;

import com.xworkz.beansapp.dto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@ComponentScan(basePackages = "com.xworkz.beansapp")
@Configuration
public class CoreConfiguration {

    public  CoreConfiguration(){
        System.out.println("Core Configuration started");
    }

    @Bean("airConditioners")
    public List<AirConditionerDTO> getAirConditioner(){
        List<AirConditionerDTO> airConditionerDTOList = new ArrayList<>();

        airConditionerDTOList.add(new AirConditionerDTO(1,"LG",1.5,5,true,45999.0,"Split","White"));
        airConditionerDTOList.add(new AirConditionerDTO(2,"Samsung",1.0,4,true,38999.0,"Window","Silver"));
        airConditionerDTOList.add(new AirConditionerDTO(3,"Voltas",2.0,3,false,52999.0,"Split","White"));
        airConditionerDTOList.add(new AirConditionerDTO(4,"Daikin",1.8,5,true,60999.0,"Split","Grey"));
        airConditionerDTOList.add(new AirConditionerDTO(5,"Hitachi",1.5,4,true,49999.0,"Window","White"));
        airConditionerDTOList.add(new AirConditionerDTO(6,"Panasonic",1.2,3,false,32999.0,"Portable","Black"));
        airConditionerDTOList.add(new AirConditionerDTO(7,"WhirlPool",1.0,2,false,27999.0,"Window","White"));
        airConditionerDTOList.add(new AirConditionerDTO(8,"BlueStar",2.0,5,true,57999.0,"Split","Silver"));
        airConditionerDTOList.add(new AirConditionerDTO(9,"Godrej",1.5,3,true,35999.0,"Portable","White"));
        airConditionerDTOList.add(new AirConditionerDTO(10,"Carrier",1.8,4,true,46999.0,"Split","Grey"));
        airConditionerDTOList.add(new AirConditionerDTO(11,"Onida",1.0,3,false,24999.0,"Window","White"));
        airConditionerDTOList.add(new AirConditionerDTO(12,"Lloyd",1.5,4,true,41999.0,"Split","Black"));
        airConditionerDTOList.add(new AirConditionerDTO(13,"Haier",2.0,3,true,38999.0,"Portable","White"));
        airConditionerDTOList.add(new AirConditionerDTO(14,"TCL",1.2,5,true,28999.0,"Window","Silver"));
        airConditionerDTOList.add(new AirConditionerDTO(15,"Midea",1.0,3,false,22999.0,"Window","White"));

        return airConditionerDTOList;
    }


    @Bean("bags")
    public List<BagDTO> getBagInfo(){
        List<BagDTO> bagInfoList = new ArrayList<>();
        bagInfoList.add( new BagDTO(1,"Wildcraft","Backpack",30,"Black","Polyester",1599.0,true));
        bagInfoList.add( new BagDTO(2,"Sky bags","Travel Bag",45,"Blue","Nylon",2499.0,false));
        bagInfoList.add( new BagDTO(3,"American Tourister","Laptop Bag",25,"Grey","Polyester",1999.0,true));
        bagInfoList.add( new BagDTO(4,"Puma","Sports Bag",35,"Red","Nylon",1799.0,false));
        bagInfoList.add( new BagDTO(5,"Nike","Backpack",28,"Black","Polyester",2999.0,true));
        bagInfoList.add( new BagDTO(6,"Fastrack","Sling Bag",12,"Brown","Leather",1399.0,false));
        bagInfoList.add( new BagDTO(7,"HP","Laptop Bag",22,"Black","Fabric",1699.0,true));
        bagInfoList.add( new BagDTO(8,"Lenovo","Laptop Backpack",28,"Blue","Polyester",1899.0,true));
        bagInfoList.add( new BagDTO(9,"Decathlon","Hiking Bag",50,"Green","Nylon",3499.0,false));
        bagInfoList.add( new BagDTO(10,"Swiss Gear","Travel Backpack",40,"Grey","Polyester",3999.0,true));
        bagInfoList.add( new BagDTO(11,"Baggit","Handbag",15,"Pink","Leather",2199.0,false));
        bagInfoList.add( new BagDTO(12,"Safari","Duffel Bag",38,"Blue","Nylon",1899.0,false));
        bagInfoList.add( new BagDTO(13,"Aristocrat","College Bag",30,"Black","Polyester",1599.0,true));
        bagInfoList.add( new BagDTO(14,"Tommy Hilfiger","Shoulder Bag",18,"Brown","Leather",4599.0,false));
        bagInfoList.add( new BagDTO(15,"Adidas","Sports Backpack",32,"White","Polyester",2799.0,true));

        return bagInfoList;
    }

    @Bean("books")
    public List<BookDTO> getBooksInfo(){
        List<BookDTO> bookDTOList = new ArrayList<>();

        bookDTOList.add(new BookDTO(1,"The Alchemist","Paulo Coelho","Fiction",1988,399.0,"English","HarperCollins"));
        bookDTOList.add(new BookDTO(2,"Ikigai","Héctor García","Self Help",2016,499.0,"English","Penguin"));
        bookDTOList.add(new BookDTO(3,"Atomic Habits","James Clear","Self Help",2018,699.0,"English","Penguin"));
        bookDTOList.add(new BookDTO(4,"Wings of Fire","A.P.J. Abdul Kalam","Autobiography",1999,350.0,"English","Universities Press"));
        bookDTOList.add(new BookDTO(5,"Mahabharata","Vyasa","Mythology",400,599.0,"Sanskrit","Gita Press"));
        bookDTOList.add(new BookDTO(6,"Ramayana","Valmiki","Epic",500,650.0,"Sanskrit","Gita Press"));
        bookDTOList.add(new BookDTO(7,"Harry Potter","J.K. Rowling","Fantasy",1997,899.0,"English","Bloomsbury"));
        bookDTOList.add(new BookDTO(8,"The Hobbit","J.R.R. Tolkien","Fantasy",1937,799.0,"English","Allen & Unwin"));
        bookDTOList.add(new BookDTO(9,"Pride and Prejudice","Jane Austen","Romance",1813,349.0,"English","T. Egerton"));
        bookDTOList.add(new BookDTO(10,"1984","George Orwell","Dystopian",1949,499.0,"English","Secker & Warburg"));
        bookDTOList.add(new BookDTO(11,"The Monk Who Sold His Ferrari","Robin Sharma","Motivation",1996,450.0,"English","HarperCollins"));
        bookDTOList.add(new BookDTO(12,"Rich Dad Poor Dad","Robert Kiyosaki","Finance",1997,550.0,"English","Plata Publishing"));
        bookDTOList.add(new BookDTO(13,"The Secret","Rhonda Byrne","Self Help",2006,499.0,"English","Atria Books"));
        bookDTOList.add(new BookDTO(14,"To Kill a Mockingbird","Harper Lee","Fiction",1960,425.0,"English","J.B. Lippincott & Co."));
        bookDTOList.add(new BookDTO(15,"The Immortals of Meluha","Amish Tripathi","Mythology",2010,399.0, "English","Westland Books"));

        return bookDTOList;
    }

    @Bean("bottles")
    public List<BottleDTO> getBottleInfo(){
        List<BottleDTO> bottleDTOList = new ArrayList<>();

        bottleDTOList.add(new BottleDTO(1,"Milton","Blue","Steel",1,1000,599.0,"Milton Pvt Ltd"));
        bottleDTOList.add(new BottleDTO(2,"Cello","Red","Plastic",1,750,249.0,"Cello Industries"));
        bottleDTOList.add(new BottleDTO(3,"Tupperware","Purple","Plastic",2,500,399.0,"Tupperware Ltd"));
        bottleDTOList.add(new BottleDTO(4,"Pigeon","Black","Steel",1,1200,699.0,"Stovekraft Pvt Ltd"));
        bottleDTOList.add(new BottleDTO(5,"Borosil","Silver","Glass",1,1000,799.0,"Borosil Ltd"));
        bottleDTOList.add(new BottleDTO(6,"Nike","White","Plastic",1,750,999.0,"Nike India"));
        bottleDTOList.add(new BottleDTO(7,"Adidas","Blue","Plastic",1,650,899.0,"Adidas India"));
        bottleDTOList.add(new BottleDTO(8,"Decathlon","Green","Steel",1,1000,649.0,"Decathlon Pvt Ltd"));
        bottleDTOList.add(new BottleDTO(9,"Signoraware","Pink","Plastic",1,550,329.0,"Signoraware India"));
        bottleDTOList.add(new BottleDTO(10,"Himalayan","Transparent","Glass",1,1000,999.0,"Himalayan Water Co."));
        bottleDTOList.add(new BottleDTO(11,"SipperPro","Grey","Steel",1,850,549.0,"SipperPro Manufacturers"));
        bottleDTOList.add(new BottleDTO(12,"Aquafit","Orange","Plastic",1,700,299.0,"Aquafit Pvt Ltd"));
        bottleDTOList.add(new BottleDTO(13,"HydroMate","Black","Steel",1,1500,899.0,"HydroMate Ltd"));
        bottleDTOList.add(new BottleDTO(14,"Ustraa","Yellow","Plastic",1,500,349.0,"Ustraa Products"));
        bottleDTOList.add(new BottleDTO(15,"SteelKing","Silver","Steel",1,1000,799.0,"SteelKing Industries"));

        return bottleDTOList;
    }

    @Bean("cameras")
    public List<CameraDTO> getCameraInfo(){
        List<CameraDTO> cameraDTOList = new ArrayList<>();

        cameraDTOList.add(new CameraDTO(1,"Canon","EOS 1500D",24,true,42999.0,"18-55mm",600));
        cameraDTOList.add(new CameraDTO(2,"Nikon","D3500",24,true,45999.0,"18-55mm",700));
        cameraDTOList.add(new CameraDTO(3,"Sony","Alpha A6000",24,false,48999.0,"16-50mm",650));
        cameraDTOList.add(new CameraDTO(4,"Fujifilm","X-T200",24,false,52999.0,"15-45mm",450));
        cameraDTOList.add(new CameraDTO(5,"Panasonic","Lumix G7",16,false,44999.0,"14-42mm",500));
        cameraDTOList.add(new CameraDTO(6,"GoPro","Hero 9",20,false,38999.0,"Wide Angle",180));
        cameraDTOList.add(new CameraDTO(7,"DJI","Osmo Pocket 2",20,false,34999.0,"Fixed Lens",140));
        cameraDTOList.add(new CameraDTO(8,"Kodak","PIXPRO AZ528",52,false,19999.0,"52x Zoom Lens",400));
        cameraDTOList.add(new CameraDTO(9,"Olympus","OM-D E-M10",20,false,57999.0,"14-42mm",700));
        cameraDTOList.add(new CameraDTO(10,"Leica","D-Lux 7",17,false,99999.0,"24-75mm",300));
        cameraDTOList.add(new CameraDTO(11,"Canon","PowerShot G7X",20,false,59999.0,"24-100mm",265));
        cameraDTOList.add(new CameraDTO(12,"Sony","RX100 VII",20,false,94999.0,"24-200mm",260));
        cameraDTOList.add(new CameraDTO(13,"Nikon","Z50",21,false,78499.0,"16-50mm",500));
        cameraDTOList.add(new CameraDTO(14,"Fujifilm","X-A7",24,false,46499.0,"15-45mm",440));
        cameraDTOList.add(new CameraDTO(15,"Canon","EOS R10",24,true,89999.0,"18-45mm",750));

        return cameraDTOList;
    }

    @Bean("customers")
    public List<CustomerDTO> getCustomersInfo(){
        List<CustomerDTO> customerDTOList = new ArrayList<>();

        customerDTOList.add(new CustomerDTO(1,"Ravi Kumar","ravi.kumar@gmail.com",28,9876543210L,"12 MG Road","Bengaluru","Karnataka"));
        customerDTOList.add(new CustomerDTO(2,"Sneha Patil","sneha.patil@gmail.com",25,9765432109L,"55 Tilak Nagar","Mumbai","Maharashtra"));
        customerDTOList.add(new CustomerDTO(3,"Arjun Verma","arjun.verma@gmail.com",32,9898765432L,"8 Civil Lines","Delhi","Delhi"));
        customerDTOList.add(new CustomerDTO(4,"Priya Sharma","priya.sharma@gmail.com",27,9988776655L,"44 Laxmi Chowk","Jaipur","Rajasthan"));
        customerDTOList.add(new CustomerDTO(5,"Rahul Mehta","rahul.mehta@gmail.com",30,9123456780L,"102 Nehru Street","Ahmedabad","Gujarat"));
        customerDTOList.add(new CustomerDTO(6,"Kavya Rao","kavya.rao@gmail.com",29,9012345678L,"22 Residency Road","Hyderabad","Telangana"));
        customerDTOList.add(new CustomerDTO(7,"Aman Singh","aman.singh@gmail.com",34,9090909090L,"5 Park Street","Kolkata","West Bengal"));
        customerDTOList.add(new CustomerDTO(8,"Divya Nair","divya.nair@gmail.com",26,9234567890L,"15 MG Layout","Kochi","Kerala"));
        customerDTOList.add(new CustomerDTO(9,"Vikram Joshi","vikram.joshi@gmail.com",33,9345678901L,"77 Patel Nagar","Pune","Maharashtra"));
        customerDTOList.add(new CustomerDTO(10,"Meera Desai","meera.desai@gmail.com",31,9456789012L,"9 Green Park","Surat","Gujarat"));
        customerDTOList.add(new CustomerDTO(11,"Siddharth Rao","siddharth.rao@gmail.com",29,9567890123L,"3 Whitefield","Bengaluru","Karnataka"));
        customerDTOList.add(new CustomerDTO(12,"Tanya Kapoor","tanya.kapoor@gmail.com",24,9789012345L,"66 South Avenue","Chandigarh","Punjab"));
        customerDTOList.add(new CustomerDTO(13,"Harish Kumar","harish.kumar@gmail.com",35,9871205487L,"118 Gandhi Road","Chennai","Tamil Nadu"));
        customerDTOList.add(new CustomerDTO(14,"Pooja Jain","pooja.jain@gmail.com",27,9987543201L,"50 Shakti Nagar","Indore","Madhya Pradesh"));
        customerDTOList.add(new CustomerDTO(15,"Rohan Gupta","rohan.gupta@gmail.com",28,9123098765L,"21 Banjara Hills","Hyderabad","Telangana"));

        return customerDTOList;
    }

    @Bean("cycles")
    public List<CycleDTO> getCyclesInfo(){
        List<CycleDTO> cycleDTOList = new ArrayList<>();

        cycleDTOList.add(new CycleDTO(1,"Hero","Mountain Bike",21,15999.0,"Steel","Red",26));
        cycleDTOList.add(new CycleDTO(2,"Hercules","Road Bike",18,13999.0,"Alloy","Blue",27));
        cycleDTOList.add(new CycleDTO(3,"Firefox","Hybrid",21,19999.0,"Aluminium","Black",28));
        cycleDTOList.add(new CycleDTO(4,"Giant","Mountain Bike",24,29999.0,"Carbon Fiber","Grey",29));
        cycleDTOList.add(new CycleDTO(5,"Trek","Road Bike",18,34999.0,"Aluminium","White",27));
        cycleDTOList.add(new CycleDTO(6,"Btwin","Hybrid",21,17999.0,"Aluminium","Green",28));
        cycleDTOList.add(new CycleDTO(7,"Montra","Mountain Bike",24,22500.0,"Alloy","Yellow",26));
        cycleDTOList.add(new CycleDTO(8,"Atlas","City Bike",6,8999.0,"Steel","Pink",24));
        cycleDTOList.add(new CycleDTO(9,"Avon","Kids Bike",0,4999.0,"Steel","Purple",20));
        cycleDTOList.add(new CycleDTO(10,"Cannondale","Road Bike",22,45999.0,"Carbon Fiber","Black",28));
        cycleDTOList.add(new CycleDTO(11,"Scott","Hybrid",21,28999.0,"Aluminium","Orange",27));
        cycleDTOList.add(new CycleDTO(12,"Specialized","Mountain Bike",27,55999.0,"Carbon Fiber","Dark Blue",29));
        cycleDTOList.add(new CycleDTO(13,"Kross","City Bike",7,9999.0,"Steel","Grey",26));
        cycleDTOList.add(new CycleDTO(14,"Mach City","Road Bike",14,12999.0,"Alloy","Teal",27));
        cycleDTOList.add(new CycleDTO(15,"Ninety One","Mountain Bike",18,19990.0,"Aluminium","Red",29));

        return cycleDTOList;
    }

    @Bean("drones")
    public List<DroneDTO> getDronesInfo(){
        List<DroneDTO> droneDTOList = new ArrayList<>();

        droneDTOList.add(new DroneDTO(1,"DJI",6000,30,89999.0,true,12,"Quadcopter"));
        droneDTOList.add(new DroneDTO(2,"Parrot",4000,25,59999.0,true,10,"Quadcopter"));
        droneDTOList.add(new DroneDTO(3,"Autel",7000,35,109999.0,true,20,"Hexacopter"));
        droneDTOList.add(new DroneDTO(4,"Ryze Tech",100,13,12999.0,false,5,"Mini Drone"));
        droneDTOList.add(new DroneDTO(5,"Holy Stone",500,20,18999.0,true,8,"Quadcopter"));
        droneDTOList.add(new DroneDTO(6,"Skydio",10000,40,149999.0,true,12,"Autonomous Drone"));
        droneDTOList.add(new DroneDTO(7,"Hubsan",3000,23,24999.0,true,4,"Quadcopter"));
        droneDTOList.add(new DroneDTO(8,"Walkera",4500,28,49999.0,true,10,"Racing Drone"));
        droneDTOList.add(new DroneDTO(9,"Syma",200,10,7999.0,false,2,"Toy Drone"));
        droneDTOList.add(new DroneDTO(10,"Potensic",800,18,13999.0,true,5,"Quadcopter"));
        droneDTOList.add(new DroneDTO(11,"JJRC",250,15,9999.0,false,3,"Mini Drone"));
        droneDTOList.add(new DroneDTO(12,"EACHINE",300,14,8499.0,false,2,"Racing Drone"));
        droneDTOList.add(new DroneDTO(13,"UPair",2000,22,28999.0,true,7,"Quadcopter"));
        droneDTOList.add(new DroneDTO(14,"Snaptain",350,16,11999.0,true,4,"Mini Drone"));
        droneDTOList.add(new DroneDTO(15,"ZLRC",1500,20,15999.0,true,6,"Camera Drone"));


        return droneDTOList;
    }

    @Bean("employees")
    public List<EmployeeDTO> getEmployeesInfo(){
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        employeeDTOList.add(new EmployeeDTO(1,"Rohit Sharma",29,"IT","Software Engineer",55000.0,"rohit.sharma@company.com","2020-03-15"));
        employeeDTOList.add(new EmployeeDTO(2,"Priya Nair",26,"HR","HR Executive",42000.0,"priya.nair@company.com","2021-07-10"));
        employeeDTOList.add(new EmployeeDTO(3,"Arjun Patel",31,"Finance","Accountant",48000.0,"arjun.patel@company.com","2019-11-20"));
        employeeDTOList.add(new EmployeeDTO(4,"Sneha Gupta",28,"Marketing","Marketing Analyst",46000.0,"sneha.gupta@company.com","2022-01-12"));
        employeeDTOList.add(new EmployeeDTO(5,"Vikram Singh",34,"IT","Team Lead",75000.0,"vikram.singh@company.com","2018-06-03"));
        employeeDTOList.add(new EmployeeDTO(6,"Kavya Rao",27,"Sales","Sales Executive",40000.0,"kavya.rao@company.com","2021-04-08"));
        employeeDTOList.add(new EmployeeDTO(7,"Nitin Verma",35,"Operations","Operations Manager",68000.0,"nitin.verma@company.com","2017-08-19"));
        employeeDTOList.add(new EmployeeDTO(8,"Meera Desai",30,"Admin","Admin Officer",39000.0,"meera.desai@company.com","2020-10-28"));
        employeeDTOList.add(new EmployeeDTO(9,"Siddharth Reddy",33,"IT","System Analyst",60000.0,"siddharth.reddy@company.com","2019-02-14"));
        employeeDTOList.add(new EmployeeDTO(10,"Pooja Jain",25,"Customer Support","Support Executive",35000.0,"pooja.jain@company.com","2022-05-06"));
        employeeDTOList.add(new EmployeeDTO(11,"Harish Kumar",37,"Finance","Senior Accountant",68000.0,"harish.kumar@company.com","2016-09-01"));
        employeeDTOList.add(new EmployeeDTO(12,"Tanya Kapoor",24,"Marketing","Brand Associate",38000.0,"tanya.kapoor@company.com","2023-03-11"));
        employeeDTOList.add(new EmployeeDTO(13,"Rohan Gupta",29,"IT","QA Engineer",52000.0,"rohan.gupta@company.com","2020-12-07"));
        employeeDTOList.add(new EmployeeDTO(14,"Aman Yadav",32,"Operations","Logistics Coordinator",45000.0,"aman.yadav@company.com","2019-05-23"));
        employeeDTOList.add(new EmployeeDTO(15,"Divya Sharma",28,"HR","HR Recruiter",43000.0,"divya.sharma@company.com","2021-09-15"));

        return employeeDTOList;
    }

    @Bean("fridges")
    public List<FridgeDTO> getFridgesInfo(){
        List<FridgeDTO> fridgeDTOList = new ArrayList<>();

        fridgeDTOList.add(new FridgeDTO(1,"LG",260,"Double Door",23990.0,"Silver",true,4));
        fridgeDTOList.add(new FridgeDTO(2,"Samsung",324,"Double Door",28990.0,"Black",true,5));
        fridgeDTOList.add(new FridgeDTO(3,"Whirlpool",190,"Single Door",14990.0,"Red",false,3));
        fridgeDTOList.add(new FridgeDTO(4,"Godrej",210,"Single Door",16990.0,"Blue",false,2));
        fridgeDTOList.add(new FridgeDTO(5,"Haier",258,"Bottom Freezer",25990.0,"Grey",true,3));
        fridgeDTOList.add(new FridgeDTO(6,"Bosch",347,"Double Door",44990.0,"White",true,5));
        fridgeDTOList.add(new FridgeDTO(7,"Panasonic",309,"Double Door",30990.0,"Black Steel",true,4));
        fridgeDTOList.add(new FridgeDTO(8,"Siemens",361,"Side-by-Side",72990.0,"Silver",true,5));
        fridgeDTOList.add(new FridgeDTO(9,"Hitachi",455,"Side-by-Side",81990.0,"Dark Grey",true,5));
        fridgeDTOList.add(new FridgeDTO(10,"Electrolux",235,"Single Door",18990.0,"White",false,3));
        fridgeDTOList.add(new FridgeDTO(11,"Kelvinator",190,"Single Door",12990.0,"Purple",false,2));
        fridgeDTOList.add(new FridgeDTO(12,"Voltas",240,"Double Door",20990.0,"Red Glossy",true,3));
        fridgeDTOList.add(new FridgeDTO(13,"Beko",301,"Bottom Freezer",38990.0,"Dark Blue",true,4));
        fridgeDTOList.add(new FridgeDTO(14,"Acer",260,"Single Door",15990.0,"Silver",false,3));
        fridgeDTOList.add(new FridgeDTO(15,"Croma",220,"Single Door",13990.0,"Black",false,2));

        return fridgeDTOList;
    }

    @Bean("hospitals")
    public List<HospitalDTO> getHospitalsInfo(){
        List<HospitalDTO> hospitalDTOList = new ArrayList<>();

        hospitalDTOList.add(new HospitalDTO(1,"Apollo Hospital","Bengaluru",500,120,true,"Multi-Specialty",4.6));
        hospitalDTOList.add(new HospitalDTO(2,"Fortis Hospital","Mumbai",450,110,true,"Multi-Specialty",4.5));
        hospitalDTOList.add(new HospitalDTO(3,"Manipal Hospital","Chennai",600,150,true,"Multi-Specialty",4.7));
        hospitalDTOList.add(new HospitalDTO(4,"Narayana Health","Bengaluru",800,200,true,"Cardiac Specialty",4.8));
        hospitalDTOList.add(new HospitalDTO(5,"Max Hospital","Delhi",350,90,true,"General",4.4));
        hospitalDTOList.add(new HospitalDTO(6,"AIIMS","New Delhi",1200,300,true,"Government",4.9));
        hospitalDTOList.add(new HospitalDTO(7,"Safdarjung Hospital","Delhi",900,250,true,"Government",4.3));
        hospitalDTOList.add(new HospitalDTO(8,"Columbia Asia","Pune",280,75,true,"Private",4.2));
        hospitalDTOList.add(new HospitalDTO(9,"Jayadeva Hospital","Bengaluru",700,180,true,"Cardiac Specialty",4.8));
        hospitalDTOList.add(new HospitalDTO(10,"KIMS","Hyderabad",500,130,true,"Multi-Specialty",4.5));
        hospitalDTOList.add(new HospitalDTO(11,"Rainbow Children’s Hospital","Hyderabad",300,90,true,"Pediatrics",4.6));
        hospitalDTOList.add(new HospitalDTO(12,"Tata Memorial Hospital","Mumbai",850,220,true,"Cancer Specialty",4.9));
        hospitalDTOList.add(new HospitalDTO(13,"HCG Cancer Centre","Bengaluru",320,100,true,"Cancer Specialty",4.7));
        hospitalDTOList.add(new HospitalDTO(14,"Bowring Hospital","Bengaluru",400,120,true,"Government",4.1));
        hospitalDTOList.add(new HospitalDTO(15,"Cloudnine Hospital","Bengaluru",200,60,true,"Maternity",4.5));

        return hospitalDTOList;
    }

    @Bean("invoices")
    public List<InvoiceDTO> getInvoicesInfo(){
        List<InvoiceDTO> invoiceDTOList = new ArrayList<>();

        invoiceDTOList.add(new InvoiceDTO(1, 101, "Rohit Sharma", 2500.00, 125.00, "2025-01-10", "2025-01-20", "Paid"));
        invoiceDTOList.add(new InvoiceDTO(2, 102, "Anjali Mehta", 4800.50, 240.00, "2025-01-12", "2025-01-22", "Pending"));
        invoiceDTOList.add(new InvoiceDTO(3, 103, "Suresh Kumar", 1299.99, 65.00, "2025-01-14", "2025-01-24", "Paid"));
        invoiceDTOList.add(new InvoiceDTO(4, 104, "Priya Singh", 7999.00, 400.00, "2025-01-15", "2025-01-25", "Overdue"));
        invoiceDTOList.add(new InvoiceDTO(5, 105, "Mohan Das", 3499.50, 175.00, "2025-01-16", "2025-01-26", "Paid"));
        invoiceDTOList.add(new InvoiceDTO(6, 106, "Harsh Patel", 999.00, 50.00, "2025-01-18", "2025-01-28", "Pending"));
        invoiceDTOList.add(new InvoiceDTO(7, 107, "Riya Sharma", 5600.00, 280.00, "2025-01-19", "2025-01-29", "Paid"));
        invoiceDTOList.add(new InvoiceDTO(8, 108, "Aman Verma", 1999.00, 100.00, "2025-01-20", "2025-01-30", "Cancelled"));
        invoiceDTOList.add(new InvoiceDTO(9, 109, "Sneha Rao", 4500.75, 225.00, "2025-01-21", "2025-01-31", "Pending"));
        invoiceDTOList.add(new InvoiceDTO(10, 110, "Vikas Gupta", 1500.00, 75.00, "2025-01-22", "2025-02-01", "Overdue"));
        invoiceDTOList.add(new InvoiceDTO(11, 111, "Pooja Nair", 7800.20, 390.00, "2025-01-23", "2025-02-02", "Paid"));
        invoiceDTOList.add(new InvoiceDTO(12, 112, "Karan Kapoor", 3200.00, 160.00, "2025-01-24", "2025-02-03", "Pending"));
        invoiceDTOList.add(new InvoiceDTO(13, 113, "Divya Jain", 25000.00, 1250.00, "2025-01-25", "2025-02-04", "Paid"));
        invoiceDTOList.add(new InvoiceDTO(14, 114, "Rajesh R", 850.00, 42.00, "2025-01-26", "2025-02-05", "Cancelled"));
        invoiceDTOList.add(new InvoiceDTO(15, 115, "Lakshmi Priya", 6700.40, 335.00, "2025-01-27", "2025-02-06", "Pending"));

        return invoiceDTOList;
    }

    @Bean("laptops")
    public List<LaptopDTO> getLaptopInfo(){
        List<LaptopDTO> laptopDTOList = new ArrayList<>();

        laptopDTOList.add(new LaptopDTO(1, "Dell", "Inspiron 3511", "Intel i5", 8, 512, 55999.0, false));
        laptopDTOList.add(new LaptopDTO(2, "HP", "Pavilion 14", "Intel i7", 16, 512, 72999.0, true));
        laptopDTOList.add(new LaptopDTO(3, "Lenovo", "ThinkPad E14", "Intel i5", 16, 512, 68999.0, false));
        laptopDTOList.add(new LaptopDTO(4, "Asus", "VivoBook 15", "AMD Ryzen 5", 8, 512, 47999.0, false));
        laptopDTOList.add(new LaptopDTO(5, "Acer", "Aspire 7", "AMD Ryzen 7", 16, 512, 62999.0, false));
        laptopDTOList.add(new LaptopDTO(6, "Apple", "MacBook Air M1", "Apple M1", 8, 256, 89999.0, true));
        laptopDTOList.add(new LaptopDTO(7, "Apple", "MacBook Pro M2", "Apple M2", 16, 512, 149999.0, true));
        laptopDTOList.add(new LaptopDTO(8, "MSI", "Modern 14", "Intel i5", 16, 512, 57999.0, false));
        laptopDTOList.add(new LaptopDTO(9, "Samsung", "Galaxy Book2", "Intel i5", 8, 256, 52999.0, true));
        laptopDTOList.add(new LaptopDTO(10, "Huawei", "MateBook D15", "Intel i5", 8, 512, 59999.0, false));
        laptopDTOList.add(new LaptopDTO(11, "Dell", "XPS 13", "Intel i7", 16, 512, 134999.0, true));
        laptopDTOList.add(new LaptopDTO(12, "HP", "OMEN 16", "AMD Ryzen 7", 16, 1_024, 139999.0, false));
        laptopDTOList.add(new LaptopDTO(13, "Asus", "ROG Strix G15", "AMD Ryzen 9", 32, 1_024, 179999.0, false));
        laptopDTOList.add(new LaptopDTO(14, "Acer", "Swift 3", "Intel i5", 8, 512, 56999.0, true));
        laptopDTOList.add(new LaptopDTO(15, "Lenovo", "IdeaPad Slim 5", "Intel i7", 16, 512, 74999.0, true));

        return laptopDTOList;
    }

    @Bean("libraries")
    public List<LibraryDTO> getLibraryInfo(){
        List<LibraryDTO> libraryDTOList = new ArrayList<>();

        libraryDTOList.add(new LibraryDTO(1, "Central City Library", "Bengaluru", 50000, true, 300, 4, 4.7));
        libraryDTOList.add(new LibraryDTO(2, "State Public Library", "Mumbai", 75000, true, 450, 5, 4.8));
        libraryDTOList.add(new LibraryDTO(3, "National Library", "Kolkata", 120000, true, 600, 6, 4.9));
        libraryDTOList.add(new LibraryDTO(4, "Community Library", "Chennai", 15000, false, 120, 2, 4.3));
        libraryDTOList.add(new LibraryDTO(5, "Heritage Library", "Delhi", 90000, true, 500, 5, 4.6));
        libraryDTOList.add(new LibraryDTO(6, "City Reading Hub", "Pune", 30000, true, 200, 3, 4.4));
        libraryDTOList.add(new LibraryDTO(7, "Smart E-Library", "Hyderabad", 45000, true, 250, 4, 4.7));
        libraryDTOList.add(new LibraryDTO(8, "Eco Knowledge Center", "Ahmedabad", 18000, false, 100, 2, 4.2));
        libraryDTOList.add(new LibraryDTO(9, "Township Study Hall", "Jaipur", 25000, false, 150, 3, 4.1));
        libraryDTOList.add(new LibraryDTO(10, "Modern Digital Library", "Kochi", 60000, true, 350, 4, 4.8));
        libraryDTOList.add(new LibraryDTO(11, "Research Reference Library", "Lucknow", 40000, true, 270, 3, 4.5));
        libraryDTOList.add(new LibraryDTO(12, "Open Study Library", "Coimbatore", 22000, false, 180, 3, 4.0));
        libraryDTOList.add(new LibraryDTO(13, "Children’s Knowledge Park", "Nagpur", 12000, true, 90, 2, 4.4));
        libraryDTOList.add(new LibraryDTO(14, "Readers Paradise Library", "Bhopal", 34000, true, 210, 3, 4.6));
        libraryDTOList.add(new LibraryDTO(15, "Metro City Library", "Gurgaon", 52000, true, 310, 4, 4.7));

        return libraryDTOList;
    }

    @Bean("medicalStores")
    public List<MedicalStoreDTO> getMedicalStoreInfo(){
        List<MedicalStoreDTO> medicalStoreDTOList = new ArrayList<>();

        medicalStoreDTOList.add(new MedicalStoreDTO(1, "HealthPlus Pharmacy", "Bengaluru", "LIC98765", true, "Ramesh Rao", 12, 4.7));
        medicalStoreDTOList.add(new MedicalStoreDTO(2, "MediCare Store", "Mumbai", "LIC12345", false, "Anita Sharma", 8, 4.5));
        medicalStoreDTOList.add(new MedicalStoreDTO(3, "Wellness Pharmacy", "Chennai", "LIC56789", true, "Suresh Kumar", 10, 4.6));
        medicalStoreDTOList.add(new MedicalStoreDTO(4, "City Medicals", "Hyderabad", "LIC90876", false, "Priya R", 6, 4.3));
        medicalStoreDTOList.add(new MedicalStoreDTO(5, "GreenLife Medicos", "Delhi", "LIC34521", true, "Manoj Gupta", 15, 4.8));
        medicalStoreDTOList.add(new MedicalStoreDTO(6, "Apollo Pharmacy", "Pune", "LIC45678", true, "Kavita Nair", 20, 4.9));
        medicalStoreDTOList.add(new MedicalStoreDTO(7, "CarePoint Medicals", "Kolkata", "LIC77889", false, "Arvind Das", 7, 4.2));
        medicalStoreDTOList.add(new MedicalStoreDTO(8, "MediZone Store", "Jaipur", "LIC66554", true, "Nikhil Sharma", 9, 4.4));
        medicalStoreDTOList.add(new MedicalStoreDTO(9, "TrustCare Pharmacy", "Lucknow", "LIC88991", false, "Sunita Jain", 5, 4.1));
        medicalStoreDTOList.add(new MedicalStoreDTO(10, "Family Health Medicos", "Nagpur", "LIC22334", true, "Rahul Patil", 11, 4.5));
        medicalStoreDTOList.add(new MedicalStoreDTO(11, "PrimeCare Pharmacy", "Surat", "LIC33445", true, "Deepak Shah", 14, 4.6));
        medicalStoreDTOList.add(new MedicalStoreDTO(12, "DailyMeds Store", "Bhopal", "LIC55667", false, "Poonam Verma", 6, 4.0));
        medicalStoreDTOList.add(new MedicalStoreDTO(13, "LifeCare Medicos", "Gurgaon", "LIC66778", true, "Akash Mehta", 13, 4.7));
        medicalStoreDTOList.add(new MedicalStoreDTO(14, "HealthFirst Pharmacy", "Coimbatore", "LIC77880", false, "Shalini R", 8, 4.3));
        medicalStoreDTOList.add(new MedicalStoreDTO(15, "NewCity Medicals", "Mysuru", "LIC11223", true, "Kiran H", 10, 4.5));

        return medicalStoreDTOList;
    }

    @Bean("mobiles")
    public List<MobileDTO> getMobilesInfo(){
        List<MobileDTO> mobileDTOList = new ArrayList<>();

        mobileDTOList.add(new MobileDTO(1, "Samsung", "Galaxy S23", 8, 256, 74999.0, "Snapdragon 8 Gen 2", 3900));
        mobileDTOList.add(new MobileDTO(2, "Apple", "iPhone 14", 6, 128, 79999.0, "A15 Bionic", 3279));
        mobileDTOList.add(new MobileDTO(3, "OnePlus", "11R", 12, 256, 44999.0, "Snapdragon 8+ Gen 1", 5000));
        mobileDTOList.add(new MobileDTO(4, "Xiaomi", "Redmi Note 12", 6, 128, 15999.0, "Snapdragon 4 Gen 1", 5000));
        mobileDTOList.add(new MobileDTO(5, "Realme", "GT Neo 5", 8, 256, 29999.0, "Dimensity 9200+", 4800));
        mobileDTOList.add(new MobileDTO(6, "Vivo", "V27", 8, 128, 25999.0, "MediaTek Dimensity 920", 4500));
        mobileDTOList.add(new MobileDTO(7, "Oppo", "Reno 10 Pro", 12, 256, 36999.0, "Snapdragon 8+ Gen 1", 4800));
        mobileDTOList.add(new MobileDTO(8, "Motorola", "Edge 40", 8, 256, 44999.0, "Snapdragon 8+ Gen 1", 4400));
        mobileDTOList.add(new MobileDTO(9, "Google", "Pixel 7", 8, 128, 59999.0, "Google Tensor G2", 4355));
        mobileDTOList.add(new MobileDTO(10, "Samsung", "Galaxy A54", 6, 128, 25999.0, "Exynos 1380", 5000));
        mobileDTOList.add(new MobileDTO(11, "Apple", "iPhone 14 Pro", 6, 256, 119999.0, "A16 Bionic", 3200));
        mobileDTOList.add(new MobileDTO(12, "OnePlus", "Nord 3", 12, 256, 29999.0, "Dimensity 9000", 4500));
        mobileDTOList.add(new MobileDTO(13, "Xiaomi", "11T Pro", 8, 256, 34999.0, "Snapdragon 888", 5000));
        mobileDTOList.add(new MobileDTO(14, "Realme", "Narzo 60X", 4, 128, 12999.0, "MediaTek Helio G95", 5000));
        mobileDTOList.add(new MobileDTO(15, "Vivo", "X90 Pro", 12, 256, 69999.0, "Snapdragon 8 Gen 2", 4700));

        return mobileDTOList;
    }

    @Bean("movies")
    public List<MovieDTO> getMoviesInfo(){
        List<MovieDTO> movieDTOList = new ArrayList<>();

        movieDTOList.add(new MovieDTO(1, "Inception", "Christopher Nolan", "Sci-Fi", "2h 28m", "English", 2010, 9.0));
        movieDTOList.add(new MovieDTO(2, "Interstellar", "Christopher Nolan", "Sci-Fi", "2h 49m", "English", 2014, 8.6));
        movieDTOList.add(new MovieDTO(3, "The Dark Knight", "Christopher Nolan", "Action", "2h 32m", "English", 2008, 9.0));
        movieDTOList.add(new MovieDTO(4, "Avengers: Endgame", "Anthony Russo", "Action", "3h 1m", "English", 2019, 8.4));
        movieDTOList.add(new MovieDTO(5, "Titanic", "James Cameron", "Romance", "3h 14m", "English", 1997, 7.8));
        movieDTOList.add(new MovieDTO(6, "Forrest Gump", "Robert Zemeckis", "Drama", "2h 22m", "English", 1994, 8.8));
        movieDTOList.add(new MovieDTO(7, "The Matrix", "Lana Wachowski", "Sci-Fi", "2h 16m", "English", 1999, 8.7));
        movieDTOList.add(new MovieDTO(8, "Gladiator", "Ridley Scott", "Action", "2h 35m", "English", 2000, 8.5));
        movieDTOList.add(new MovieDTO(9, "Parasite", "Bong Joon-ho", "Thriller", "2h 12m", "Korean", 2019, 8.6));
        movieDTOList.add(new MovieDTO(10, "Jai Bhim", "T.J. Gnanavel", "Drama", "2h 40m", "Tamil", 2021, 8.8));
        movieDTOList.add(new MovieDTO(11, "Dangal", "Nitesh Tiwari", "Sports", "2h 41m", "Hindi", 2016, 8.4));
        movieDTOList.add(new MovieDTO(12, "Baahubali: The Beginning", "S.S. Rajamouli", "Action", "2h 39m", "Telugu", 2015, 8.0));
        movieDTOList.add(new MovieDTO(13, "Baahubali: The Conclusion", "S.S. Rajamouli", "Action", "2h 50m", "Telugu", 2017, 8.2));
        movieDTOList.add(new MovieDTO(14, "3 Idiots", "Rajkumar Hirani", "Comedy", "2h 50m", "Hindi", 2009, 8.4));
        movieDTOList.add(new MovieDTO(15, "Spider-Man: No Way Home", "Jon Watts", "Action", "2h 28m", "English", 2021, 8.3));

        return movieDTOList;
    }

    @Bean("orders")
    public List<OrderDTO> getOrdersInfo(){
        List<OrderDTO> orderDTOList = new ArrayList<>();

        orderDTOList.add(new OrderDTO(1, "Laptop Purchase", "2025-01-10", 55999.0, "Delivered", "Credit Card", "2025-01-15", "Delivered on time"));
        orderDTOList.add(new OrderDTO(2, "Mobile Phone", "2025-01-12", 74999.0, "Pending", "UPI", "2025-01-20", "Payment received"));
        orderDTOList.add(new OrderDTO(3, "Book Set", "2025-01-14", 1999.0, "Shipped", "Cash on Delivery", "2025-01-18", "Packed and shipped"));
        orderDTOList.add(new OrderDTO(4, "Fridge", "2025-01-15", 28990.0, "Delivered", "Debit Card", "2025-01-22", "Customer satisfied"));
        orderDTOList.add(new OrderDTO(5, "Camera", "2025-01-16", 45000.0, "Cancelled", "Credit Card", "2025-01-20", "Customer cancelled"));
        orderDTOList.add(new OrderDTO(6, "Headphones", "2025-01-18", 2999.0, "Shipped", "Net Banking", "2025-01-21", "Tracking number generated"));
        orderDTOList.add(new OrderDTO(7, "Smartwatch", "2025-01-19", 12999.0, "Delivered", "UPI", "2025-01-23", "Delivered on schedule"));
        orderDTOList.add(new OrderDTO(8, "Tablet", "2025-01-20", 25999.0, "Pending", "Debit Card", "2025-01-28", "Awaiting payment confirmation"));
        orderDTOList.add(new OrderDTO(9, "Gaming Chair", "2025-01-21", 15999.0, "Delivered", "Cash on Delivery", "2025-01-25", "Delivered successfully"));
        orderDTOList.add(new OrderDTO(10, "Air Conditioner", "2025-01-22", 35999.0, "Shipped", "Credit Card", "2025-01-30", "Dispatched from warehouse"));
        orderDTOList.add(new OrderDTO(11, "Microwave Oven", "2025-01-23", 13999.0, "Delivered", "UPI", "2025-01-28", "Delivered without damage"));
        orderDTOList.add(new OrderDTO(12, "Refrigerator", "2025-01-24", 28990.0, "Pending", "Net Banking", "2025-02-01", "Payment pending"));
        orderDTOList.add(new OrderDTO(13, "Bluetooth Speaker", "2025-01-25", 4999.0, "Shipped", "Credit Card", "2025-01-29", "In transit"));
        orderDTOList.add(new OrderDTO(14, "Washing Machine", "2025-01-26", 27990.0, "Delivered", "Debit Card", "2025-02-02", "Customer feedback pending"));
        orderDTOList.add(new OrderDTO(15, "Office Desk", "2025-01-27", 11999.0, "Cancelled", "UPI", "2025-02-05", "Cancelled by customer"));

        return orderDTOList;
    }

    @Bean("products")
    public List<ProductDTO> getProductInfo(){
        List<ProductDTO> productDTOList = new ArrayList<>();

        productDTOList.add(new ProductDTO(1, "Wireless Mouse", "Ergonomic wireless mouse", "Electronics", 899.0, 150, 4.5, "Logitech"));
        productDTOList.add(new ProductDTO(2, "Mechanical Keyboard", "RGB backlit keyboard", "Electronics", 2999.0, 75, 4.6, "Corsair"));
        productDTOList.add(new ProductDTO(3, "Bluetooth Headphones", "Noise-cancelling headphones", "Electronics", 3999.0, 120, 4.7, "Sony"));
        productDTOList.add(new ProductDTO(4, "Smartphone Case", "Shockproof phone case", "Accessories", 499.0, 300, 4.3, "Spigen"));
        productDTOList.add(new ProductDTO(5, "LED Monitor", "24-inch full HD monitor", "Electronics", 12499.0, 50, 4.5, "Dell"));
        productDTOList.add(new ProductDTO(6, "Gaming Chair", "Ergonomic gaming chair", "Furniture", 15999.0, 20, 4.4, "Secretlab"));
        productDTOList.add(new ProductDTO(7, "External Hard Drive", "1TB portable HDD", "Electronics", 3999.0, 80, 4.6, "Seagate"));
        productDTOList.add(new ProductDTO(8, "Water Bottle", "1L stainless steel bottle", "Home & Kitchen", 799.0, 200, 4.5, "Milton"));
        productDTOList.add(new ProductDTO(9, "Microwave Oven", "20L convection microwave", "Home Appliances", 7499.0, 35, 4.3, "Samsung"));
        productDTOList.add(new ProductDTO(10, "Air Purifier", "HEPA filter purifier", "Home Appliances", 12499.0, 40, 4.6, "Philips"));
        productDTOList.add(new ProductDTO(11, "Smart Watch", "Fitness tracking smartwatch", "Electronics", 9999.0, 60, 4.7, "Apple"));
        productDTOList.add(new ProductDTO(12, "Electric Kettle", "1.7L stainless steel kettle", "Home Appliances", 1999.0, 100, 4.4, "Bajaj"));
        productDTOList.add(new ProductDTO(13, "Laptop Stand", "Adjustable aluminum stand", "Accessories", 1299.0, 150, 4.5, "AmazonBasics"));
        productDTOList.add(new ProductDTO(14, "Desk Lamp", "LED desk lamp with dimmer", "Home & Kitchen", 899.0, 120, 4.3, "Philips"));
        productDTOList.add(new ProductDTO(15, "Portable Speaker", "Bluetooth mini speaker", "Electronics", 2499.0, 75, 4.6, "JBL"));

        return productDTOList;
    }

    @Bean("projectors")
    public List<ProjectorDTO> getProjectorsInfo(){
        List<ProjectorDTO> projectorDTOList = new ArrayList<>();
        projectorDTOList.add(new ProjectorDTO(1, "Epson", "1080p", 3200, 44999.0, true, "White", "LCD"));
        projectorDTOList.add(new ProjectorDTO(2, "BenQ", "4K", 3000, 89999.0, true, "Black", "DLP"));
        projectorDTOList.add(new ProjectorDTO(3, "Sony", "1080p", 2800, 59999.0, false, "White", "LCD"));
        projectorDTOList.add(new ProjectorDTO(4, "LG", "4K", 3500, 99999.0, true, "Grey", "LED"));
        projectorDTOList.add(new ProjectorDTO(5, "Optoma", "1080p", 3600, 54999.0, false, "Black", "DLP"));
        projectorDTOList.add(new ProjectorDTO(6, "ViewSonic", "720p", 2500, 24999.0, false, "White", "LCD"));
        projectorDTOList.add(new ProjectorDTO(7, "XGIMI", "1080p", 3000, 69999.0, true, "Silver", "LED"));
        projectorDTOList.add(new ProjectorDTO(8, "Acer", "1080p", 2800, 39999.0, false, "Black", "DLP"));
        projectorDTOList.add(new ProjectorDTO(9, "Philips", "720p", 2000, 21999.0, false, "White", "LED"));
        projectorDTOList.add(new ProjectorDTO(10, "Nebula", "1080p", 3000, 47999.0, true, "Black", "LED"));
        projectorDTOList.add(new ProjectorDTO(11, "BenQ", "1080p", 3200, 52999.0, true, "White", "DLP"));
        projectorDTOList.add(new ProjectorDTO(12, "Sony", "4K", 3600, 109999.0, true, "Black", "LCD"));
        projectorDTOList.add(new ProjectorDTO(13, "Epson", "1080p", 3100, 46999.0, true, "Grey", "LCD"));
        projectorDTOList.add(new ProjectorDTO(14, "LG", "1080p", 3300, 59999.0, false, "White", "LED"));
        projectorDTOList.add(new ProjectorDTO(15, "Optoma", "4K", 4000, 119999.0, true, "Black", "DLP"));

        return projectorDTOList;
    }

    @Bean("restaurants")
    public List<RestaurantDTO> getRestaurantsInfo(){
        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();

        restaurantDTOList.add(new RestaurantDTO(1, "The Spice House", "Indian", "Bengaluru", 4.5, false, 120, 2005));
        restaurantDTOList.add(new RestaurantDTO(2, "Green Leaf", "Vegetarian", "Mumbai", 4.2, true, 80, 2010));
        restaurantDTOList.add(new RestaurantDTO(3, "Pasta Bella", "Italian", "Chennai", 4.6, false, 100, 2012));
        restaurantDTOList.add(new RestaurantDTO(4, "Sushi World", "Japanese", "Hyderabad", 4.8, false, 60, 2015));
        restaurantDTOList.add(new RestaurantDTO(5, "Tandoori Nights", "Indian", "Delhi", 4.3, false, 150, 2000));
        restaurantDTOList.add(new RestaurantDTO(6, "Veggie Delight", "Vegetarian", "Pune", 4.4, true, 70, 2011));
        restaurantDTOList.add(new RestaurantDTO(7, "Burger Hub", "Fast Food", "Kolkata", 4.0, false, 90, 2013));
        restaurantDTOList.add(new RestaurantDTO(8, "Curry Palace", "Indian", "Jaipur", 4.5, false, 110, 2008));
        restaurantDTOList.add(new RestaurantDTO(9, "Dragon Wok", "Chinese", "Bengaluru", 4.6, false, 85, 2014));
        restaurantDTOList.add(new RestaurantDTO(10, "Mediterraneo", "Mediterranean", "Chennai", 4.7, false, 95, 2016));
        restaurantDTOList.add(new RestaurantDTO(11, "Cafe Mocha", "Cafe", "Mumbai", 4.3, true, 50, 2018));
        restaurantDTOList.add(new RestaurantDTO(12, "Spicy Grill", "Barbecue", "Hyderabad", 4.2, false, 130, 2009));
        restaurantDTOList.add(new RestaurantDTO(13, "The Vegan Bistro", "Vegan", "Pune", 4.5, true, 60, 2017));
        restaurantDTOList.add(new RestaurantDTO(14, "Royal Feast", "Indian", "Delhi", 4.4, false, 140, 2003));
        restaurantDTOList.add(new RestaurantDTO(15, "Noodle Express", "Chinese", "Kolkata", 4.1, false, 80, 2012));

        return restaurantDTOList;
    }

    @Bean("routers")
    public List<RouterDTO> getRoutersInfo(){
        List<RouterDTO> routerDTOList = new ArrayList<>();

        routerDTOList.add(new RouterDTO(1, "TP-Link", 1200, 3, true, 2999.0, "2.4/5 GHz", false));
        routerDTOList.add(new RouterDTO(2, "Netgear", 1800, 4, true, 3999.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(3, "Asus", 2400, 4, true, 5499.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(4, "D-Link", 1200, 2, false, 2499.0, "2.4 GHz", false));
        routerDTOList.add(new RouterDTO(5, "Linksys", 3200, 4, true, 6999.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(6, "Xiaomi", 1200, 3, true, 1999.0, "2.4/5 GHz", false));
        routerDTOList.add(new RouterDTO(7, "TP-Link", 3000, 6, true, 8999.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(8, "Netgear", 1200, 3, false, 2999.0, "2.4 GHz", false));
        routerDTOList.add(new RouterDTO(9, "Asus", 2600, 4, true, 6499.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(10, "D-Link", 1500, 3, true, 3499.0, "2.4/5 GHz", false));
        routerDTOList.add(new RouterDTO(11, "Linksys", 2400, 4, true, 5999.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(12, "Xiaomi", 1800, 3, true, 2499.0, "2.4/5 GHz", false));
        routerDTOList.add(new RouterDTO(13, "TP-Link", 2000, 4, true, 3999.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(14, "Netgear", 3200, 6, true, 8999.0, "2.4/5 GHz", true));
        routerDTOList.add(new RouterDTO(15, "Asus", 1800, 3, true, 4599.0, "2.4/5 GHz", false));

        return routerDTOList;
    }

    @Bean("shoes")
    public List<ShoeDTO> getShoesInfo(){
        List<ShoeDTO> shoeDTOList = new ArrayList<>();

        shoeDTOList.add(new ShoeDTO(1, "Nike", "Running", 4999.0, "Black", 9, "Mesh", false));
        shoeDTOList.add(new ShoeDTO(2, "Adidas", "Sports", 5499.0, "White", 10, "Synthetic", false));
        shoeDTOList.add(new ShoeDTO(3, "Puma", "Casual", 3999.0, "Blue", 8, "Leather", false));
        shoeDTOList.add(new ShoeDTO(4, "Reebok", "Training", 4299.0, "Grey", 9, "Mesh", true));
        shoeDTOList.add(new ShoeDTO(5, "New Balance", "Running", 4799.0, "Red", 10, "Synthetic", false));
        shoeDTOList.add(new ShoeDTO(6, "Skechers", "Casual", 3599.0, "Black", 8, "Leather", false));
        shoeDTOList.add(new ShoeDTO(7, "Asics", "Sports", 5999.0, "Blue", 9, "Mesh", true));
        shoeDTOList.add(new ShoeDTO(8, "Under Armour", "Training", 5299.0, "White", 10, "Synthetic", false));
        shoeDTOList.add(new ShoeDTO(9, "Converse", "Casual", 2999.0, "Red", 9, "Canvas", false));
        shoeDTOList.add(new ShoeDTO(10, "Vans", "Skate", 3499.0, "Black", 8, "Canvas", false));
        shoeDTOList.add(new ShoeDTO(11, "Nike", "Football", 6999.0, "White", 10, "Synthetic", true));
        shoeDTOList.add(new ShoeDTO(12, "Adidas", "Running", 5799.0, "Grey", 9, "Mesh", true));
        shoeDTOList.add(new ShoeDTO(13, "Puma", "Casual", 3999.0, "Blue", 8, "Leather", false));
        shoeDTOList.add(new ShoeDTO(14, "Reebok", "Sports", 4499.0, "Black", 10, "Mesh", true));
        shoeDTOList.add(new ShoeDTO(15, "New Balance", "Training", 4999.0, "White", 9, "Synthetic", false));

        return shoeDTOList;
    }

    @Bean("shoppingMall")
    public List<ShoppingMallDTO> getShoppingMallInfo(){
        List<ShoppingMallDTO> shoppingMallDTOList = new ArrayList<>();

        shoppingMallDTOList.add(new ShoppingMallDTO(1, "Phoenix Marketcity", "Bengaluru", 250, 5, true, 120000.0, 2003));
        shoppingMallDTOList.add(new ShoppingMallDTO(2, "DLF Mall", "Delhi", 300, 6, true, 150000.0, 2005));
        shoppingMallDTOList.add(new ShoppingMallDTO(3, "Inorbit Mall", "Mumbai", 220, 4, true, 110000.0, 2002));
        shoppingMallDTOList.add(new ShoppingMallDTO(4, "VR Mall", "Chennai", 180, 3, false, 90000.0, 2010));
        shoppingMallDTOList.add(new ShoppingMallDTO(5, "Forum Mall", "Bengaluru", 200, 4, true, 100000.0, 2004));
        shoppingMallDTOList.add(new ShoppingMallDTO(6, "Lulu Mall", "Kochi", 250, 5, true, 125000.0, 2013));
        shoppingMallDTOList.add(new ShoppingMallDTO(7, "Express Avenue", "Chennai", 230, 4, true, 115000.0, 2007));
        shoppingMallDTOList.add(new ShoppingMallDTO(8, "Mantri Square", "Bengaluru", 280, 5, true, 130000.0, 2008));
        shoppingMallDTOList.add(new ShoppingMallDTO(9, "Select Citywalk", "Delhi", 260, 6, true, 140000.0, 2005));
        shoppingMallDTOList.add(new ShoppingMallDTO(10, "City Centre Mall", "Kolkata", 190, 4, false, 95000.0, 2006));
        shoppingMallDTOList.add(new ShoppingMallDTO(11, "Orion Mall", "Bengaluru", 210, 5, true, 110000.0, 2011));
        shoppingMallDTOList.add(new ShoppingMallDTO(12, "R City Mall", "Mumbai", 240, 5, true, 120000.0, 2009));
        shoppingMallDTOList.add(new ShoppingMallDTO(13, "Forum Vijaya", "Chennai", 200, 4, true, 100000.0, 2002));
        shoppingMallDTOList.add(new ShoppingMallDTO(14, "Phoenix Palassio", "Mumbai", 270, 5, true, 135000.0, 2012));
        shoppingMallDTOList.add(new ShoppingMallDTO(15, "Central Mall", "Hyderabad", 220, 4, true, 110000.0, 2005));

        return shoppingMallDTOList;
    }

    @Bean("sports")
    public List<SportDTO> getSportsInfo(){
        List<SportDTO> sportDTOList = new ArrayList<>();

        sportDTOList.add(new SportDTO(1, "Football", "Team", 11, "England", "Ball, Goalposts", "High", true));
        sportDTOList.add(new SportDTO(2, "Basketball", "Team", 5, "USA", "Ball, Hoop", "High", true));
        sportDTOList.add(new SportDTO(3, "Tennis", "Individual", 1, "France", "Racket, Ball", "High", true));
        sportDTOList.add(new SportDTO(4, "Cricket", "Team", 11, "England", "Bat, Ball, Wickets", "High", true));
        sportDTOList.add(new SportDTO(5, "Volleyball", "Team", 6, "USA", "Ball, Net", "Medium", true));
        sportDTOList.add(new SportDTO(6, "Badminton", "Individual", 1, "India", "Racket, Shuttlecock", "Medium", true));
        sportDTOList.add(new SportDTO(7, "Golf", "Individual", 1, "Scotland", "Club, Ball", "Medium", true));
        sportDTOList.add(new SportDTO(8, "Hockey", "Team", 11, "England", "Stick, Ball/Puck", "High", true));
        sportDTOList.add(new SportDTO(9, "Swimming", "Individual", 1, "Ancient Rome", "Swimwear", "High", true));
        sportDTOList.add(new SportDTO(10, "Boxing", "Individual", 1, "USA", "Gloves", "High", true));
        sportDTOList.add(new SportDTO(11, "Table Tennis", "Individual", 1, "England", "Paddle, Ball", "High", true));
        sportDTOList.add(new SportDTO(12, "Rugby", "Team", 15, "England", "Ball, Goalposts", "Medium", true));
        sportDTOList.add(new SportDTO(13, "Archery", "Individual", 1, "England", "Bow, Arrows", "Medium", true));
        sportDTOList.add(new SportDTO(14, "Gymnastics", "Individual", 1, "Germany", "Gym Equipment", "High", true));
        sportDTOList.add(new SportDTO(15, "Cycling", "Individual", 1, "France", "Bicycle", "Medium", true));

        return sportDTOList;
    }

    @Bean("speakers")
    public List<SpeakerDTO> getSpeakersInfo(){
        List<SpeakerDTO> speakerDTOList = new ArrayList<>();

        speakerDTOList.add(new SpeakerDTO(1, "JBL", 20, true, 2999.0, 10, "Black", "Portable"));
        speakerDTOList.add(new SpeakerDTO(2, "Sony", 30, true, 4999.0, 12, "White", "Portable"));
        speakerDTOList.add(new SpeakerDTO(3, "Bose", 50, true, 14999.0, 15, "Grey", "Home Theater"));
        speakerDTOList.add(new SpeakerDTO(4, "Philips", 40, false, 5999.0, 0, "Black", "Wired"));
        speakerDTOList.add(new SpeakerDTO(5, "Boat", 25, true, 1999.0, 8, "Red", "Portable"));
        speakerDTOList.add(new SpeakerDTO(6, "LG", 60, false, 12999.0, 0, "Black", "Home Theater"));
        speakerDTOList.add(new SpeakerDTO(7, "Samsung", 35, true, 7999.0, 10, "White", "Portable"));
        speakerDTOList.add(new SpeakerDTO(8, "Infinity", 45, true, 10999.0, 12, "Black", "Home Theater"));
        speakerDTOList.add(new SpeakerDTO(9, "Sony", 20, true, 3499.0, 8, "Blue", "Portable"));
        speakerDTOList.add(new SpeakerDTO(10, "JBL", 50, true, 15999.0, 15, "Black", "Home Theater"));
        speakerDTOList.add(new SpeakerDTO(11, "Boat", 15, true, 1499.0, 6, "Black", "Portable"));
        speakerDTOList.add(new SpeakerDTO(12, "Philips", 30, false, 4999.0, 0, "Grey", "Wired"));
        speakerDTOList.add(new SpeakerDTO(13, "LG", 40, true, 8999.0, 12, "White", "Portable"));
        speakerDTOList.add(new SpeakerDTO(14, "Samsung", 25, true, 5999.0, 8, "Black", "Portable"));
        speakerDTOList.add(new SpeakerDTO(15, "Bose", 60, false, 17999.0, 0, "Grey", "Home Theater"));

        return speakerDTOList;
    }

    @Bean("superMarket")
    public List<SuperMarketDTO> getSuperMarketInfo(){
        List<SuperMarketDTO> superMarketDTOList = new ArrayList<>();

        superMarketDTOList.add(new SuperMarketDTO(1, "Big Bazaar", "Bengaluru", 5000, true, 120, 4.5, 2002));
        superMarketDTOList.add(new SuperMarketDTO(2, "Reliance Fresh", "Mumbai", 4500, true, 100, 4.3, 2005));
        superMarketDTOList.add(new SuperMarketDTO(3, "Spencer's", "Chennai", 4000, false, 80, 4.2, 2003));
        superMarketDTOList.add(new SuperMarketDTO(4, "More Supermarket", "Delhi", 3500, true, 70, 4.0, 2007));
        superMarketDTOList.add(new SuperMarketDTO(5, "D-Mart", "Pune", 5500, true, 150, 4.6, 2001));
        superMarketDTOList.add(new SuperMarketDTO(6, "Foodhall", "Bengaluru", 3000, false, 60, 4.4, 2010));
        superMarketDTOList.add(new SuperMarketDTO(7, "Nature's Basket", "Mumbai", 2500, true, 50, 4.3, 2008));
        superMarketDTOList.add(new SuperMarketDTO(8, "HyperCity", "Hyderabad", 4800, true, 110, 4.5, 2004));
        superMarketDTOList.add(new SuperMarketDTO(9, "Star Bazaar", "Kolkata", 4200, false, 90, 4.2, 2006));
        superMarketDTOList.add(new SuperMarketDTO(10, "Easyday", "Jaipur", 3500, true, 70, 4.1, 2009));
        superMarketDTOList.add(new SuperMarketDTO(11, "Big Bazaar", "Chandigarh", 5000, true, 120, 4.4, 2003));
        superMarketDTOList.add(new SuperMarketDTO(12, "Reliance Fresh", "Bhopal", 4500, true, 100, 4.3, 2005));
        superMarketDTOList.add(new SuperMarketDTO(13, "Spencer's", "Nagpur", 4000, false, 80, 4.2, 2007));
        superMarketDTOList.add(new SuperMarketDTO(14, "More Supermarket", "Indore", 3500, true, 70, 4.0, 2010));
        superMarketDTOList.add(new SuperMarketDTO(15, "D-Mart", "Surat", 5500, true, 150, 4.6, 2001));

        return superMarketDTOList;
    }

    @Bean("tv")
    public List<TvDTO> getTvInfo(){
        List<TvDTO> tvDTOList = new ArrayList<>();

        tvDTOList.add(new TvDTO(1, "Samsung", "QLED Q60A", 55, "QLED", true, 69999.0, "4K"));
        tvDTOList.add(new TvDTO(2, "LG", "OLED C1", 65, "OLED", true, 129999.0, "4K"));
        tvDTOList.add(new TvDTO(3, "Sony", "Bravia X80J", 50, "LED", true, 59999.0, "4K"));
        tvDTOList.add(new TvDTO(4, "TCL", "P725", 55, "LED", true, 44999.0, "4K"));
        tvDTOList.add(new TvDTO(5, "Samsung", "Crystal UHD TU7000", 43, "LED", true, 39999.0, "4K"));
        tvDTOList.add(new TvDTO(6, "LG", "NanoCell 90", 55, "LED", true, 64999.0, "4K"));
        tvDTOList.add(new TvDTO(7, "Sony", "Bravia X90J", 65, "LED", true, 89999.0, "4K"));
        tvDTOList.add(new TvDTO(8, "TCL", "C815", 65, "QLED", true, 79999.0, "4K"));
        tvDTOList.add(new TvDTO(9, "Samsung", "QLED Q80T", 75, "QLED", true, 149999.0, "4K"));
        tvDTOList.add(new TvDTO(10, "LG", "OLED B1", 55, "OLED", true, 119999.0, "4K"));
        tvDTOList.add(new TvDTO(11, "Sony", "Bravia X85J", 55, "LED", true, 69999.0, "4K"));
        tvDTOList.add(new TvDTO(12, "TCL", "P725", 50, "LED", true, 42999.0, "4K"));
        tvDTOList.add(new TvDTO(13, "Samsung", "Crystal UHD TU8000", 50, "LED", true, 45999.0, "4K"));
        tvDTOList.add(new TvDTO(14, "LG", "NanoCell 80", 50, "LED", true, 54999.0, "4K"));
        tvDTOList.add(new TvDTO(15, "Sony", "Bravia X90K", 65, "LED", true, 99999.0, "4K"));

        return tvDTOList;
    }

    @Bean("users")
    public List<UserDTO> getUserInfo(){
        List<UserDTO> userDTOList = new ArrayList<>();

        userDTOList.add(new UserDTO(1, "Rashmi Mathad", "Software Engineer", 28, "Female", "rashmi1@example.com", 9876543210L, "Bengaluru"));
        userDTOList.add(new UserDTO(2, "Ankit Sharma", "Doctor", 35, "Male", "ankit2@example.com", 9876543211L, "Delhi"));
        userDTOList.add(new UserDTO(3, "Priya Singh", "Teacher", 30, "Female", "priya3@example.com", 9876543212L, "Mumbai"));
        userDTOList.add(new UserDTO(4, "Rahul Verma", "Lawyer", 32, "Male", "rahul4@example.com", 9876543213L, "Chennai"));
        userDTOList.add(new UserDTO(5, "Sneha Patel", "Designer", 27, "Female", "sneha5@example.com", 9876543214L, "Pune"));
        userDTOList.add(new UserDTO(6, "Amit Kumar", "Engineer", 29, "Male", "amit6@example.com", 9876543215L, "Hyderabad"));
        userDTOList.add(new UserDTO(7, "Neha Joshi", "Architect", 31, "Female", "neha7@example.com", 9876543216L, "Bengaluru"));
        userDTOList.add(new UserDTO(8, "Vikram Singh", "Pilot", 34, "Male", "vikram8@example.com", 9876543217L, "Delhi"));
        userDTOList.add(new UserDTO(9, "Tanya Mehta", "Chef", 26, "Female", "tanya9@example.com", 9876543218L, "Mumbai"));
        userDTOList.add(new UserDTO(10, "Karan Malhotra", "Actor", 33, "Male", "karan10@example.com", 9876543219L, "Chennai"));
        userDTOList.add(new UserDTO(11, "Ritu Sharma", "Writer", 28, "Female", "ritu11@example.com", 9876543220L, "Pune"));
        userDTOList.add(new UserDTO(12, "Manish Gupta", "Businessman", 36, "Male", "manish12@example.com", 9876543221L, "Hyderabad"));
        userDTOList.add(new UserDTO(13, "Pooja Reddy", "Doctor", 30, "Female", "pooja13@example.com", 9876543222L, "Bengaluru"));
        userDTOList.add(new UserDTO(14, "Siddharth Jain", "Engineer", 29, "Male", "siddharth14@example.com", 9876543223L, "Delhi"));
        userDTOList.add(new UserDTO(15, "Ananya Kapoor", "Designer", 27, "Female", "ananya15@example.com", 9876543224L, "Mumbai"));

        return userDTOList;
    }

    @Bean("vehicles")
    public List<VehicleDTO> getVehicleInfo(){
        List<VehicleDTO> vehicleDTOList = new ArrayList<>();

        vehicleDTOList.add(new VehicleDTO(1, "Honda City", "ZX", "Sedan", "Petrol", 50, 1200000.0, 2020));
        vehicleDTOList.add(new VehicleDTO(2, "Toyota Fortuner", "Legender", "SUV", "Diesel", 80, 3500000.0, 2021));
        vehicleDTOList.add(new VehicleDTO(3, "Maruti Swift", "VXI", "Hatchback", "Petrol", 37, 700000.0, 2019));
        vehicleDTOList.add(new VehicleDTO(4, "Hyundai Creta", "SX", "SUV", "Petrol", 50, 1500000.0, 2021));
        vehicleDTOList.add(new VehicleDTO(5, "Kia Seltos", "GT Line", "SUV", "Petrol", 50, 1800000.0, 2022));
        vehicleDTOList.add(new VehicleDTO(6, "Mahindra Thar", "CRDe", "SUV", "Diesel", 57, 1400000.0, 2020));
        vehicleDTOList.add(new VehicleDTO(7, "BMW X5", "M", "SUV", "Diesel", 83, 7500000.0, 2021));
        vehicleDTOList.add(new VehicleDTO(8, "Audi A4", "Premium", "Sedan", "Petrol", 54, 4100000.0, 2022));
        vehicleDTOList.add(new VehicleDTO(9, "Tata Nexon", "XZ+", "SUV", "Petrol", 44, 950000.0, 2021));
        vehicleDTOList.add(new VehicleDTO(10, "Mercedes C-Class", "C200", "Sedan", "Petrol", 66, 5200000.0, 2022));
        vehicleDTOList.add(new VehicleDTO(11, "Renault Duster", "RXZ", "SUV", "Diesel", 50, 1100000.0, 2020));
        vehicleDTOList.add(new VehicleDTO(12, "Honda Amaze", "VX", "Sedan", "Petrol", 40, 900000.0, 2021));
        vehicleDTOList.add(new VehicleDTO(13, "Ford EcoSport", "Titanium", "SUV", "Petrol", 52, 1200000.0, 2020));
        vehicleDTOList.add(new VehicleDTO(14, "Hyundai i20", "Asta", "Hatchback", "Petrol", 37, 850000.0, 2021));
        vehicleDTOList.add(new VehicleDTO(15, "Jeep Compass", "Limited", "SUV", "Diesel", 60, 2500000.0, 2022));

        return vehicleDTOList;
    }

    @Bean("washingMachine")
    public List<WashingMachineDTO> getWashingMachineInfo(){
        List<WashingMachineDTO> washingMachineDTOList = new ArrayList<>();

        washingMachineDTOList.add(new WashingMachineDTO(1, "LG", "Front Load", 7, 1200, 34999.0, true, 5));
        washingMachineDTOList.add(new WashingMachineDTO(2, "Samsung", "Top Load", 6, 1000, 24999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(3, "IFB", "Front Load", 8, 1400, 39999.0, true, 5));
        washingMachineDTOList.add(new WashingMachineDTO(4, "Bosch", "Front Load", 7, 1200, 35999.0, true, 5));
        washingMachineDTOList.add(new WashingMachineDTO(5, "Whirlpool", "Top Load", 6, 1000, 22999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(6, "Haier", "Top Load", 6, 1000, 21999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(7, "LG", "Front Load", 9, 1400, 42999.0, true, 5));
        washingMachineDTOList.add(new WashingMachineDTO(8, "Samsung", "Front Load", 7, 1200, 36999.0, true, 5));
        washingMachineDTOList.add(new WashingMachineDTO(9, "IFB", "Top Load", 6, 1000, 23999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(10, "Bosch", "Front Load", 8, 1400, 41999.0, true, 5));
        washingMachineDTOList.add(new WashingMachineDTO(11, "Whirlpool", "Top Load", 7, 1000, 24999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(12, "Haier", "Front Load", 6, 1200, 27999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(13, "LG", "Top Load", 7, 1000, 25999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(14, "Samsung", "Top Load", 8, 1000, 29999.0, false, 4));
        washingMachineDTOList.add(new WashingMachineDTO(15, "Bosch", "Front Load", 9, 1400, 44999.0, true, 5));

        return washingMachineDTOList;
    }

    @Bean("watches")
    public List<WatchDTO> getWatchesInfo(){
        List<WatchDTO> watchDTOList = new ArrayList<>();
        watchDTOList.add(new WatchDTO(1, "Fossil", "Analog", "Leather", 7999.0, true, "Brown", 42.0));
        watchDTOList.add(new WatchDTO(2, "Titan", "Analog", "Steel", 5999.0, true, "Silver", 40.0));
        watchDTOList.add(new WatchDTO(3, "Casio", "Digital", "Resin", 3499.0, true, "Black", 44.0));
        watchDTOList.add(new WatchDTO(4, "Seiko", "Analog", "Leather", 8999.0, true, "Black", 42.0));
        watchDTOList.add(new WatchDTO(5, "Rolex", "Analog", "Steel", 750000.0, true, "Gold", 40.0));
        watchDTOList.add(new WatchDTO(6, "Timex", "Digital", "Rubber", 2999.0, true, "Blue", 43.0));
        watchDTOList.add(new WatchDTO(7, "Fossil", "Analog", "Leather", 8499.0, true, "Black", 42.0));
        watchDTOList.add(new WatchDTO(8, "Titan", "Analog", "Steel", 6999.0, true, "Gold", 41.0));
        watchDTOList.add(new WatchDTO(9, "Casio", "Digital", "Resin", 3999.0, true, "Red", 44.0));
        watchDTOList.add(new WatchDTO(10, "Seiko", "Analog", "Steel", 9999.0, true, "Silver", 42.0));
        watchDTOList.add(new WatchDTO(11, "Rolex", "Analog", "Gold", 800000.0, true, "Gold", 40.0));
        watchDTOList.add(new WatchDTO(12, "Timex", "Digital", "Rubber", 3299.0, true, "Black", 43.0));
        watchDTOList.add(new WatchDTO(13, "Fossil", "Analog", "Leather", 7799.0, true, "Brown", 42.0));
        watchDTOList.add(new WatchDTO(14, "Titan", "Analog", "Steel", 6499.0, true, "Black", 41.0));
        watchDTOList.add(new WatchDTO(15, "Casio", "Digital", "Resin", 3699.0, true, "Green", 44.0));

        return watchDTOList;
    }

    @Bean("weapons")
    public List<WeaponDTO> getWeaponsInfo(){
        List<WeaponDTO> weaponDTOList = new ArrayList<>();
        weaponDTOList.add(new WeaponDTO(1, "AK-47", "Rifle", "Steel", "Russia", 4.3, 75000.0, true));
        weaponDTOList.add(new WeaponDTO(2, "Glock 17", "Pistol", "Polymer/Steel", "Austria", 0.9, 45000.0, true));
        weaponDTOList.add(new WeaponDTO(3, "M16", "Rifle", "Steel", "USA", 3.8, 80000.0, true));
        weaponDTOList.add(new WeaponDTO(4, "Remington 700", "Sniper Rifle", "Steel", "USA", 4.5, 120000.0, true));
        weaponDTOList.add(new WeaponDTO(5, "Desert Eagle", "Pistol", "Steel", "USA", 1.8, 90000.0, true));
        weaponDTOList.add(new WeaponDTO(6, "Uzi", "Submachine Gun", "Steel", "Israel", 3.5, 70000.0, true));
        weaponDTOList.add(new WeaponDTO(7, "MP5", "Submachine Gun", "Steel", "Germany", 3.2, 75000.0, true));
        weaponDTOList.add(new WeaponDTO(8, "AKM", "Rifle", "Steel", "Russia", 4.1, 72000.0, true));
        weaponDTOList.add(new WeaponDTO(9, "SIG Sauer P226", "Pistol", "Steel", "Switzerland", 0.95, 47000.0, true));
        weaponDTOList.add(new WeaponDTO(10, "FN SCAR", "Rifle", "Steel", "Belgium", 3.9, 85000.0, true));
        weaponDTOList.add(new WeaponDTO(11, "Beretta 92FS", "Pistol", "Steel", "Italy", 0.95, 48000.0, true));
        weaponDTOList.add(new WeaponDTO(12, "AK-74", "Rifle", "Steel", "Russia", 3.5, 73000.0, true));
        weaponDTOList.add(new WeaponDTO(13, "Colt M1911", "Pistol", "Steel", "USA", 1.1, 50000.0, true));
        weaponDTOList.add(new WeaponDTO(14, "Steyr AUG", "Rifle", "Steel", "Austria", 4.0, 90000.0, true));
        weaponDTOList.add(new WeaponDTO(15, "Taurus PT92", "Pistol", "Steel", "Brazil", 0.98, 46000.0, true));

        return weaponDTOList;
    }
}
