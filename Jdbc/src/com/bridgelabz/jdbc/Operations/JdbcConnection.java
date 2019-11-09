package com.bridgelabz.jdbc.Operations;

import java.sql.*;

public class JdbcConnection {
	
	Statement connect() throws ClassNotFoundException, SQLException {
		
		String url ="jdbc:mysql://localhost:3306/ankush";
		String uname = "root";
		String password = "password";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		
		return st;
		
	}

}
