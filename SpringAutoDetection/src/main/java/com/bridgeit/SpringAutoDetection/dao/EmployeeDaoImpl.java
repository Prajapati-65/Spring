package com.bridgeit.SpringAutoDetection.dao;

import org.springframework.stereotype.Repository;

import com.bridgeit.SpringAutoDetection.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	
	public void saveInDatabase(Employee employee) {
       
        System.out.println("Employee "+employee.getName()+" is registered for assessment on "+ employee.getAssessmentDate());
  
    }
}
