package com.dushant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String userName="root";
	private static final String password="root";
	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/jdbc_db";
	
	public Connection getConnection() {
		try{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("DataBase Connection established Succesffully");
			return con;
		}catch(ClassNotFoundException  | SQLException e) {
	     e.printStackTrace();		
			return null;
		}
		
		
		
	}
}
