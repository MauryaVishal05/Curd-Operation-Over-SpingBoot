package com.noscrop.crud_demo.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noscrop.crud_demo.entity.Student;
import com.noscrop.crud_demo.repository.StudentRepository;
import com.noscrop.crud_demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService service;
	
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents(){
		
		List<Student> students = service.getAllStudents();
		return ResponseEntity.status(HttpStatus.OK).body(students);
		
	}
	
	
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student saveStudent = service.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveStudent);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		Student studentById = service.getStudentById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(studentById);
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student) {
		student.setId(id);
		Student updateStudent = service.updateStudent(student);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(updateStudent);
	}
	
	
	@DeleteMapping("student/{id}")
	public boolean deleteStudentById(@PathVariable int id) {
		return service.deleteStudentById(id);
	}

}
