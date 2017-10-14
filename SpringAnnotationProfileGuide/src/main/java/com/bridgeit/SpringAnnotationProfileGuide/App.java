package com.bridgeit.SpringAnnotationProfileGuide;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String args[]){
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
        //Sets the active profiles
        
        
        //context.getEnvironment().setActiveProfiles("Development");
        //  or
        context.getEnvironment().setActiveProfiles("Production");
        
        
        //Scans the mentioned package[s] and register all the @Component available to Spring
        context.scan("com.bridgeit.SpringAnnotationProfileGuide"); 
        context.refresh();
        context.close();
    }
}
