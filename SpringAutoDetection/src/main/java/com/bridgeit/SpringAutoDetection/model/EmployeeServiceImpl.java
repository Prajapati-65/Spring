package com.bridgeit.SpringAutoDetection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.SpringAutoDetection.dao.EmployeeDao;
import com.bridgeit.SpringAutoDetection.service.DateService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private DateService dateService;

	@Autowired
	private EmployeeDao employeeDao;

	public void registerEmployee(Employee employee) {
		employee.setAssessmentDate(dateService.getNextAssessmentDate());
		employeeDao.saveInDatabase(employee);
	}

}
