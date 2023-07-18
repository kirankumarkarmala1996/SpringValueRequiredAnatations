package com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		Student student=context.getBean("stu",Student.class);
		student.displayDetails();	
		
	}

}
