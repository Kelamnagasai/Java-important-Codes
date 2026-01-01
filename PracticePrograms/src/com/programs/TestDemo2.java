package com.programs;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class TestDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjava","root","Sai@1439");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from mobile");
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println("************");
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
