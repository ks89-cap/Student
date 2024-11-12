package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {
	static final String url="jdbc:mysql://localhost/students";
	static final String username="root";
	static final String password="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con= DriverManager.getConnection(url,username,password);
				Statement stmt= con.createStatement();)
		
			
					{
				// cod to retrieve all the databases in the phpmyadmin
				
				String sql="create table registration"+"(id integer not null,"+"first varchar(25),"+"last varchar(20),"+"age integer,"+"primary key (id))";
				stmt.executeUpdate(sql);
				//ResultSet res= stmt.executeQuery("show databases");
				System.out.println("table created");
				//System.out.println("========================================");
				/*while(res.next())
				{
					System.out.println(res.getString(1));
				}

				//String sql="create database students";
				//stmt.executeUpdate(sql);
				//System.out.println("database created successfully");*/
				
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

					}
	

	}


