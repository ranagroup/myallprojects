package com.emp.main;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.entities.EmployeeEntity;
import com.emp.entities.EmployeeLoginEntity;
import com.emp.repositories.EmployeeLoginRepository;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeLoginEntity employeeLogin = new EmployeeLoginEntity();
		employeeLogin.setUsername("rana");
		String password = DigestUtils.sha256Hex("154786");
		employeeLogin.setPassword(password);
		employeeLogin.setCreatedAt(new Date());
		
		EmployeeEntity emp = new EmployeeEntity();
		emp.setName("rana");
		emp.setDesignation("Daveloper");
		emp.setDepartment("IT");
		emp.setSalary("30000");
		emp.setEmail("rana@email.com");
		emp.setAddress("19340 sandy lack dr,gaithersburg,MD");
		
		employeeLogin.setEmployee(emp);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("main-context.xml");
		
		EmployeeLoginRepository employeeLoginRepository = (EmployeeLoginRepository) ctx.getBean("employeeLoginRepository");
		employeeLoginRepository.save(employeeLogin);
		
		
		

	}

}
