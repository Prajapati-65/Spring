package com.bridgeit.AutowireByType;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Om Prajapati
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 Employee employee = context.getBean(Employee.class);
		 System.out.println("Employee details : "+employee);
	}
}
