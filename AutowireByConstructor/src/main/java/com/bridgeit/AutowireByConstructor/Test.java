package com.bridgeit.AutowireByConstructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student std = context.getBean(Student.class);

		System.out.println("Student details : " + std);
	}
}
