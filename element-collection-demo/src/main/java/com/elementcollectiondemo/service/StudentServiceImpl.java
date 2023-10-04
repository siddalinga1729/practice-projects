package com.elementcollectiondemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elementcollectiondemo.entity.Student;
import com.elementcollectiondemo.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

}
