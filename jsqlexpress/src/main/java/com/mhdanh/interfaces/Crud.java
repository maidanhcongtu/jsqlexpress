package com.mhdanh.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mhdanh.domain.Employee;
import com.mhdanh.service.EmployeeService;





@Component
public class Crud extends JFrame{
	private static final long serialVersionUID = 1L;
	@Autowired
	private EmployeeService employeeService;
	
	public Crud(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		initComponent();
	}
	
	private void initComponent() {
		JButton addEmployee = new JButton("Add Employee");
		addEmployee.setBounds(20, 20, 100, 30);
		this.add(addEmployee);
		addEmployee.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("add emloyee");
				Employee emp = new Employee();
				emp.setName("mai huu danh");
				employeeService.addEmployee(emp);
			}
			
		});
		
		JButton listEmployee = new JButton("List Employee");
		listEmployee.setBounds(200, 20, 100, 30);
		this.add(listEmployee);
		
		listEmployee.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("list employee");
				List<Employee> employees = employeeService.getEmployees();
				for(Employee emp : employees) {
					System.out.println(emp.getId() + " | " + emp.getName());
				}
			}
		});
	}
	
}
