package com.abc.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean login(String username, String password) {
		if ("test".equals(username) && "test".equals(password)) {
			return true;
		} else {
			return false;
		}

	}

}
