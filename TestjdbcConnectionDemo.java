package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import utility.DButil;

public class TestjdbcConnectionDemo {

	public static void main(String[] args) throws IOException, SQLException{
		// TODO Auto-generated method stub
		File file = new File("D://customer.txt");
		Reader reader=new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String str = br.readLine();
		System.out.println(str);
		String[] strArray= str.split(",");
		int order_Id=Integer.parseInt(strArray[0]);
		String orderName=strArray[1];
		double orderPrice=Double.parseDouble(strArray[2]);
		LocalDate date=LocalDate.parse(strArray[3]);
		int custId = Integer.parseInt(strArray[4]);
		
		Connection connection = DButil.getDBConnection();
		String inserQuery="insert into order_table values(?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(inserQuery);
		ps.setInt(1, order_Id);
		ps.setString(2, orderName);
		ps.setDouble(3, orderPrice);
		java.sql.Date d= java.sql.Date.valueOf(date);
		ps.setDate(4, d);
		ps.setInt(5, custId);
		int status = ps.executeUpdate();
		if(status>0) {
			System.out.println("Inserteed");
			
		}

		
	}

	}


