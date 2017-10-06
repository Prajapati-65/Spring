package com.bridgeit.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bridgeit.HelloWorld.configuration.HelloWorldConfig;
import com.bridgeit.HelloWorld.domain.HelloWorld;

/**
 * @author Om Prajapati
 *
 */
public class UsingConfigClass {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("helloBean");
		bean.displayName("Om Prajapati");
		context.close();
	}
}
