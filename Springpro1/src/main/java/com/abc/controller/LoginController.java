package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dtos.Logindtos;
import com.abc.services.LoginService;

@Controller

public class LoginController {
	private LoginService loginService;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getDriverPage() {
		System.out.println("I am inside login controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		Logindtos logindtos=new Logindtos();
		mv.addObject("loginObject", logindtos);
		return mv; 
		
	}
		@RequestMapping(value="/login-process", method=RequestMethod.POST)
		public ModelAndView processlogin(Logindtos dto) {
			System.out.println("login value :"+dto.toString());
			Boolean isLoginSuccessful = loginService.isLoginvalid(dto.getUsername(),dto.getPassword());
			ModelAndView mv=new ModelAndView();
			if(isLoginSuccessful) {
				mv.setViewName("sample");
			}else {
				mv.setViewName("login");
				Logindtos logindtos=new Logindtos();
				mv.addObject("loginObject", logindtos);
				mv.addObject("message","Your Login has failed. Please try again.");
			}
			
			return mv;
		}
		

		public void setLoginService(LoginService loginService) {
			this.loginService = loginService;
		}


	}


