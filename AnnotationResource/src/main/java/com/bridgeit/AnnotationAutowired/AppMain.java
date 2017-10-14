package com.bridgeit.AnnotationAutowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

	public static void main(String args[]) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppMain.class);

		DriverField driver = (DriverField) context.getBean("driver");
		System.out.println("Driver Details : " + driver);
	}

}
