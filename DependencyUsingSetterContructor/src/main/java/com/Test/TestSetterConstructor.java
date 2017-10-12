package com.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.Beans.CommunicationSetterConstructor;

public class TestSetterConstructor {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		 
        CommunicationSetterConstructor app = (CommunicationSetterConstructor)context.getBean("communicationSetterContructor");
        
        app.communicate();
		
	}

}
