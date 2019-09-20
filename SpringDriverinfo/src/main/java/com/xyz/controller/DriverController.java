package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xyz.dtos.DriverDto;

@Controller
public class DriverController {

	@RequestMapping(value = "/driver", method = RequestMethod.GET)
	public ModelAndView displaydriver() {

		ModelAndView re = new ModelAndView();
		re.setViewName("driver");
		re.addObject("driverObject", new DriverDto());
		return re;
	}

	@RequestMapping(value = "/driver-process", method = RequestMethod.POST)
	public ModelAndView processdriver(DriverDto dto) {
		System.out.println(dto.toString());
		return displaydriver();
	}
}