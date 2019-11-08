import java.sql.*;

public class Jdbc2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankush","root","password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select*from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2));
		}
		con.close();
		rs.close();
	}

}
