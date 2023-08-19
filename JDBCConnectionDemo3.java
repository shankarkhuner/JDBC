import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ20","root","root");
			System.out.println("connection established successfully");
			
		}catch(Exception e) {
			System.out.println("Connection is not Estblished");
			System.out.println(e);
		}
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ20","root","root");
	}//try{Class.forName("com.mysql.cj.jdbc.Driver")}

}
