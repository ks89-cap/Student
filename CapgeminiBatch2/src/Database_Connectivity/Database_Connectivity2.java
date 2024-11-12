package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Connectivity2 {
	static final String url="jdbc:mysql://localhost/training_institute";
	static final String username="root";
	static final String password="";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con= DriverManager.getConnection(url,username,password);) {
			Statement stmt= con.createStatement();
			//ResultSet res= stmt.executeQuery("show databases");
			System.out.println("databases");
			System.out.println("========================================");
			//String sql="create database training_Institute";
			//String sql="create table training_institute"+"(t_id integer not null,"+"t_name varchar(25),"+"t_duration varchar(20),"+"t_date date,"+"primary key (t_id))";
			//String sql="insert into training_institute values(111,'V&V Automation','3 months','2024/10/07')";
			//String sql2="insert into training_institute values(112,'Selenium Java','2 months','2024/10/08')";
			//String sql3="insert into training_institute values(113,'Java Full stack','1.5 months','2024/11/06')";
			//String sql4="insert into training_institute values(114,'Big data','2.5 months','2024/11/01')";
			//String alterTableSQL = "ALTER TABLE training_institute ADD COLUMN training_location VARCHAR(20)";
            //stmt.executeUpdate(alterTableSQL); 
			//String sql1="UPDATE training_institute  SET training_location ='Pune' WHERE t_id=111";
			//String sql1="UPDATE training_institute  SET training_location ='Bangalore' WHERE t_id=112";
			//String sql1="UPDATE training_institute  SET training_location ='Chennai' WHERE t_id=113";
			//String sql1="UPDATE training_institute  SET training_location ='Mumbai' WHERE t_id=114";
			//String sql1="UPDATE training_institute  SET t_duration ='3 months' WHERE t_name='Big data'";
			//String sql1="UPDATE training_institute  SET t_duration ='3 months' WHERE t_name='Big data'";
			//String alterTableSQL = "ALTER TABLE training_institute RENAME TO Training_First ";C
			
			//String alterTableSQL = "ALTER TABLE training_institute RENAME TO Training_First ";

			//stmt.executeUpdate(alterTableSQL); 
			/*while(res.next())
			{
				String duration=res.getString("t_duration");
				String name=res.getString("t_name");

				/*System.out.println(res.getInt("age"));
				System.out.println(res.getString("first"));
				System.out.println(res.getString("last"));
				System.out.println(duration + ", " + name);
			}*/
			//res.close();
			//System.out.println("updated");
		
        //stmt.executeUpdate(sql2);
		//stmt.executeUpdate(sql2);
		//stmt.executeUpdate(sql3);
		//stmt.executeUpdate(sql4);
//System.out.println("database created successfully");
			
			/*while(res.next())
			{
				System.out.println(res.getString(1));
			}*/
			
			
			
			String sql1="SELECT t_duration,t_name FROM training_first ";
			ResultSet res= stmt.executeQuery(sql1);
			
			 while (res.next()) {
	                // Get each column value by column name
	                String tDuration = res.getString("t_duration");  // Use the correct column names
	                String tName = res.getString("t_name");

	                // Display the result
	                System.out.println(tDuration + "       " + tName);
	            }
			 res.close();
	            System.out.println("\n");

	            System.out.println("Data displayed successfully!");
	            
	            
	            
	            
	            
		
            
			
			


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}