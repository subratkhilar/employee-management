package com.ers.config.bean.service;

import java.util.List;
import java.util.Optional;

import com.ers.config.bean.Employee;

public interface EmployeeService {
	public void addEmployeeDetails(Employee Employee);

	public Employee getEmployeeById(Long empId);

	public List<Employee> listOfEmployee();
}
