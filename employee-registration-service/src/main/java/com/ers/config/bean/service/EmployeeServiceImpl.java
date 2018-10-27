package com.ers.config.bean.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.config.bean.Employee;
import com.ers.config.bean.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	private List<Employee> employeeList = new ArrayList<Employee>();
	@Autowired
	private EmployeeRepository employeeRepository;

	public void addEmployeeDetails(Employee employee) {
		employeeRepository.save(employee);

	}

	public Employee getEmployeeById(Long empId) {
		Employee employee =employeeRepository.findById(empId).get();
		/*
		 * return (Employee) employeeList.stream().filter(list ->
		 * list.getEmpId().equals(empId)) .collect(Collectors.toList()).get(0);
		 */
		return employee;
	}

	public List<Employee> listOfEmployee() {

		return (List<Employee>) employeeRepository.findAll();
	}

}
