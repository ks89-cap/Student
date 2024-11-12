package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Record {
	static final String url="jdbc:mysql://localhost/students";
	static final String username="root";
	static final String password="";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con= DriverManager.getConnection(url,username,password);
				Statement stmt= con.createStatement();)
		
			
					{
				// cod to retrieve all the databases in the phpmyadmin
				
				String sql="insert into registration values(101,'Krishna','Priya',18)";
				stmt.executeUpdate(sql);
				String sql1="insert into registration values(102,'Reshma','Iyer',23)";
				stmt.executeUpdate(sql1);
				String sql2="insert into registration values(103,'Gouri','Ajay',24)";
				stmt.executeUpdate(sql2);
				String sql3="insert into registration values(104,'Aiswarya','Mohan',18)";
				stmt.executeUpdate(sql3);
				String sql5="insert into registration values(105,'Devika','Thilakaraj',23)";
				stmt.executeUpdate(sql5);
				//ResultSet res= stmt.executeQuery("show databases");
				System.out.println("values inserted");
				System.out.println("========================================");
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

