package com.ers.config.bean.service;

import java.util.List;

import com.ers.config.bean.Employee;

public interface EmployeeService {
	public void addEmployeeDetails(Employee Employee);

	public Employee getEmployeeById(String empId);

	public List<Employee> listOfEmployee();
}
