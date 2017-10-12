package com.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.Beans.CommunicationConstructor;

public class TestConstructor {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("constructor-config.xml");
		CommunicationConstructor app = (CommunicationConstructor) context.getBean("communicationConstructor");
		app.communicate();
	}
}
