package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Update_Connectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost/department";
		String username="root";
		String password="";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
			String alterTableSQL = "ALTER TABLE employee ADD COLUMN salary INT(10)";
            stmt.executeUpdate(alterTableSQL); 
            System.out.println("Column 'salary' added successfully");

            String updateSQL = "UPDATE employee SET salary = 10000 WHERE e_id = 101";
            stmt.executeUpdate(updateSQL); 

            System.out.println("Salary updated for employee with e_id = 101.");
            //ResultSet res=stmt.executeQuery("select e_id,e_name,e_city from employee where salary=10000");
           /* while(res.next())
			{
				String e_name=res.getString("e_name");
				int e_id= res.getInt("e_id");
				String e_city= res.getString("e_city");
				int salary= res.getInt("salary");
				
				System.out.println(e_name+ " || "+e_id+"    city:: "+e_city+" =>  "+salary);
			}*/

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
