package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dtos.LoginDto;
import com.abc.services.LoginService;

@Controller
public class LoginController {
	private LoginService ab;

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView displayLogin() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		mv.addObject("loginObject", new LoginDto());
		return mv;
	}

	@RequestMapping(value = "/login-process", method = RequestMethod.POST)
	public String processlogin(LoginDto dto) {
		System.out.println(dto.toString());
		boolean isLogin = ab.login(dto.getUsername(), dto.getPassword());
		if (isLogin) {
			return "home";
		} else {
			return "login-failed";
		}
	}

	public void setab(LoginService ab) {
		this.ab = ab;
	}

}
