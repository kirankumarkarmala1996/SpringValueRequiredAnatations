package com.Students;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jdbc.xml");
		Students stude=context.getBean("students",Students.class);
		stude.displayjdbcProperties();
	}

}
