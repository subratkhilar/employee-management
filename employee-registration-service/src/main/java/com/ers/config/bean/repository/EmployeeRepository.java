package com.ers.config.bean.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ers.config.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
