package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model1.Employee;
import model1.Task;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		System.out.println("check your data base");
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp Id");
		int id = sc.nextInt();
		System.out.println("Enter emp Name");
		String name = sc.next();
		System.out.println("Enter emp salary");
		double salary = sc.nextDouble();
		System.out.println("Enter emp address");
		String address = sc.next();
		System.out.println("Enyer emp phone");
		long ph = sc.nextLong();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setSalary(salary);	
		emp.setAddress(address);
		emp.setPhoneNumber(ph);
		Task task = new Task();
		System.out.println("Enter Task Name");
		String taskName=sc.next();
		System.out.println("Enter task location");
		String location=sc.next();
		task.setTaskName(taskName);
		task.setLocation(location);
		em.persist(emp);
		em.persist(task);
		et.commit();
		
		
		
	
	}
}


 