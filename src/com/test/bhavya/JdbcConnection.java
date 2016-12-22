package com.test.bhavya;
import java.sql.*;
public class JdbcConnection {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "bhavyaroot");
			System.out.println("Connected");
			
		//	Statement stmt = con.createStatement();
			PreparedStatement st = con.prepareStatement("select * from course where courseno = ?");
			st.setString(1, "FIN450");
	//		ResultSet r = st.
			ResultSet result = st.executeQuery();
			while (result.next())
				System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3));
			con.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		

	}	

}
