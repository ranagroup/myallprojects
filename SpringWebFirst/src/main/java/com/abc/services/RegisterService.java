package com.abc.services;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {
	public RegisterService register(String first_name,String last_name, String email,String contact_No,String address) {
		RegisterService a=new RegisterService();
		System.out.println(a);
		return a;
	}

}
