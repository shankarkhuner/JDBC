package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestDemo {

	

	public static void main(String[] args) throws IOException, FileNotFoundException, SQLException{
		Reader reader = new FileReader("./src/dbconfig.properties");
		Properties p=new Properties();
		p.load(reader);
		String driverName=p.getProperty("drive");
		System.out.println(driverName);
		String url=p.getProperty("url");
		String userName=p.getProperty("user");
		String password=p.getProperty("password");
		System.out.println(driverName);
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("Connection estableshed");
		/*String insertQuery="insert into company_profile value(?,?)";
		InputStream input = new FileInputStream("D://indigo.jpg");
		PreparedStatement ps=con.prepareStatement(insertQuery);
		ps.setBinaryStream(2,input);
		int status = ps.executeUpdate();
		if(status>0)
		{
			System.out.println("inserted");
			
		}
		*/
		OutputStream fout=new FileOutputStream("D://save-logo.png");
		String fetchQuery="select company_image from company_profile where Company_name=?";
		PreparedStatement ps = con.prepareStatement(fetchQuery);
		ps.setString(1,"Indigo");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			byte[] img = rs.getBytes("Company_image");
			fout.write(img);
			System.out.println("File Written Successfully");
		}
		
		
		
		
		
		
		

	}

}
