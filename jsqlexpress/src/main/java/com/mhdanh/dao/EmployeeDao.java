package com.mhdanh.dao;

import java.util.List;

import com.mhdanh.domain.Employee;

public interface EmployeeDao {
	List<Employee> getEmployees();

	void addEmployee(Employee emp);
}
