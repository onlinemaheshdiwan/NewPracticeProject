package com.dushant;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
	public void setValues() {
		String query="insert into employee values(1001,'Govind','Geeta')";
		DbConnection dbConnect=new DbConnection();
		Connection con=dbConnect.getConnection();
		try{
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("1 record is inserted successfully");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.err.println();
		}
	}
	
public static void main(String[] args) {
	InsertValues intValues=new InsertValues();
	intValues.setValues();
}
}
