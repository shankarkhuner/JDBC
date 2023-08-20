package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;

public class Calleblae {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/csj20","root","root");
		
		CallableStatement cs=con.prepareCall("{call getAddressById(?,?)}");
		cs.setInt(1, 2);
		cs.registerOutParameter(2, JDBCType.VARCHAR);
		cs.execute();
		String addr=cs.getString(2);
		System.out.println(addr);
		}catch(Exception e) {
			System.out.println("Not Inserted");
		}
	}

}
