/*package com.ds.dashboard.config.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ers.config.bean.Employee;

@FeignClient("employee-registration-service")
public interface EmployeeServiceClient {
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") String empId);
}
*/