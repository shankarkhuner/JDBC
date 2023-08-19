import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sql_Demo {

	public static void main(String[] args) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
	Connection connection=	
			DriverManager.
	getConnection("jdbc:mysql://localhost:3306/CSJ20","root","root");
	System.out.println(connection);
	
	Statement st = connection.createStatement();
	
	
	}

}
