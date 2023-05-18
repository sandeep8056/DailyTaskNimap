package com.springcore.sterotype;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/config.xml");
		Student s = (Student)context.getBean("student");
		Student s1 = (Student)context.getBean("student");
		
		
		System.out.println(s.getStudentName()+"   "+ s.getCity());
		System.out.println(s.getFriends());
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		
	
		
	}
}