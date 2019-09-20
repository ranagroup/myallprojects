package com.abc.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public Boolean isLoginvalid(String userid,String password) {
		System.out.println("I am inside the login Srevice page");
		if("rana".equals(userid)&&"1234".equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

}
