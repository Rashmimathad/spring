package com.xworkz.dependencyinjection;

import com.xworkz.dependencyinjection.components.airline.Airline;
import com.xworkz.dependencyinjection.components.airport.Airport;
import com.xworkz.dependencyinjection.components.aquarium.Aquarium;
import com.xworkz.dependencyinjection.components.armybase.ArmyBase;
import com.xworkz.dependencyinjection.components.auto.Auto;
import com.xworkz.dependencyinjection.components.bank.Bank;
import com.xworkz.dependencyinjection.components.bicycle.Bicycle;
import com.xworkz.dependencyinjection.components.building.Building;
import com.xworkz.dependencyinjection.components.busdepot.BusDepot;
import com.xworkz.dependencyinjection.components.camera.Camera;
import com.xworkz.dependencyinjection.components.cinema.Cinema;
import com.xworkz.dependencyinjection.components.classroom.ClassRoom;
import com.xworkz.dependencyinjection.components.clock.Clock;
import com.xworkz.dependencyinjection.components.college.College;
import com.xworkz.dependencyinjection.components.company.Company;
import com.xworkz.dependencyinjection.components.conference.Conference;
import com.xworkz.dependencyinjection.components.continent.Continent;
import com.xworkz.dependencyinjection.components.country.Country;
import com.xworkz.dependencyinjection.components.court.Court;
import com.xworkz.dependencyinjection.components.datacenter.DataCenter;
import com.xworkz.dependencyinjection.components.ecommerce.ECommerce;
import com.xworkz.dependencyinjection.components.event.Event;
import com.xworkz.dependencyinjection.components.exam.Exam;
import com.xworkz.dependencyinjection.components.factory.Factory;
import com.xworkz.dependencyinjection.components.fan.Fan;
import com.xworkz.dependencyinjection.components.farm.Farm;
import com.xworkz.dependencyinjection.components.glasses.Glasses;
import com.xworkz.dependencyinjection.components.hospital.Hospital;
import com.xworkz.dependencyinjection.components.hotel.Hotel;
import com.xworkz.dependencyinjection.components.house.House;
import com.xworkz.dependencyinjection.components.institute.Institute;
import com.xworkz.dependencyinjection.components.library.Library;
import com.xworkz.dependencyinjection.components.lock.Lock;
import com.xworkz.dependencyinjection.components.market.Market;
import com.xworkz.dependencyinjection.components.mobile.Mobile;
import com.xworkz.dependencyinjection.components.mobileapp.MobileApp;
import com.xworkz.dependencyinjection.components.navyship.NavyShip;
import com.xworkz.dependencyinjection.components.network.Network;
import com.xworkz.dependencyinjection.components.onlineportal.OnlinePortal;
import com.xworkz.dependencyinjection.components.park.Park;
import com.xworkz.dependencyinjection.components.pen.Pen;
import com.xworkz.dependencyinjection.components.policestation.PoliceStation;
import com.xworkz.dependencyinjection.components.powerplant.PowerPlant;
import com.xworkz.dependencyinjection.components.prison.Prison;
import com.xworkz.dependencyinjection.components.radio.Radio;
import com.xworkz.dependencyinjection.components.railwaystation.RailwayStation;
import com.xworkz.dependencyinjection.components.school.School;
import com.xworkz.dependencyinjection.components.shirt.Shirt;
import com.xworkz.dependencyinjection.components.shoe.Shoe;
import com.xworkz.dependencyinjection.components.shoppingmall.ShoppingMall;
import com.xworkz.dependencyinjection.components.softwaresystem.SoftwareSystem;
import com.xworkz.dependencyinjection.components.staircase.Staircase;
import com.xworkz.dependencyinjection.components.stove.Stove;
import com.xworkz.dependencyinjection.components.torch.Torch;
import com.xworkz.dependencyinjection.components.tv.Tv;
import com.xworkz.dependencyinjection.components.university.University;
import com.xworkz.dependencyinjection.components.vehicle.Vehicle;
import com.xworkz.dependencyinjection.components.warehouse.Warehouse;
import com.xworkz.dependencyinjection.components.waterplant.WaterPlant;
import com.xworkz.dependencyinjection.components.zoo.Zoo;
import com.xworkz.dependencyinjection.conf.ComponentConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main( String[] args ) {
        System.out.println("Main started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);

        System.out.println();
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

        System.out.println();
        ShoppingMall shoppingMall = applicationContext.getBean(ShoppingMall.class);
        shoppingMall.setMallId(1);
        shoppingMall.setMallName("Orion");
        shoppingMall.setShop(shoppingMall.getShop());
        System.out.println("Shopping Mall : "+shoppingMall);

        ShoppingMall shoppingMall1 = applicationContext.getBean(ShoppingMall.class);
        shoppingMall1.setMallId(2);
        shoppingMall1.setMallName("Forum");
        shoppingMall1.setShop(shoppingMall1.getShop());
        System.out.println("Shopping Mall1 : "+ shoppingMall1);


        System.out.println();
        Airport airport = applicationContext.getBean(Airport.class);
        airport.setId(1);
        airport.setName("Hyderabad International Airport");
        airport.setTerminal(airport.getTerminal());
        System.out.println("Airport : "+airport);

        Airport airport1 = applicationContext.getBean(Airport.class);
        airport1.setId(2);
        airport1.setName("Bengaluru International Airport");
        airport1.setTerminal(airport1.getTerminal());
        System.out.println("Airport1 : "+airport1);

        System.out.println();
        School school = applicationContext.getBean(School.class);
        school.setSchoolId(1);
        school.setSchoolName("Brilliant Public School");
        school.setStudent(school.getStudent());
        System.out.println("School : "+ school);

        School school1 = applicationContext.getBean(School.class);
        school1.setSchoolId(2);
        school1.setSchoolName("Vidyaniketan School");
        school1.setStudent(school1.getStudent());
        System.out.println("School1 : "+ school1);

        System.out.println();
        College college = applicationContext.getBean(College.class);
        college.setCollegeId(1);
        college.setCollegeName("Bapuji Institute of Engineering and Technology");
        college.setDepartment(college.getDepartment());
        System.out.println("College : "+ college);

        College college1 = applicationContext.getBean(College.class);
        college1.setCollegeId(2);
        college1.setCollegeName("Ballari Institute of Technology and Management");
        college1.setDepartment(college1.getDepartment());
        System.out.println("College1 : "+ college1);


        System.out.println();
        University university = applicationContext.getBean(University.class);
        university.setId(1);
        university.setUniversityName("Kishkinda University");
        university.setFaculty(university.getFaculty());
        System.out.println("University : "+university);

        University university1 = applicationContext.getBean(University.class);
        university1.setId(2);
        university1.setUniversityName("Presidency University");
        university1.setFaculty(university1.getFaculty());
        System.out.println("University1 : "+ university1);

        System.out.println();
        Company company = applicationContext.getBean(Company.class);
        company.setId(1);
        company.setCompanyName("X-workz");
        company.setEmployee(company.getEmployee());
        System.out.println("Company : "+company);

        Company company1 = applicationContext.getBean(Company.class);
        company1.setId(2);
        company1.setCompanyName("TCS");
        company1.setEmployee(company1.getEmployee());
        System.out.println("Company1 : "+ company1);

        System.out.println();
        Bank bank = applicationContext.getBean(Bank.class);
        bank.setId(1);
        bank.setName("SBI Bank");
        bank.setAccount(bank.getAccount());
        System.out.println("Bank : "+bank);

        Bank bank1 = applicationContext.getBean(Bank.class);
        bank1.setId(2);
        bank1.setName("Canara Bank");
        bank1.setAccount(bank1.getAccount());
        System.out.println("Bank1 : "+ bank1);

        System.out.println();
        Library library = applicationContext.getBean(Library.class);
        library.setId(1);
        library.setName("Central Library");
        library.setBook(library.getBook());
        System.out.println("Library : "+library);

        Library library1 = applicationContext.getBean(Library.class);
        library1.setId(2);
        library1.setName("State Library");
        library1.setBook(library1.getBook());
        System.out.println("Library1 : "+ library1);

        System.out.println();
        Cinema cinema = applicationContext.getBean(Cinema.class);
        cinema.setId(1);
        cinema.setName("Kantara");
        cinema.setScreen(cinema.getScreen());
        System.out.println("Cinema : "+cinema);

        Cinema cinema1 = applicationContext.getBean(Cinema.class);
        cinema1.setId(2);
        cinema1.setName("Appu");
        cinema1.setScreen(cinema1.getScreen());
        System.out.println("Cinema1 : "+ cinema1);

        System.out.println();
        Airline airline = applicationContext.getBean(Airline.class);
        airline.setId(1);
        airline.setName("Air India");
        airline.setFlights(airline.getFlights());
        System.out.println("Airline : "+airline);

        Airline airline1 = applicationContext.getBean(Airline.class);
        airline1.setId(2);
        airline1.setName("Deccan Airways");
        airline1.setFlights(airline1.getFlights());
        System.out.println("Airline1 : "+ airline1);


        System.out.println();
        RailwayStation railwayStation = applicationContext.getBean(RailwayStation.class);
        railwayStation.setId(1);
        railwayStation.setName("Ballari Junction");
        railwayStation.setPlatform(railwayStation.getPlatform());
        System.out.println("Railway Station : "+railwayStation);

        RailwayStation railwayStation1 = applicationContext.getBean(RailwayStation.class);
        railwayStation1.setId(2);
        railwayStation1.setName("Bengaluru Junction");
        railwayStation1.setPlatform(railwayStation1.getPlatform());
        System.out.println("Railway Station1 : "+railwayStation1);

        System.out.println();
        BusDepot busDepot = applicationContext.getBean(BusDepot.class);
        busDepot.setId(1);
        busDepot.setName("Ballari Bus Stand");
        busDepot.setBus(busDepot.getBus());
        System.out.println("Bus Depot : "+busDepot);

        BusDepot busDepot1 = applicationContext.getBean(BusDepot.class);
        busDepot1.setId(2);
        busDepot1.setName("Kempegowda Bus Stand ");
        busDepot1.setBus(busDepot1.getBus());
        System.out.println("Bus Depot1 : "+ busDepot1);

        System.out.println();
        PoliceStation policeStation = applicationContext.getBean(PoliceStation.class);
        policeStation.setId(1);
        policeStation.setName("BrucePet Police Station");
        policeStation.setPolice(policeStation.getPolice());
        System.out.println("Police Station : "+policeStation);


        PoliceStation policeStation1 = applicationContext.getBean(PoliceStation.class);
        policeStation1.setId(2);
        policeStation1.setName("Rajajinagar Police Station");
        policeStation1.setPolice(policeStation1.getPolice());
        System.out.println("Police Station1 : "+policeStation1);

        System.out.println();
        Court court = applicationContext.getBean(Court.class);
        court.setId(1);
        court.setName("High Court");
        court.setJudge(court.getJudge());
        System.out.println("Court : "+court);

        Court court1 = applicationContext.getBean(Court.class);
        court1.setId(2);
        court1.setName("Supreme Court");
        court1.setJudge(court1.getJudge());
        System.out.println("Court1 : "+ court1);

        System.out.println();
        Prison prison = applicationContext.getBean(Prison.class);
        prison.setId(1);
        prison.setName("Ballari Prison");
        prison.setCell(prison.getCell());
        System.out.println("Prison : "+prison);

        Prison prison1 = applicationContext.getBean(Prison.class);
        prison1.setId(2);
        prison1.setName("Parappana Agrahaara");
        prison1.setCell(prison1.getCell());
        System.out.println("Prison1 : "+ prison1);

        System.out.println();
        ArmyBase armyBase = applicationContext.getBean(ArmyBase.class);
        armyBase.setId(1);
        armyBase.setName("Kashmir Regiment");
        armyBase.setSoldier(armyBase.getSoldier());
        System.out.println("Army Base : "+armyBase);

        ArmyBase armyBase1 = applicationContext.getBean(ArmyBase.class);
        armyBase1.setId(2);
        armyBase1.setName("Punjab Regiment");
        armyBase1.setSoldier(armyBase1.getSoldier());
        System.out.println("Army Base1 : "+ armyBase1);

        System.out.println();
        NavyShip navyShip = applicationContext.getBean(NavyShip.class);
        navyShip.setId(1);
        navyShip.setName("INS Vikrant");
        navyShip.setCrew(navyShip.getCrew());
        System.out.println("Navy Ship : "+navyShip);

        NavyShip navyShip1 = applicationContext.getBean(NavyShip.class);
        navyShip1.setId(2);
        navyShip1.setName("Visakhapatnam class");
        navyShip1.setCrew(navyShip1.getCrew());
        System.out.println("Navy Ship1 : "+ navyShip1);

        System.out.println();
        Zoo zoo = applicationContext.getBean(Zoo.class);
        zoo.setId(1);
        zoo.setName("Nehru Zoological Park");
        zoo.setAnimal(zoo.getAnimal());
        System.out.println("Zoo : "+zoo);

        Zoo zoo1 = applicationContext.getBean(Zoo.class);
        zoo1.setId(1);
        zoo1.setName("Bannerghatta National Park");
        zoo1.setAnimal(zoo1.getAnimal());
        System.out.println("Zoo1 : "+ zoo1);

        System.out.println();
        Aquarium aquarium = applicationContext.getBean(Aquarium.class);
        aquarium.setId(1);
        aquarium.setName("Marine Marvels");
        aquarium.setFish(aquarium.getFish());
        System.out.println("Aquarium : "+aquarium);

        Aquarium aquarium1 = applicationContext.getBean(Aquarium.class);
        aquarium1.setId(2);
        aquarium1.setName("Aqua Oasis");
        aquarium1.setFish(aquarium1.getFish());
        System.out.println("Aquarium1 : "+ aquarium1);

        System.out.println();
        Park park = applicationContext.getBean(Park.class);
        park.setId(1);
        park.setName("Devaiah Park");
        park.setTree(park.getTree());
        System.out.println("Park : "+park);

        Park park1 = applicationContext.getBean(Park.class);
        park1.setId(2);
        park1.setName("Cubbon Park");
        park1.setTree(park1.getTree());
        System.out.println("Park1 : "+ park1);

        System.out.println();
        Farm farm = applicationContext.getBean(Farm.class);
        farm.setId(1);
        farm.setName("Strawberry Farm");
        farm.setCrop(farm.getCrop());
        System.out.println("Farm : "+farm);

        Farm farm1 = applicationContext.getBean(Farm.class);
        farm1.setId(2);
        farm1.setName("Coffee Farm");
        farm1.setCrop(farm1.getCrop());
        System.out.println("Farm1 : "+ farm1);

        System.out.println();
        Factory factory = applicationContext.getBean(Factory.class);
        factory.setId(1);
        factory.setName("JSW");
        factory.setMachine(factory.getMachine());
        System.out.println("Factory : "+factory);

        Factory factory1 = applicationContext.getBean(Factory.class);
        factory1.setId(2);
        factory1.setName("Minera Steels");
        factory1.setMachine(factory1.getMachine());
        System.out.println("Factory1 : "+ factory1);

        System.out.println();
        Warehouse warehouse = applicationContext.getBean(Warehouse.class);
        warehouse.setId(1);
        warehouse.setName("Artisanal Warehouse Works");
        warehouse.setInventory(warehouse.getInventory());
        System.out.println("Warehouse : "+warehouse);

        Warehouse warehouse1 = applicationContext.getBean(Warehouse.class);
        warehouse1.setId(2);
        warehouse1.setName("Innovate Storage Solutions");
        warehouse1.setInventory(warehouse1.getInventory());
        System.out.println("Warehouse1  : "+ warehouse1);

        System.out.println();
        PowerPlant powerPlant = applicationContext.getBean(PowerPlant.class);
        powerPlant.setId(1);
        powerPlant.setName("Kakrapar Atomic Power Station");
        powerPlant.setTurbine(powerPlant.getTurbine());
        System.out.println("PowerPlant : "+powerPlant);

        PowerPlant powerPlant1 = applicationContext.getBean(PowerPlant.class);
        powerPlant1.setId(2);
        powerPlant1.setName("Tarapur Atomic Power Station");
        powerPlant1.setTurbine(powerPlant1.getTurbine());
        System.out.println("PowerPlant1 : "+ powerPlant1);

        System.out.println();
        WaterPlant waterPlant = applicationContext.getBean(WaterPlant.class);
        waterPlant.setId(1);
        waterPlant.setName("Dowleswaram Barrage");
        waterPlant.setReservoir(waterPlant.getReservoir());
        System.out.println("Water Plant : "+waterPlant);

        WaterPlant waterPlant1 = applicationContext.getBean(WaterPlant.class);
        waterPlant1.setId(2);
        waterPlant1.setName("Prakasham Barrage");
        waterPlant1.setReservoir(waterPlant1.getReservoir());
        System.out.println("Water Plant1 : "+ waterPlant1);

        System.out.println();
        ECommerce eCommerce = applicationContext.getBean(ECommerce.class);
        eCommerce.setId(1);
        eCommerce.setName("Flipkart");
        eCommerce.setProduct(eCommerce.getProduct());
        System.out.println("Ecommerce  : "+eCommerce);

        ECommerce eCommerce1 = applicationContext.getBean(ECommerce.class);
        eCommerce1.setId(2);
        eCommerce1.setName("Amazon");
        eCommerce1.setProduct(eCommerce1.getProduct());
        System.out.println("Ecommerce1  : "+ eCommerce1);

        System.out.println();
        OnlinePortal onlinePortal = applicationContext.getBean(OnlinePortal.class);
        onlinePortal.setId(1);
        onlinePortal.setName("Zudent");
        onlinePortal.setUser(onlinePortal.getUser());
        System.out.println("Online Portal  : "+onlinePortal);

        OnlinePortal onlinePortal1 = applicationContext.getBean(OnlinePortal.class);
        onlinePortal1.setId(2);
        onlinePortal1.setName("Talent Battle");
        onlinePortal1.setUser(onlinePortal1.getUser());
        System.out.println("Online Portal1  : "+ onlinePortal1);

        System.out.println();
        MobileApp mobileApp = applicationContext.getBean(MobileApp.class);
        mobileApp.setId(1);
        mobileApp.setName("Zomato");
        mobileApp.setFeature(mobileApp.getFeature());
        System.out.println("Mobile App  : "+mobileApp);

        MobileApp mobileApp1 = applicationContext.getBean(MobileApp.class);
        mobileApp1.setId(2);
        mobileApp1.setName("Uber");
        mobileApp1.setFeature(mobileApp1.getFeature());
        System.out.println("Mobile App  : "+ mobileApp1);

        System.out.println();
        SoftwareSystem softwareSystem = applicationContext.getBean(SoftwareSystem.class);
        softwareSystem.setId(1);
        softwareSystem.setName("Application Software");
        softwareSystem.setModule(softwareSystem.getModule());
        System.out.println("Software System  : "+softwareSystem);


        SoftwareSystem softwareSystem1 = applicationContext.getBean(SoftwareSystem.class);
        softwareSystem1.setId(2);
        softwareSystem1.setName("System Software");
        softwareSystem1.setModule(softwareSystem1.getModule());
        System.out.println("Software System1 : "+softwareSystem1);

        System.out.println();
        DataCenter dataCenter = applicationContext.getBean(DataCenter.class);
        dataCenter.setId(1);
        dataCenter.setName("Atlas Data Hub");
        dataCenter.setServer(dataCenter.getServer());
        System.out.println("Data Center  : "+dataCenter);

        DataCenter dataCenter1 = applicationContext.getBean(DataCenter.class);
        dataCenter1.setId(2);
        dataCenter1.setName("Heritage Data Center");
        dataCenter1.setServer(dataCenter1.getServer());
        System.out.println("Data Center1  : "+ dataCenter1);


        System.out.println();
        Network network = applicationContext.getBean(Network.class);
        network.setId(1);
        network.setName("Airtel");
        network.setRouter(network.getRouter());
        System.out.println("Network  : "+network);

        Network network1 = applicationContext.getBean(Network.class);
        network1.setId(2);
        network1.setName("Jio");
        network1.setRouter(network1.getRouter());
        System.out.println("Network1  : "+network1);


        System.out.println();
        Event event = applicationContext.getBean(Event.class);
        event.setId(1);
        event.setName("Holi Event");
        event.setParticipant(event.getParticipant());
        System.out.println("Event  : "+event);

        Event event1 = applicationContext.getBean(Event.class);
        event1.setId(2);
        event1.setName("Dasara Event");
        event1.setParticipant(event1.getParticipant());
        System.out.println("Event1  : "+event1);

        System.out.println();
        Conference conference = applicationContext.getBean(Conference.class);
        conference.setId(1);
        conference.setName("IEEE Conference");
        conference.setSession(conference.getSession());
        System.out.println("Conference  : "+conference);

        Conference conference1 = applicationContext.getBean(Conference.class);
        conference1.setId(2);
        conference1.setName("Tech Summit Conference");
        conference1.setSession(conference1.getSession());
        System.out.println("Conference1  : "+conference1);

        System.out.println();
        Institute institute = applicationContext.getBean(Institute.class);
        institute.setId(1);
        institute.setName("X-workz");
        institute.setTrainee(institute.getTrainee());
        System.out.println("Institute  : "+institute);

        Institute institute1 = applicationContext.getBean(Institute.class);
        institute1.setId(2);
        institute1.setName("Scalar");
        institute1.setTrainee(institute1.getTrainee());
        System.out.println("Institute1  : "+institute1);

        System.out.println();
        Exam exam = applicationContext.getBean(Exam.class);
        exam.setId(1);
        exam.setName("K-CET");
        exam.setQuestion(exam.getQuestion());
        System.out.println("Exam  : "+exam);

        Exam exam1 = applicationContext.getBean(Exam.class);
        exam1.setId(1);
        exam1.setName("NEET");
        exam1.setQuestion(exam1.getQuestion());
        System.out.println("Exam1  : "+exam1);

        System.out.println();
        Building building = applicationContext.getBean(Building.class);
        building.setId(1);
        building.setName("Brigade Gateway");
        building.setFloor(building.getFloor());
        System.out.println("Building  : "+building);

        Building building1 = applicationContext.getBean(Building.class);
        building1.setId(2);
        building1.setName("Shobha Enclaves");
        building1.setFloor(building1.getFloor());
        System.out.println("Building1  : "+building1);

        System.out.println();
        House house = applicationContext.getBean(House.class);
        house.setId(1);
        house.setName("Vrindavanam");
        house.setRoom(house.getRoom());
        System.out.println("House  : "+house);

        House house1 = applicationContext.getBean(House.class);
        house1.setId(2);
        house1.setName("Sumukha");
        house1.setRoom(house1.getRoom());
        System.out.println("House1  : "+house1);

        System.out.println();
        Country country = applicationContext.getBean(Country.class);
        country.setId(1);
        country.setName("India");
        country.setState(country.getState());
        System.out.println("Country  : "+country);

        Country country1 = applicationContext.getBean(Country.class);
        country1.setId(2);
        country1.setName("Russia");
        country1.setState(country1.getState());
        System.out.println("Country1  : "+ country1);

        System.out.println();
        Continent continent = applicationContext.getBean(Continent.class);
        continent.setId(1);
        continent.setName("Asia");
        Country country2 = continent.getCountry();
        country2.setId(1);
        country2.setName("India");
        continent.setCountry(country2);
        System.out.println("Continent  : "+continent);

        Continent continent1 = applicationContext.getBean(Continent.class);
        continent1.setId(1);
        continent1.setName("Europe");
        Country country3 = continent1.getCountry();
        country3.setId(1);
        country3.setName("UK");
        continent1.setCountry(country3);
        System.out.println("Continent1  : "+continent1);

        System.out.println();
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        vehicle.setId(1);
        vehicle.setName("TVS");
        vehicle.setWheel(vehicle.getWheel());
        System.out.println("Vehicle  : "+vehicle);

        Vehicle vehicle1 = applicationContext.getBean(Vehicle.class);
        vehicle1.setId(2);
        vehicle1.setName("Activa");
        vehicle1.setWheel(vehicle1.getWheel());
        System.out.println("Vehicle1  : "+vehicle1);

        System.out.println();
        Bicycle bicycle = applicationContext.getBean(Bicycle.class);
        bicycle.setId(1);
        bicycle.setName("LadyBird");
        bicycle.setPedal(bicycle.getPedal());
        System.out.println("Bicycle  : "+bicycle);

        Bicycle bicycle1 = applicationContext.getBean(Bicycle.class);
        bicycle1.setId(2);
        bicycle1.setName("Hercules");
        bicycle1.setPedal(bicycle1.getPedal());
        System.out.println("Bicycle1  : "+bicycle1);

        System.out.println();
        Market market = applicationContext.getBean(Market.class);
        market.setId(1);
        market.setName("K R Market");
        market.setStall(market.getStall());
        System.out.println("Market  : "+market);

        Market market1 = applicationContext.getBean(Market.class);
        market1.setId(2);
        market1.setName("APMC Market");
        market1.setStall(market1.getStall());
        System.out.println("Market1  : "+market1);

        System.out.println();
        Shoe shoe = applicationContext.getBean(Shoe.class);
        shoe.setId(1);
        shoe.setName("Nyke");
        shoe.setLace(shoe.getLace());
        System.out.println("Shoe  : "+shoe);

        Shoe shoe1 = applicationContext.getBean(Shoe.class);
        shoe1.setId(2);
        shoe1.setName("Adidas");
        shoe1.setLace(shoe1.getLace());
        System.out.println("Shoe1  : "+shoe1);

        System.out.println();
        Clock clock = applicationContext.getBean(Clock.class);
        clock.setId(1);
        clock.setName("Fastrack");
        clock.setHand(clock.getHand());
        System.out.println("Clock  : "+clock);

        Clock clock1 = applicationContext.getBean(Clock.class);
        clock1.setId(2);
        clock1.setName("Gucci");
        clock1.setHand(clock1.getHand());
        System.out.println("Clock1  : "+clock1);

        System.out.println();
        Tv tv = applicationContext.getBean(Tv.class);
        tv.setId(1);
        tv.setName("Samsung");
        tv.setRemote(tv.getRemote());
        System.out.println("Tv  : "+tv);

        Tv tv1 = applicationContext.getBean(Tv.class);
        tv1.setId(2);
        tv1.setName("Panasonic");
        tv1.setRemote(tv1.getRemote());
        System.out.println("Tv1  : "+tv1);

        System.out.println();
        Camera camera = applicationContext.getBean(Camera.class);
        camera.setId(1);
        camera.setName("Nikon");
        camera.setLens(camera.getLens());
        System.out.println("Camera  : "+camera);

        Camera camera1 = applicationContext.getBean(Camera.class);
        camera1.setId(2);
        camera1.setName("Canon");
        camera1.setLens(camera1.getLens());
        System.out.println("Camera1  : "+camera1);

        System.out.println();
        Staircase staircase = applicationContext.getBean(Staircase.class);
        staircase.setId(1);
        staircase.setName("ABC");
        staircase.setStairs(staircase.getStairs());
        System.out.println("Staircase  : "+staircase);

        Staircase staircase1 = applicationContext.getBean(Staircase.class);
        staircase1.setId(2);
        staircase1.setName("XYZ");
        staircase1.setStairs(staircase1.getStairs());
        System.out.println("Staircase1  : "+staircase1);

        System.out.println();
        Pen pen = applicationContext.getBean(Pen.class);
        pen.setId(1);
        pen.setName("Rorito");
        pen.setInk(pen.getInk());
        System.out.println("Pen  : "+pen);

        Pen pen1 = applicationContext.getBean(Pen.class);
        pen1.setId(2);
        pen1.setName("Parker");
        pen1.setInk(pen1.getInk());
        System.out.println("Pen1  : "+pen1);

        System.out.println();
        Lock lock = applicationContext.getBean(Lock.class);
        lock.setId(1);
        lock.setName("Ozone");
        lock.setKey(lock.getKey());
        System.out.println("Lock  : "+lock);

        Lock lock1 = applicationContext.getBean(Lock.class);
        lock1.setId(2);
        lock1.setName("Godrej");
        lock1.setKey(lock.getKey());
        System.out.println("Lock1  : "+lock1);

        System.out.println();
        ClassRoom classRoom = applicationContext.getBean(ClassRoom.class);
        classRoom.setId(1);
        classRoom.setName("B119");
        classRoom.setBoard(classRoom.getBoard());
        System.out.println("Class Room  : "+classRoom);

        ClassRoom classRoom1 = applicationContext.getBean(ClassRoom.class);
        classRoom1.setId(2);
        classRoom1.setName("B117");
        classRoom1.setBoard(classRoom1.getBoard());
        System.out.println("Class Room1  : "+classRoom1);

        System.out.println();
        Fan fan = applicationContext.getBean(Fan.class);
        fan.setId(1);
        fan.setName("Usha");
        fan.setaSwitch(fan.getaSwitch());
        System.out.println("Fan  : "+fan);

        Fan fan1 = applicationContext.getBean(Fan.class);
        fan1.setId(1);
        fan1.setName("Lloyd");
        fan1.setaSwitch(fan1.getaSwitch());
        System.out.println("Fan1  : "+fan1);

        System.out.println();
        Torch torch = applicationContext.getBean(Torch.class);
        torch.setId(1);
        torch.setName("Havells");
        torch.setBattery(torch.getBattery());
        System.out.println("Torch  : "+torch);

        Torch torch1 = applicationContext.getBean(Torch.class);
        torch1.setId(2);
        torch1.setName("SYSKAtime");
        torch1.setBattery(torch1.getBattery());
        System.out.println("Torch1  : "+torch1);


        System.out.println();
        Stove stove = applicationContext.getBean(Stove.class);
        stove.setId(1);
        stove.setName("Griddle");
        stove.setGas(stove.getGas());
        System.out.println("Stove  : "+stove);

        Stove stove1 = applicationContext.getBean(Stove.class);
        stove1.setId(2);
        stove1.setName("Prestige");
        stove1.setGas(stove1.getGas());
        System.out.println("Stove1  : "+stove1);

        System.out.println();
        Mobile mobile = applicationContext.getBean(Mobile.class);
        mobile.setId(1);
        mobile.setName("Samsung");
        mobile.setSim(mobile.getSim());
        System.out.println("Mobile  : "+mobile);

        Mobile mobile1 = applicationContext.getBean(Mobile.class);
        mobile1.setId(2);
        mobile1.setName("Nokia");
        mobile1.setSim(mobile1.getSim());
        System.out.println("Mobile1  : "+mobile1);

        System.out.println();
        Auto auto = applicationContext.getBean(Auto.class);
        auto.setId(1);
        auto.setName("Nissan");
        auto.setMeter(auto.getMeter());
        System.out.println("Auto  : "+auto);

        Auto auto1 = applicationContext.getBean(Auto.class);
        auto1.setId(2);
        auto1.setName("Volvo");
        auto1.setMeter(auto.getMeter());
        System.out.println("Auto1  : "+auto1);

        System.out.println();
        Shirt shirt = applicationContext.getBean(Shirt.class);
        shirt.setId(1);
        shirt.setName("Allen Solly");
        shirt.setHanger(shirt.getHanger());
        System.out.println("Shirt  : "+shirt);

        Shirt shirt1 = applicationContext.getBean(Shirt.class);
        shirt1.setId(2);
        shirt1.setName("Peter England");
        shirt1.setHanger(shirt1.getHanger());
        System.out.println("Shirt1  : "+shirt1);

        System.out.println();
        Glasses glasses = applicationContext.getBean(Glasses.class);
        glasses.setId(1);
        glasses.setName("RayBan");
        glasses.setFrame(glasses.getFrame());
        System.out.println("Glasses  : "+glasses);

        Glasses glasses1 = applicationContext.getBean(Glasses.class);
        glasses1.setId(1);
        glasses1.setName("Gucci");
        glasses1.setFrame(glasses1.getFrame());
        System.out.println("Glasses1  : "+glasses1);

        System.out.println();
        Radio radio = applicationContext.getBean(Radio.class);
        radio.setId(1);
        radio.setName("Icom");
        radio.setAntenna(radio.getAntenna());
        System.out.println("Radio  : "+radio);

        Radio radio1 = applicationContext.getBean(Radio.class);
        radio1.setId(2);
        radio1.setName("Olimpik");
        radio1.setAntenna(radio1.getAntenna());
        System.out.println("Radio1  : "+radio1);

        System.out.println();
        System.out.println("Main ended");
    }
}
