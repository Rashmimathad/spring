package com.xworkz.coreapp;

import com.xworkz.coreapp.components.amusementpark.AmusementPark;
import com.xworkz.coreapp.components.bag.Bag;
import com.xworkz.coreapp.components.bank.Bank;
import com.xworkz.coreapp.components.bottle.Bottle;
import com.xworkz.coreapp.components.browser.Browser;
import com.xworkz.coreapp.components.candle.Candle;
import com.xworkz.coreapp.components.clothestore.ClotheStore;
import com.xworkz.coreapp.components.coffeeshop.CoffeeShop;
import com.xworkz.coreapp.components.company.Company;
import com.xworkz.coreapp.components.cricketer.Cricketer;
import com.xworkz.coreapp.components.cutsomer.Customer;
import com.xworkz.coreapp.components.framework.Framework;
import com.xworkz.coreapp.components.grocerystore.GroceryStore;
import com.xworkz.coreapp.components.headSet.HeadSet;
import com.xworkz.coreapp.components.hospital.Hospital;
import com.xworkz.coreapp.components.ide.Ide;
import com.xworkz.coreapp.components.institute.Institute;
import com.xworkz.coreapp.components.internet.Internet;
import com.xworkz.coreapp.components.laptop.Laptop;
import com.xworkz.coreapp.components.medicalstore.MedicalStore;
import com.xworkz.coreapp.components.mobile.Mobile;
import com.xworkz.coreapp.components.notebook.Notebook;
import com.xworkz.coreapp.components.postoffice.PostOffice;
import com.xworkz.coreapp.components.shoppingmall.ShoppingMall;
import com.xworkz.coreapp.components.trainee.Trainee;
import com.xworkz.coreapp.components.trainer.Trainer;
import com.xworkz.coreapp.components.tv.Tv;
import com.xworkz.coreapp.config.CoreConfiguration;
import com.xworkz.coreapp.components.library.Library;
import com.xworkz.coreapp.components.restuarant.Restuarant;
import com.xworkz.coreapp.components.theatre.Theatre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppRunner {
    public static void main( String[] args ){

        System.out.println("Main Started");
        System.out.println();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);

        Library library = applicationContext.getBean(Library.class);
        System.out.println("Library : "+library);

        Theatre theatre = applicationContext.getBean(Theatre.class);
        System.out.println("Theatre : "+theatre);

        Restuarant restuarant = applicationContext.getBean(Restuarant.class);
        System.out.println("Restuarant : "+restuarant);

        Hospital hospital = applicationContext.getBean(Hospital.class);
        System.out.println("Hospital : "+hospital);

        AmusementPark amusementPark = applicationContext.getBean(AmusementPark.class);
        System.out.println("Amusement Park : "+amusementPark);

        Browser browser = applicationContext.getBean(Browser.class);
        System.out.println("Browser : "+browser);

        Internet internet = applicationContext.getBean(Internet.class);
        System.out.println("Internet : "+internet);

        MedicalStore medicalStore = applicationContext.getBean(MedicalStore.class);
        System.out.println("Medical Store : "+medicalStore);

        PostOffice postOffice = applicationContext.getBean(PostOffice.class);
        System.out.println("Post Office : "+postOffice);

        GroceryStore groceryStore = applicationContext.getBean(GroceryStore.class);
        System.out.println("Grocery Store : "+groceryStore);

        Bank bank = applicationContext.getBean(Bank.class);
        System.out.println("Bank : "+bank);

        Tv tv = applicationContext.getBean(Tv.class);
        System.out.println("TV : "+tv);


        Trainee trainee = applicationContext.getBean(Trainee.class);
        System.out.println("Trainee : "+trainee);

        Customer customer = applicationContext.getBean(Customer.class);
        System.out.println("Customer : "+customer);

        Cricketer cricketer = applicationContext.getBean(Cricketer.class);
        System.out.println("Cricketer : "+cricketer);

        Institute institute = applicationContext.getBean(Institute.class);
        System.out.println("Institute : "+institute);

        Laptop laptop = applicationContext.getBean(Laptop.class);
        System.out.println("Laptop : "+laptop);

        Bottle bottle = applicationContext.getBean(Bottle.class);
        System.out.println("Bottle : "+bottle);

        Trainer trainer = applicationContext.getBean(Trainer.class);
        System.out.println("Trainer : "+trainer);

        Mobile mobile = applicationContext.getBean(Mobile.class);
        System.out.println("Mobile : "+mobile);

        ShoppingMall shoppingMall = applicationContext.getBean(ShoppingMall.class);
        System.out.println("Shopping Mall : "+shoppingMall);

        Candle candle = applicationContext.getBean(Candle.class);
        System.out.println("Candle : "+candle);

        Company company = applicationContext.getBean(Company.class);
        System.out.println("Company : "+company);

        Notebook notebook = applicationContext.getBean(Notebook.class);
        System.out.println("Notebook : "+notebook);

        Bag bag  = applicationContext.getBean(Bag.class);
        System.out.println("Bag : "+bag);

        HeadSet headSet = applicationContext.getBean(HeadSet.class);
        System.out.println("HeadSet : "+headSet);

        CoffeeShop coffeeShop = applicationContext.getBean(CoffeeShop.class);
        System.out.println("Coffee Shop : "+coffeeShop);

        Ide ide = applicationContext.getBean(Ide.class);
        System.out.println("Ide : "+ide);

        ClotheStore clotheStore = applicationContext.getBean(ClotheStore.class);
        System.out.println("Clothe Store : "+clotheStore);

        Framework framework = applicationContext.getBean(Framework.class);
        System.out.println("Framework : "+framework);


        System.out.println();
        System.out.println("Main ended");
    }
}
