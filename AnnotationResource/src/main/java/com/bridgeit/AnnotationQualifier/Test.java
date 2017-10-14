package com.bridgeit.AnnotationQualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	AbstractApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
 
    Bond abc = (Bond) context.getBean("bond");
   
    //abc.showCar();
}
