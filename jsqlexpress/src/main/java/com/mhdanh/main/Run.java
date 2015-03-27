package com.mhdanh.main;

import javax.swing.JOptionPane;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhdanh.interfaces.Crud;

public class Run {
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					"application-context.xml");
			Crud crud = ctx.getBean(Crud.class);
			crud.setVisible(true);
			crud.setSize(500, 400);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error:" + e);
		}
	}
}
