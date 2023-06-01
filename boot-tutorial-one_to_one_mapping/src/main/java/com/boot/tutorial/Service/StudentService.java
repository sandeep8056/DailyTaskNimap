package com.boot.tutorial.Service;

import java.util.List;

import com.boot.tutorial.modal.Student;

public interface StudentService {
	
	public List<Student> getAllStudent(Integer pageNo,Integer pageSize);
	
	public Student addStudent(Student studentDto);
	
	public String  updateStudent(Integer id, Student student);
	
	public String deleteStudent(Integer id);
	
}
