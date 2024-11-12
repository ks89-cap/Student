package Database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update_table2 {
	static final String url="jdbc:mysql://localhost/students";
	static final String user= "root";
	static final String password="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			String upd="update registration set age= 24 where id=104";
			PreparedStatement pstmt= con.prepareStatement(upd);
			pstmt.setInt(1, 51);
			pstmt.setInt(2, 35);
			pstmt.executeUpdate();
			String sql= "select * from registration where id=104";
			ResultSet res= pstmt.executeQuery(sql);
			while(res.next())
			{
				System.out.println(res.getInt(0));
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));



				
			}
			res.close();
			pstmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
