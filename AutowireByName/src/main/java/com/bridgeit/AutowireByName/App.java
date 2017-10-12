package com.bridgeit.AutowireByName;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
    	 
        //autowire=byName 
        Application application = (Application)context.getBean("appli");
        
        System.out.println("Application Details : "+application);
    }
}
