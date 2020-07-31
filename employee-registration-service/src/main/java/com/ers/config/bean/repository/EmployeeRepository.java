package com.ers.config.bean.repository;



import org.springframework.data.repository.CrudRepository;

import com.ers.config.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
