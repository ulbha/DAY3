package com.luv.service;

import java.util.List;

import com.luv.model.Student;
public interface StudentService {
 Student addStudent(Student student);
 List<Student> getAllStudents();
}

