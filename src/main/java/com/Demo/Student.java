package com.Demo;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
//here we can Directly pass the value or else we can get the 
//dynamic data from the property file.just pass"${pass the key inside the curly brasses}"
	
//	(or else)
//	directly remove all the setter methods  and configure the @ value Annotations at variable level
//	@Value("${student.name}")
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Value("${student.interestedCourse}")
//	@Required
//	public void setInterestedCourse(String interestedCourse) {
//		this.interestedCourse = interestedCourse;
//	}
//	@Value("${student.hobby}")
//	@Required
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}

	public void displayDetails() {
		System.out.println("StudentName:" + name);
		System.out.println("interestedCourse:" + interestedCourse);
		System.out.println("hobby:" + hobby);
	}

}
