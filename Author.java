package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model1.Client;

public class Author {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		System.out.println("check your data base");
		EntityTransaction et=em.getTransaction();
		et.begin();
		Client client = new Client();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id");
		int id=sc.nextInt();
		System.out.println("Enter Your First Name");
		String First =sc.next();
		System.out.println("Enter Your Middle Name");
		String middle =sc.next();
		System.out.println("Enter Your LastName");
		String last =sc.next();
		System.out.println("Enter Your phone Number");
		long phone =sc.nextLong();
		
		client.setAuther_Id(id);
		client.setFirstName(First);
		client.setMiddleName(middle);
		client.setLastName(last);
		client.setPhoneNumber(phone);
		
	}

}
