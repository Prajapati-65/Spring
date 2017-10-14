package com.bridgeit.SpringAutoDetection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.SpringAutoDetection.configuration.Abc;
import com.bridgeit.SpringAutoDetection.model.Employee;
import com.bridgeit.SpringAutoDetection.model.EmployeeService;

public class TestUsingClassAndXml {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Abc.class);
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Employee employee = new Employee();
		employee.setName("Om Prajapati :");
		service.registerEmployee(employee);
		context.close();
	}
}
