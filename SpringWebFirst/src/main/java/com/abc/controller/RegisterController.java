package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dtos.RegisterDto;
import com.abc.services.LoginService;
import com.abc.services.RegisterService;

@Controller
public class RegisterController {
	private RegisterService ls;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView displayregister() {

		ModelAndView re = new ModelAndView();
		re.setViewName("register");
		re.addObject("registerObject", new RegisterDto());
		return re;
	}

	@RequestMapping(value = "/register-process", method = RequestMethod.POST)
	public String processregister(RegisterDto dto) {
		System.out.println(dto.toString());

		return "rehome";
	}

	public void setls(RegisterService ls) {
		this.ls = ls;
	}

}
