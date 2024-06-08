package com.noscrop.crud_demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.valves.ExtendedAccessLogValve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.noscrop.crud_demo.entity.Student;
import com.noscrop.crud_demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public Student getStudentById(int id) {
		
		return repository.findById(id).get();
	}
	
	public Student updateStudent(Student student) {
		
		
		Student exstStudent = repository.findById(student.getId()).get();
		
		if(exstStudent!=null) {
			exstStudent.setBranch(student.getBranch());
			exstStudent.setName(student.getName());
			exstStudent.setPercentage(student.getPercentage());
			
		}
		
		return repository.save(exstStudent);
	}
	
	public boolean deleteStudentById(int id) {
		Student exstStudent = repository.findById(id).get();
		
		if(exstStudent!=null) {
			repository.delete(exstStudent);
			return true;
		}
		
		return false;
	}

}
