package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public  class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemplate;
	
	public int insert(Student student) {
		//insert querry
		 String query ="insert into student(id,name,address) values(?,?,?)";
		int r =  this.jdbctemplate.update(query, student.getId(),student.getName(),student.getAddress());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	
	
}
