package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xyz.dtos.VehicleDto;

@Controller
public class VehicleController {

	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
	public ModelAndView displayvehicle() {

		ModelAndView mk = new ModelAndView();
		mk.setViewName("vehicle");
		mk.addObject("vehicleObject", new VehicleDto());
		return mk;
	}

	@RequestMapping(value = "/vehicle-process", method = RequestMethod.POST)
	public ModelAndView processvehicle(VehicleDto dto) {
		System.out.println(dto.toString());
		return displayvehicle();
	}
}
