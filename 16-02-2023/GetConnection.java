package com.studentmanagement;

import java.sql.Connection;
import java.sql.SQLException;
//establish the connection
public class GetConnection 
{
    public static void main( String[] args ) throws SQLException
    {
    	Connection conn=DatabaseConnection.getDbConnection(); //method for db connection
        System.out.println(conn);
    }
}
