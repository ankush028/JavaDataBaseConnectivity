package com.bridgelabz.jdbc.CallableStatement;

import java.sql.*;

public class CallableFetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankush", "root", "password");
		CallableStatement stmt = con.prepareCall("{CALL `ankush`.`fetch`()}");
		try{
		ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2));
		}
		}finally{
			jcon.close();	
			}
		

	}

}
