package com.bridgelabz.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankush", "root", "password");
		CallableStatement stmt = con.prepareCall("{CALL `ankush`.`insert`(?,?)}");
		stmt.setInt(1,11);
		stmt.setString(2,"Mohan");
		stmt.execute();
		con.close();
		System.out.println("Sucess");
	}

}
