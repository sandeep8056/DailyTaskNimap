package com.springcore.referencetypeDependencyInjection;

public class Student {
	
	private String name;
	private Course course;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Student(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	
	

}
