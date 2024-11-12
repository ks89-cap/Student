package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Database {
	static final String url="jdbc:mysql://localhost/";
	static final String username="root";
	static final String password="";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con= DriverManager.getConnection(url,username,password);
			)
		
				{
			// cod to retrieve all the databases in the phpmyadmin
			Statement stmt= con.createStatement();
			ResultSet res= stmt.executeQuery("show databases");
			System.out.println("databases");
			System.out.println("========================================");
			while(res.next())
			{
				System.out.println(res.getString(1));
			}

			//String sql="create database students";
			//stmt.executeUpdate(sql);
			//System.out.println("database created successfully");
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
