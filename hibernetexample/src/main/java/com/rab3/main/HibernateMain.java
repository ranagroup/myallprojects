package com.rab3.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab3.entities.CustomerEntity;
import com.rab3.repositorys.CustomerRepository;

public class HibernateMain {

	public static void main(String[] args) {
		//CustomerEntity cust = new CustomerEntity();
		//cust.setName("kamal");
		//cust.setEmail("kamal@gmail.com");
		//cust.setPhone("1248855751667");
		
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerRepository customerRepository = (CustomerRepository) ctx.getBean("customerRepository");
		//customerRepository.save(cust);
		System.out.println("**************************");

		List<CustomerEntity> customers = customerRepository.getCustomerByName("rana");
		for (CustomerEntity c : customers) {
			System.out.println(c.toString());
		}

		System.out.println();
		System.out.println("**************************");

		CustomerEntity customer1 = customerRepository.getCustomerById(4l);
		System.out.println(customer1.toString());
		
		System.out.println();
		System.out.println("********************fgh******");
		List<CustomerEntity> customer2 = customerRepository.getCustomerByEmail("rana@gmail.com");
		for (CustomerEntity d : customer2) {
			System.out.println(d.toString());
			
			System.out.println("*********update example***********");
			CustomerEntity custUpdate =customerRepository.getCustomerById(4l);
			custUpdate.setEmail("rana.chowdhury1988@gmail.com");
			custUpdate.setPhone("125478896555");
			customerRepository.update(custUpdate);
			
	}

	}
}