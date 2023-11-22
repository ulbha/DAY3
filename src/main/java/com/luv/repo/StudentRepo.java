package com.luv.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luv.model.Student;
@Repository
public interface StudentRepo extends MongoRepository<Student, Integer> { }
