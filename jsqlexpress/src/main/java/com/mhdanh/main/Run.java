package com.mhdanh.main;

import javax.swing.JOptionPane;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhdanh.interfaces.Crud;

public class Run {
	public static void main(String[] args) {
try {
			
//			String path = RunMain.class.getClassLoader().getResource("application-context.xml").toExternalForm();
//	        JOptionPane.showMessageDialog(null, path);
			
			//URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
			//JOptionPane.showMessageDialog(null,"Path: " + location.getFile());
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
			Crud crud = ctx.getBean(Crud.class);
			crud.setVisible(true);
			crud.setSize(500, 400);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"error:" + e);
		}
	}
}
