package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
	
	
	private String subject;

	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnnotationExample(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("init method using annotation");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method using annotation");
	}

}
