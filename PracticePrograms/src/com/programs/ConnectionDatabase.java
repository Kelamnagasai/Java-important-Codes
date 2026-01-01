package com.programs;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class ConnectionDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//get connection to driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded successfully");
		
		//Establish the connection to Database
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjava","root","Sai@1439");

	}

}
