package com.studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static Connection con=null;
	//this method will create connection and return connection object
	public static Connection getDbConnection() throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //jdbc driver for establishment
			con=DriverManager.getConnection("jdbc:mysql://"
					+"localhost:3306/svu","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
