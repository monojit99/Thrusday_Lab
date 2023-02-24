package com.studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DeleteStudent {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			do {
			String sql="delete from student where Roll_number=?"; //delete query for student table
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter the Roll no: ");
			int roll=sc.nextInt();
			ps.setInt(1, roll);
			int rs=ps.executeUpdate();
			System.out.println(rs+" record deleted Successfully");
			}while(true);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}

