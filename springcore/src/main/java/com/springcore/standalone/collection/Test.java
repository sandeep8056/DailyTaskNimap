package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");

		Person person = (Person)context.getBean("person");
		
		System.out.println(person.getFriends());
		System.out.println(person.getCoursefee());
		System.out.println(person.getCoursefee().getClass().getName());
		
	}
	

}	
