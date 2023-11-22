package com.luv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.luv.model.Student;
import com.luv.service.StudentService;

import java.util.List;
@RestController
public class StudentController {
 @Autowired
 private StudentService studentServ;
 @PostMapping("/students")
 public ResponseEntity<Student> addStudent(@RequestBody Student student){
 Student s = studentServ.addStudent(student);
 return new ResponseEntity<Student>(s, HttpStatus.CREATED);
 }
 @GetMapping("/allStudents")
 public ResponseEntity <List<Student> >getstudents(){
 List<Student> studentList =studentServ.getAllStudents();
 return new ResponseEntity <List<Student>>
(studentList,HttpStatus.OK);
 }
}


