package com.springcore.referencetypeDependencyInjection;

public class Course {
	
	
	private String courseName;
	private String duration;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", duration=" + duration + "]";
	}
	
	

}
