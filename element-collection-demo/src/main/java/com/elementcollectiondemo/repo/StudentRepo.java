package com.elementcollectiondemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elementcollectiondemo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
