package com.B104;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbcconnect {
	private static final String URL="jdbc:mysql://localhost:3306/emp_database";
	private static final String username="root";
	private static final String pass="root";
	
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection(URL,username,pass);
			System.out.println("Connection established successfully");
			
			try {
				PreparedStatement psm=con.prepareStatement("Select * from emp_details where age<=?");
				psm.setInt(1, 25);
				ResultSet rs=psm.executeQuery();
				
				
				while(rs.next()) {
					System.out.println(rs.getString("name"));
				}
				
			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	
}
