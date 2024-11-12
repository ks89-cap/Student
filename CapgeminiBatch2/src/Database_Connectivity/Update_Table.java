package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Table {
	static final String url="jdbc:mysql://localhost/students";
	static final String user= "root";
	static final String password="";
	static final String query="select id,first,last,age from registration";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
			(Connection con= DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement();)
			{
			String sql="UPDATE registration SET age=20 WHERE id=101";
			stmt.executeUpdate(sql);
			ResultSet res= stmt.executeQuery(query);
			while(res.next())
			{
				System.out.println(res.getInt("id"));
				System.out.println(res.getInt("age"));
				System.out.println(res.getString("first"));
				System.out.println(res.getString("last"));



			}
			res.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
