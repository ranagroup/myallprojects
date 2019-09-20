package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dtos.Logindtos;
import com.abc.dtos.Signupdtos;

@Controller
public class SignupController {
	
	@RequestMapping(value="/signup", method= RequestMethod.GET)
	public ModelAndView getsignuppage() {
		System.out.println("I am inside the signup controller");
		ModelAndView mk= new ModelAndView();
		mk.setViewName("signup");
		Signupdtos signupdtos=new Signupdtos();
		mk.addObject("signupObject",signupdtos);
		return mk;
	}
	@RequestMapping(value="/signup-process", method=RequestMethod.POST)
	public String processlogin(Signupdtos dto) {
		System.out.println("User Data :"+dto.toString());
		return "signup2";
	}
	

}
