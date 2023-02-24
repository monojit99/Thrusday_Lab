package com.studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateStudent {
	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			System.out.println("Enter the email: ");
			String email=sc.nextLine();
			System.out.println("Enter the course: ");
			String course=sc.nextLine();
			String query="update student set name='"+name+"',email='"+email+"',course='"+course+"'where Roll_number=?"; //update query
			PreparedStatement ps=conn.prepareStatement(query); //connection for fetch the query
			System.out.println("Enter Roll no: ");
			int Roll_number=sc.nextInt();
			ps.setInt(1, Roll_number);
			int row=ps.executeUpdate(); //update the database
			System.out.println(row+" record update succesfully");
			String sql="select * from student where Roll_number='"+Roll_number+"'";
			PreparedStatement ps1=conn.prepareStatement(sql);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Student Roll no: "+rs.getInt("Roll_number"));
				System.out.println("Student name: "+rs.getString("name"));
				System.out.println("Student email: "+rs.getString("email"));
				System.out.println("Student course: "+rs.getString("course"));
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
