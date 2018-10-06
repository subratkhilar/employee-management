package com.ers.config.bean.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ers.config.bean.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public void addEmployeeDetails(Employee Employee) {
		employeeList.add(Employee);

	}

	public Employee getEmployeeById(String empId) {
		
		return (Employee) employeeList.stream().filter(list->list.getEmpId().equals(empId)).collect(Collectors.toList()).get(0);
	}

	public List<Employee> listOfEmployee() {

		return employeeList;
	}

}
