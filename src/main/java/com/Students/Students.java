package com.Students;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class Students {
//	using Spring we can get the Connections from the jdbc
	@Value("${mysql.UserName}")
	private String userName;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.driver}")
	private String driver;
	
	
	public void displayjdbcProperties() {
		System.out.println(userName+" "+password+" "+url+" "+driver);
	}
	
	public void getConnections() throws Exception {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("Connection"+con);
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "Admin@123");
//		System.out.println(con);
	}

}
