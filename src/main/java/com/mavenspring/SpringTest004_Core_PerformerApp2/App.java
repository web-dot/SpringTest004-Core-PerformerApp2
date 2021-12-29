package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//commit01-ApplicationContext started | refreshed | beans created
    	System.out.println("Application context--> start");
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	System.out.println("Application context--> end");
    	
    	System.out.println();
    	
    	Instrumentalist i1 = factory.getBean(Instrumentalist.class);
    	i1.perform();
    	
    	
    }
}
