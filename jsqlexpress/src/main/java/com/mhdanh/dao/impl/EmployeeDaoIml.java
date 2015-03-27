package com.mhdanh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhdanh.dao.EmployeeDao;
import com.mhdanh.domain.Employee;

@Transactional
@Repository
public class EmployeeDaoIml implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees() {
		return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	public void addEmployee(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
	}
	
}
