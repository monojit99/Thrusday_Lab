package com.studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecordUsingPs {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getDbConnection(); //try-catch block for exception
		Scanner sc=new Scanner(System.in))
		{
			String sql="insert into student values(?,?,?,?)"; //insert query
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter the Roll no: ");
			int roll=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name: "); //user input for name
			String name=sc.nextLine();
			System.out.println("Enter the email: "); //user input for email
			String email=sc.nextLine();
			System.out.println("Enter the course: "); //user input for course
			String course=sc.nextLine();
			
			ps.setInt(1,roll);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, course);
			int r=ps.executeUpdate();
			System.out.println(r+" record inserted successfully");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
