package com.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.Beans.Communication;

public class TestSetter {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("setter-config.xml");
		Communication app = (Communication) context.getBean("communication");
		app.communicate();
	}
}
