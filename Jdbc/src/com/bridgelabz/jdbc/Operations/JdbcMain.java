package com.bridgelabz.jdbc.Operations;

import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		jdbcOperations op = new jdbcOperations();
		System.out.println("enter the choice");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : enter the data");
		System.out.println("2 : show alll data in a table");
		System.out.println("3 :Delete data by id");
		System.out.println("4 :Deletew data by name");
		
		int c = sc.nextInt();
		
		
		switch(c) {
		case 1:
			System.out.println("Enter the student id");
			int sid = sc.nextInt();
			System.out.println("Enter the student name");
			String sname = sc.next();
			
			op.insertdata(sid,sname);
			
			break;
		case 2:
			op.fetch();
			break;
		case 3:
			System.out.println("Enter the student id");
			int sidd = sc.nextInt();
			op.deletebyid(sidd);
			break;
		case 4:
			System.out.println("Enter the name of the student");
			String name = sc.next();
			op.deletebyname(name);
			break;
		case 5:
			
			System.out.println("Enter the student id");
			int siidd = sc.nextInt();
			System.out.println("Enter the student name");
			String snamee = sc.next();
			
			op.updateData(siidd, snamee);
			break;

	}
sc.close();
}
}
