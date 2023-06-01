package com.boot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.Service.StudentService;
import com.boot.tutorial.modal.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students/")
	public ResponseEntity<?> getAllStudent(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
		try {
			return new ResponseEntity<>(studentService.getAllStudent(page, size), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping("/students/")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {

		try {
			return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
	
	@PutMapping("/students")
	public ResponseEntity<?> updateStudent(@RequestParam("id") Integer id,@RequestBody Student student){
		try {
			return new ResponseEntity<>(studentService.updateStudent(id, student),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);	
			}	
	}
	
	@DeleteMapping("/students/")
	public ResponseEntity<?> deleteUser(@RequestParam Integer id){
		try {
			return new ResponseEntity<>(studentService.deleteStudent(id),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}

}
