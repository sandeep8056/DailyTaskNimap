package com.springcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student)context.getBean("student1");
        Student stu = (Student)context.getBean("student2");
       Student st = (Student) context.getBean("student");
        
        System.out.println(student);
        System.out.println(stu);
        System.out.println(st);
        
           
    }
}
