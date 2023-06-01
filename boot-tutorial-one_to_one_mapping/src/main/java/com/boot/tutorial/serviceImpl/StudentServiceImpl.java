package com.boot.tutorial.serviceImpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.boot.tutorial.Service.StudentService;
import com.boot.tutorial.modal.Student;
import com.boot.tutorial.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent(Integer pageNo, Integer pageSize) {

		Pageable pageable = PageRequest.of(pageNo, pageSize);
		List<Student> studentList = studentRepository.findAll(pageable).getContent();
		return studentList;
	}

	@Override
	public Student addStudent(Student student) {
		try {
			Student newStudent = new Student();
			newStudent.setStudentName(student.getStudentName());
			newStudent.setAbout(student.getAbout());
			newStudent.setLaptop(student.getLaptop());

			return studentRepository.save(newStudent);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public String updateStudent(Integer id, Student updatestudent) {
		try {
			Student previousStudent = null;
			Optional<Student> student = studentRepository.findById(id);

			if (!Objects.isNull(student)) {
				previousStudent = student.get();
			}

			previousStudent.setStudentName(updatestudent.getStudentName());
			previousStudent.setAbout(updatestudent.getAbout());
			previousStudent.setLaptop(updatestudent.getLaptop());

			studentRepository.save(previousStudent);
			return "student succesfully  updated";
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public String deleteStudent(Integer id) {
		try {
			studentRepository.deleteById(id);

			return "student deleted successfully id : " + id;
		} catch (Exception e) {
			throw e;
		}
	}

}
