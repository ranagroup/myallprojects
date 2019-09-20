package com.rab3.main;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab3.entities.CustomerEntity;
import com.rab3.entities.CustomerLoginEntity;
import com.rab3.repositorys.CustomerLoginRepository;

public class HibernateOneToOne {

	public static void main(String[] args) {
		//CustomerLoginEntity customerLogin = new CustomerLoginEntity();
		//customerLogin.setUsername("ranagroup");
		//String password = DigestUtils.sha256Hex("12456879");
		//customerLogin.setPassword(password);
		//customerLogin.setCreatedAt(new Date());

		//CustomerEntity cust = new CustomerEntity();
		//cust.setName("Mehran");
		//cust.setEmail("mehran@gmail.com");
		//cust.setPhone("3016751669");

		//customerLogin.setCustomer(cust);

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerLoginRepository customerLoginRepository = (CustomerLoginRepository) ctx
				.getBean("customerLoginRepository");
		//customerLoginRepository.save(customerLogin);
		
		CustomerLoginEntity c1 = customerLoginRepository.getByUsername("ranagroup");
				System.out.println("*************login get by username **********");
				System.out.println(c1.toString());
				
				String password = DigestUtils.sha256Hex("4477852");
				c1.setPassword(password);
				c1.setUpdatedAt(new Date());
				customerLoginRepository.update(c1);
				
		
		

	}

}
