package com.mhdanh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mhdanh.dao.EmployeeDao;
import com.mhdanh.domain.Employee;
import com.mhdanh.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
	}

	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

}
