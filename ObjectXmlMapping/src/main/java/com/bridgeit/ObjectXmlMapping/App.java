package com.bridgeit.ObjectXmlMapping;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	private static final String XML_FILE_NAME = "bean.xml";

	public static void main(String[] args) throws IOException, JAXBException {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
		XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");

		Customer customer = new Customer();
		customer.setName("mkyong");
		customer.setAge(30);
		customer.setFlag(true);
		customer.setAddress("This is address");

		System.out.println("Convert Object to XML!");
		// from object to XML file
		converter.convertFromObjectToXML(customer, XML_FILE_NAME);
		System.out.println("Done \n");

		System.out.println("Convert XML back to Object!");
		// from XML to object
		Customer customer2 = (Customer) converter.convertFromXMLToObject(XML_FILE_NAME);
		System.out.println(customer2);
		System.out.println("Done");

	}

}
