package com.bridgeit.HelloWorld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.HelloWorld.domain.HelloWorld;

/**
 * @author Om Prajapati
 *
 */
public class UsingConfigXmlFile {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBeanXMLFile");
        bean.displayName("Siddu");
        context.close();

	}

}
