package com.mhdanh.service;

import java.util.List;

import com.mhdanh.domain.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);

	List<Employee> getEmployees();

}
