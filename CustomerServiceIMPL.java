package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modal.Customer;
import service.CustomerService;
import utility.DButil;

public  class CustomerServiceIMPL implements CustomerService{

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Connection connection=null;
		int status=0;
		try {
		connection = DButil.getDBConnection();
		String sqlInsertQuery = "insert into customer(customer_name, customer_address,customer_phone,customer_dob) values(?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sqlInsertQuery);
		ps.setString(1, customer.getCustomerName());
		ps.setString(2,customer.getAddress());
		ps.setLong(3, customer.getPhone());
		java.sql.Date d=Date.valueOf(customer.getDob());
		ps.setDate(4, d);
		status=	ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				connection.close();
				
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		if(status>0)
		{
			return customer;
		}
		return null;
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		Connection connection=null;
		List<Customer> listofcust=new ArrayList();
		try {
			connection=DButil.getDBConnection();
			String query = "select * from customer";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) 
			{
				int id = rs.getInt("customer_id");
				String name = rs.getString(2);
				String address=rs.getString(3);
				long phone = rs.getLong(4);
				java.sql.Date dob=rs.getDate(5);
				LocalDate dob1 = dob.toLocalDate();
				 Customer cust= new Customer();
				 cust.setCustomerId(id);
				 cust.setCustomerName(name);
				 cust.setAddress(address);
				 cust.setPhone(phone);
				 cust.setDob(dob1); 
				 listofcust.add(cust);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			try {
				connection.close();
			}
			catch(SQLException s){
				s.printStackTrace();
			}
		}
		return listofcust;
		// Update the customer data
	}
	@Override
	public int updateCustomer(int customer_id, Customer newCustomer) {
		// TODO Auto-generated method stub
		Connection connection =null;
		int status=0;
		try {
			connection=DButil.getDBConnection();
			String updateQuery="update customer SET customer_address=?,customer_phone=? where customer_id=?";
			PreparedStatement ps= connection.prepareStatement(updateQuery);
			ps.setString(2,newCustomer.getAddress());
			ps.setLong(1, newCustomer.getPhone());
			status=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				connection.close();
			}catch(SQLException e) {
				
			}
		}
		return status;
	}

	@Override
	public int deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(int customer_id) {
		// TODO Auto-generated method stub	
	Connection connection= null;
	Customer customer = null;
	//**********
	try {	
	
	connection = DButil.getDBConnection();
	PreparedStatement ps = connection.prepareStatement("select * from customer");
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		int id = rs.getInt("customer_id");
		String name = rs.getString(2);
		String address=rs.getString(3);
		long phone = rs.getLong(4);
		java.sql.Date dob=rs.getDate(5);
		
		//Converting sql data into localdate
		LocalDate dob1 = dob.toLocalDate();
		 customer = new Customer();
		
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		customer.setPhone(phone);
		customer.setAddress(address);
		customer.setDob(dob1);
	}
		
	}
	catch(Exception e){
		System.out.println(e);
		
	}
	return customer;
	}
	
}

