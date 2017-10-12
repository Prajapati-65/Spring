package com.bridgeit.AnnotationResource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("com.bridgeit.AnnotationResource")
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

		// Byname Autowiring
		Application application = (Application) context.getBean("application");
		System.out.println("Application Details : " + application);

	}
}
