package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;

public class TestcallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/csj20","root","root");
		
		CallableStatement cst=con.prepareCall("{call getSum(?,?,?)}");
		cst.setInt(1, 100);
		cst.setInt(2, 200);
		cst.registerOutParameter(3, JDBCType.INTEGER);
		cst.execute();
		int result = cst.getInt(3);
		System.out.println(result);
		
		

	}

}
