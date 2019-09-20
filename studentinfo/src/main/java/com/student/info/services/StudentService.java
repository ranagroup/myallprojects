package com.student.info.services;

import org.springframework.stereotype.Service;

import com.student.info.dtos.StudentDto;

@Service
public class StudentService {
	public void creatstudentinfo(StudentDto  studentdto) {
		System.out.println(studentdto.toString());
		
	}
public StudentDto getStudentbyId(Long id) {
	StudentDto student= new StudentDto();
	student.setName("kamal");
	student.setRoll(50);
	student.setDepartment("IT");
	return student;
}
}
