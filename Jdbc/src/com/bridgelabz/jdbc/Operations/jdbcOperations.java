package com.bridgelabz.jdbc.Operations;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class jdbcOperations {
	static JdbcConnection jcon;
	static {
		jcon = new JdbcConnection();
	}
	
		public static void insertdata(int sid ,String sname) throws ClassNotFoundException, SQLException {
		Statement st =(Statement) jcon.connect();
		int count = st.executeUpdate("insert into student values("+sid+",'"+sname+"')");
		System.out.println(count+" rows affected");
		}
		
		public static void fetch() throws ClassNotFoundException, SQLException {
			Statement st = (Statement) jcon.connect();
			try{
				ResultSet rs = st.executeQuery("select*from student");
				 	System.out.println("srno  Student name");
			while(rs.next()) {
				      
				System.out.println(rs.getInt(1)+"     "+rs.getString(2));
			}
			}finally{
				jcon.close();	
			}
			
		}
		
		public static void deletebyid(int sid) throws ClassNotFoundException, SQLException {
			Statement st = (Statement) jcon.connect();
			try{
			int c = st.executeUpdate("delete from student where sid ="+sid+"");
				System.out.println(c+" rows affected");
			}finally{
				jcon.close();	
			}
			
		}
		
		public static void deletebyname(String sname) throws ClassNotFoundException, SQLException {
			Statement st = (Statement) jcon.connect();
			try{
			int c = st.executeUpdate("delete from student where sname ="+sname+"");
				System.out.println(c+" rows affected");
			}finally{
				jcon.close();	
			}
			
		}
		public static void updateData(int sid,String sname) throws ClassNotFoundException, SQLException {
			Statement st = (Statement) jcon.connect();
			try{
			int c = st.executeUpdate("update student set sname="+sname+" where sid ="+sid+"");
				System.out.println(c+" rows affected");
			}finally{
				jcon.close();	
			}
			
			
		}
}
