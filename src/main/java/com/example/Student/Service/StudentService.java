package com.example.Student.Service;

import java.util.List;

import com.example.Student.Entity.Student;

public interface StudentService {

	Student saveStudent(Student s);

	Student upstudent(int id, Student s);

	List<Student> getStudent();
	
	Student getStudentById(int id);

	void deleteByid(int id);

	

	

}
