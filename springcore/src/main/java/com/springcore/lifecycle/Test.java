package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		
		AbstractApplicationContext  context = new  ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//Regestering Shutdown hoook to call the destroy method 
				context.registerShutdownHook();

		
		
//		Car c = (Car)context.getBean("car1");
				//		
//		
//		Pepsi p =(Pepsi)context.getBean("p1");
//		System.out.println(p);
//	
				
	AnnotationExample ex = (AnnotationExample)context.getBean("subject");
	
	System.out.println(ex.getSubject());
	
	}
	
}
