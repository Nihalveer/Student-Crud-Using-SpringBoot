package com.example.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.Student;
import com.example.Student.Service.StudentService;

@RestController
@RequestMapping("/proj")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/stdinsert")
	public Student saveStudent(@RequestBody Student s)
	{
		return ss.saveStudent(s);
	}
	
	@PutMapping("/stdupdate/{id}")
	public Student updatestd(@PathVariable("id") int id,@RequestBody Student s)
	{
		s.setId(id);
		 Student s1=ss.upstudent(id,s);
		return s1;
	}
	@GetMapping("/Stdfetchall")
	public List<Student> getStudent()
	{
		List<Student> std=ss.getStudent();
		return std;
	}
	
	@GetMapping("/stdfetch/{id}")
	public Student getStdById(@PathVariable("id")int id)
	{
		//return ss.getStudentById(id);
		Student std=ss.getStudentById(id);
		if(std !=null)
		{
			return std;
		}
		else
		{
			return null ;
		}
	}
	
	@DeleteMapping("/stddelete/{id}")
	public void deleteByid(@PathVariable("id") int id) 
	{
		 ss.deleteByid(id);
	}
}

