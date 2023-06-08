package com.example.Student.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Student.Entity.Student;
import com.example.Student.Repository.StudentRepository;
import com.example.Student.Service.StudentService;
@Service
public class StudentImpl implements StudentService{
	
	@Autowired
	StudentRepository sr;

	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public Student upstudent(int id, Student s) {
		// TODO Auto-generated method stub
		Student st=sr.findById(s.getId()).get();
		return sr.save(s);
	}
	
	@Override
	public Student getStudentById(int id) {
	 Optional<Student> s=sr.findById(id);
	 return s.orElse(null);
	}
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void deleteByid(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	
	

	
	

}
