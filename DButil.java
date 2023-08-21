package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	
		public static Connection getDBConnection() {
		Connection connection = null;
		try{
			//Class.forName("com.mysql.cj.jdbc.Driver");
		connection=	
					DriverManager.
			getConnection("jdbc:mysql://localhost:3306/csj20","root","root");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return connection;
		
}

}
