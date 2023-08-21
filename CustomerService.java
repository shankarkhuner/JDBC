package service;

import java.util.List;

import modal.Customer;

public interface CustomerService {  

	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public int updateCustomer(int customerId, Customer newCustomer);
	public int deleteCustomer(int customerId);
	
	public Customer getCustomerById(int customerId);
	
}
