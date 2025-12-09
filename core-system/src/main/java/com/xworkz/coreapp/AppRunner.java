package com.xworkz.coreapp;

import com.xworkz.coreapp.config.CoreConfiguration;
import com.xworkz.coreapp.contexts.library.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AppRunner {
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);
        Library library = applicationContext.getBean(Library.class);
        System.out.println("Library : "+library);
    }
}
