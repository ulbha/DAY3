package com.luv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv.model.Student;
import com.luv.repo.StudentRepo;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
 @Autowired
 private StudentRepo studentRepo;
 @Override
 public Student addStudent(Student student) {
 Student addedStudent = studentRepo.save(student);
 return addedStudent;
 }
 @Override
 public List<Student> getAllStudents() {
 return (List<Student>) studentRepo.findAll();
 }

}

