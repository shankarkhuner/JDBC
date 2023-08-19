import java.sql.Connection;
import java.sql.DriverManager;

public class New_Sql {

	public static void main(String[] args) {
		Connection connection = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
	Connection connection1=	
			DriverManager.
	getConnection("jdbc:mysql://localhost:3306/CSJ20","root","root");
		
	System.out.println("Connection Established successfully");
	}
		catch(Exception e){
			System.out.println("Connection is not Established ");
			System.out.println(e);
			 
		}
	}
	
}
