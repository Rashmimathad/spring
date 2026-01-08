package com.xworkz.eventapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryImpl {

    private static EntityManagerFactory factory= Persistence.createEntityManagerFactory("eventPU");

    public static EntityManagerFactory getEventManagerFactory(){
        return factory;
    }

    public static void close(){
        System.out.println("Entity Manager Factory closed");
        factory.close();
    }

}