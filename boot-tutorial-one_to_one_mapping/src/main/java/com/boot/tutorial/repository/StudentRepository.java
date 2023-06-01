package com.boot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.tutorial.modal.Student;


@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
