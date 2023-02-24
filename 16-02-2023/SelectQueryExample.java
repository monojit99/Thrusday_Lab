package com.studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQueryExample {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getDbConnection())
		{
			String sql="select * from student";
			PreparedStatement ps1=conn.prepareStatement(sql);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				System.out.println("Student Roll no: "+rs.getInt(1));
				System.out.println("Student name: "+rs.getString("name"));
				System.out.println("Student email: "+rs.getString("email"));
				System.out.println("Student Salary: "+rs.getString(4));
				System.out.println("==============================");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
