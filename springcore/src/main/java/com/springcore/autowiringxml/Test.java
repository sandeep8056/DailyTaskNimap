package com.springcore.autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiringxml/config.xml");
		
		Employee emp = context.getBean("emp",Employee.class);
		
		System.out.println(emp.getAddress().getCity());
	}
}
