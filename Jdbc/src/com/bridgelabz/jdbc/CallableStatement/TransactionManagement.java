package com.bridgelabz.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


import com.mysql.jdbc.PreparedStatement;

public class TransactionManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankush","root","password");
		
		PreparedStatement pst = (PreparedStatement)con.prepareStatement("insert into student values(?,?)");
		pst.setInt(1,10);
		pst.setString(2,"hello");
		pst.execute();
		System.out.println("Sucess");
		//int count = pst.executeUpdate("insert into student values(16,'ram')");
		//System.out.println(count +" rows affeced");
		
				
		
		
		
	}

}
