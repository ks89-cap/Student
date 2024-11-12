package Database_Connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Declare a variable with URL of the database
		String url="jdbc:mysql://localhost/department"; //byheart it
		String username="root";
		String password="";
		
		 //register with Driver Manager
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // with com.mysql.jdbc.driver, an error will come then when we run it it will show the correct driver address
			Connection con=DriverManager.getConnection(url,username,password);
			Statement statement=con.createStatement();
			ResultSet res=statement.executeQuery("select e_id,e_name,e_city from employee");
			//DriverManager.getConnection(url, username, password);
			
			while(res.next())
			{
				String e_name=res.getString("e_name");
				int e_id= res.getInt("e_id");
				String e_city= res.getString("e_city");
				System.out.println(e_name+ " || "+e_id+"    city:: "+e_city);
				//System.out.println(e_id);

			}
			System.out.println("connection established");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
