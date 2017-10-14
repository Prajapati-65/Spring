package com.bridgeit.SpringAnnotationPropertySource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.SpringAnnotationPropertySource.configuration.AppConfig;
import com.bridgeit.SpringAnnotationPropertySource.service.FileService;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String args[]) {
		
		//AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		FileService service = (FileService) context.getBean("fileService");

		service.readValues();
		context.close();
	}
}
