package Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dao.CustomerServiceIMPL;
import modal.Customer;
import service.CustomerService;

public class CustomerApp {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceIMPL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name");
		String name=sc.next();
		
		System.out.println("Enter customer address");
		String address =sc.next();
		
		System.out.println("Enter customer phone");
		long phone=sc.nextLong();
		
		System.out.println("Enter the dbo in YYY-MM-DD");
		String db1=sc.next();
		
		 LocalDate dob=LocalDate.parse(db1);
		 Customer customer=new Customer();
		 customer.setCustomerName(name);
		 customer.setAddress(address);
		 customer.setPhone(phone);
		 customer.setDob(dob);
		Customer customerObj= service.addCustomer(customer);
		if(customerObj!=null)
		{
			System.out.println("congratulation "+ " "+customer.getCustomerName());
			
		List<Customer> list= service.getAllCustomer();
		list.forEach(c->System.out.println(c));
			
		}else
		{
			System.out.println("not able to sign up");
		}
		sc.close();
	
		
	}
}
