package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PracticeDatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//we have to load Driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","Sai@1439");
          
		 Statement stmt = con.createStatement();
		 
		 String sql = "select * from shop";
		 
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 while(rs.next()) {
			 System.out.println(rs.getString(1));
		
			 System.out.println(rs.getInt(2));
			 
			 System.out.println(rs.getString(3));
			 System.out.println("*****************");
		 }
		 
		 con.close();
		 rs.close();
		 stmt.close();		 
		 
	}

}
