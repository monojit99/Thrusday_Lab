package com.studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class SelectByRoll {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			do {
			String sql="select * from student where Roll_number=?"; //select query for fetch the data
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter the Roll no: ");
			int roll=sc.nextInt();
			ps.setInt(1, roll);
			ResultSet rs=ps.executeQuery(); //method for printing the list
			if(rs.next())
			{
				System.out.println("Student Roll no: "+rs.getInt(1));
				System.out.println("Student Name: "+rs.getString("name"));
				System.out.println("Student Email: "+rs.getString("email"));
				System.out.println("Student Course: "+rs.getString(4));
				System.out.println("==========================");
			}
			else
				System.out.println("Roll no. not found"); //statement for not found exception
			}while(true);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
