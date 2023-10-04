package com.elementcollectiondemo.service;

import org.springframework.stereotype.Service;

import com.elementcollectiondemo.entity.Student;
@Service
public interface StudentService {
public Student saveStudent(Student student);
}
