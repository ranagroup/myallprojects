package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.object.Address;
import com.abc.object.Customer;
import com.abc.services.CustomerService;
import com.abc.services.EmployeeService;

public class Springdemoaplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		//Customer c1 = (Customer) ctx.getBean("c1");
//System.out.println(c1.toString());
		
		//CustomerService cs = (CustomerService) ctx.getBean("customerService");
		//cs.saveCustomer(c1);
		EmployeeService ec=(EmployeeService) ctx.getBean("employeeService1");
		System.out.println("Gross Income : 70000, Net Income :"+ ec.calculaeNetIncome(70000));
		
	}

}
