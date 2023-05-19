package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	/* Ioc detect every attribute asd String and try to perform with constructor contain String as 
	 * parameter if we do not specified order the type then it take 1st order constructor in constructor overloaded*/
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person pers = (Person)context.getBean("person");
		System.out.println(pers.getName());
		System.out.println(pers.getCer());
		System.out.println(pers.getList());
		
		Addition ad = (Addition)context.getBean("add");
		
		ad.doSum();
		
	
		
	}

}
