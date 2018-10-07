package com.ers.config.bean.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ers.config.bean.Employee;
import com.ers.config.bean.service.EmployeeService;

@RestController
@CrossOrigin(maxAge = 3600)
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<String> aaddEmployeeDetails(@RequestBody Employee employee) {
		try {
			employeeService.addEmployeeDetails(employee);
			return new ResponseEntity<String>("Employee record created sucessfully!!", HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error in creating Employee record!!", HttpStatus.FAILED_DEPENDENCY);
		}

	}

	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable("empId") Long empId) {
		Employee employee = null;
		try {
			employee = employeeService.getEmployeeById(empId);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Employee>(employee, HttpStatus.FAILED_DEPENDENCY);
		}

	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails() {
		List<Employee> employeeList = null;
		try {
			employeeList = employeeService.listOfEmployee();
			return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.FAILED_DEPENDENCY);
		}

	}
}
