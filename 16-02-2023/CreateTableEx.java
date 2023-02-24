package com.studentmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {
	public static void main(String args[]) {
		//try with resource
	try(Connection conn=DatabaseConnection.getDbConnection())
	{
		Statement st=conn.createStatement();
		String sql="create table student(Roll_number int primary key,name varchar(50),email varchar(50),course varchar(10))";
		//execute query
		st.executeUpdate(sql);
		System.out.println("Table created succesfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
}
