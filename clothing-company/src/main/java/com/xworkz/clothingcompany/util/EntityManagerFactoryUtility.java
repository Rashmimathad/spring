package com.xworkz.clothingcompany.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtility {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("clothingPU");

    public static EntityManagerFactory getEntityManagerFactory(){
        return factory;
    }

    public static void close(){
        System.out.println("EntityManagerFactory closed");
        factory.close();
    }
}
