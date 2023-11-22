package com.luv.SpringBootDemo.model;
import com.luv.model.Student;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.mapping.Document;
class StudentTest {
@Test
void testStudentConstructor() {
Student s = new Student(1,"Luv" ,20, 12345);
assertNotNull(s);
assertEquals("Luv", s.getName());
assertEquals(20, s.getAge());
assertEquals(12345.7, s.getSalary());
}
@Test
void testGettersAndSetters() {
Student s = new Student();

s.setID(1);
s.setName("Luv");
s.setAge(20);
s.setSalary(12345);


assertEquals(1, s.getID());
assertEquals("Luv", s.getName());
assertEquals(20, s.getAge());
assertEquals(12345.7, s.getSalary());
}

@Test
void testEqualityandHashCode() {
Student s1 = new Student(2,"Luv" ,20, 12345);
Student s2 = new Student(3,"Luv" ,20, 12345);
assertEquals(s1, s2);
assertEquals(s1.hashCode(), s2.hashCode());
}
@Test
void testToString() {
Student s = new Student(5,"Luv" ,20, 12345);
String expectedToString = "Student(name=Luv, age=20, salary=12345.7)";
assertEquals(expectedToString, s.toString());
}
}
