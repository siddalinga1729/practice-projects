package com.elementcollectiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elementcollectiondemo.entity.Student;
import com.elementcollectiondemo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
}
