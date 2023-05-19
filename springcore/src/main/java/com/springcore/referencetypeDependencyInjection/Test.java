package com.springcore.referencetypeDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referencetypeDependencyInjection/referencetypeconfig.xml");
	
		Student s = (Student)context.getBean("st1");
		System.out.println("Name  " +s.getName());
		
		System.out.println("Course  "+s.getCourse().getCourseName());

		System.out.println("Duration  "+s.getCourse().getDuration());
	//	System.out.println(s.getCourse());
	}

}
