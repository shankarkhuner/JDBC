package SQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCMain {

	
		/*Connection connection = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Creating a connection 
		System.out.println("Driver Loaded");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ20","root","root");	
		System.out.println("connection Established");
		
		
		}catch(Exception e) {
		System.out.println("Connection is not established");
		System.out.println(e);
		
		e.printStackTrace();
			
		}*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		//	Connection connection=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
				System.out.println("connection established successfully");
				
			}catch(Exception e) {
				System.out.println("Connection is not Estblished");
				System.out.println(e);
				e.printStackTrace();
			}
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ20","root","root");
		}

}
