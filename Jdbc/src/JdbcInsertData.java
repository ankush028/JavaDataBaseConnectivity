import java.sql.*;


public class JdbcInsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankush","root","password");
		Statement st = con.createStatement();
		int count = st.executeUpdate("insert into student values(3,'sachin')");
		
		System.out.println(count);
		
		int count1 = st.executeUpdate("delete table student");
		System.out.println(count1);
		
	}

}
