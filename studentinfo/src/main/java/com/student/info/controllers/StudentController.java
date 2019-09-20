package com.student.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.info.dtos.StudentDto;
import com.student.info.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "", method = RequestMethod.POST )
	public void creatstudent(@RequestBody StudentDto studentDto) {
		System.out.println(studentDto.toString());
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public StudentDto getStudenttoId(@RequestParam(value = "id" ,required=true) Long studentId,
			@RequestParam(value = "name",required = false) String name) {
		System.out.println("id :"+ studentId+", name :"+name);
		return studentService.getStudentbyId(studentId);
	}
	@RequestMapping(value = "/{id}/detail", method = RequestMethod.GET)
	public StudentDto getStudentFromId(@PathVariable(value = "id") Long studentId,
			@RequestHeader(value = "first-Token") String firstToken) {
		System.out.println("first-Token : " + firstToken);
		return studentService.getStudentbyId(studentId);
	}
	
	
			

}
