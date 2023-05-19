package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1 = (Emp)context.getBean("Emp1");
		System.out.println(emp1);
		System.out.println(emp1.getProps());
		
		System.out.println(emp1.getMobileNo().getClass().getName());
		
		System.out.println(emp1.getAddress().getClass().getName());
		System.out.println(emp1.getCourse().getClass().getName());
		
	}

}
