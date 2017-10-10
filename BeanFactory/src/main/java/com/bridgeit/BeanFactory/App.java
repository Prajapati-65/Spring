package com.bridgeit.BeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {

		String bean = "bean.xml";
		FileSystemResource abc = new FileSystemResource(bean);

		@SuppressWarnings("deprecation")
		BeanFactory beanFact = new XmlBeanFactory(abc);

		BeanClass xyz = beanFact.getBean(BeanClass.class);

		System.out.println("age--->" + xyz.getAge());
		System.out.println("name--->" + xyz.getName());
		System.out.println("address--->" + xyz.getAddress());

	}
}
