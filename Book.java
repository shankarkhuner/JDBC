package queue1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Book implements Comparable<Book>{

	private int number;
	private String name, author,publisher;
	private int quantity;
	Book() {
		super();
	}
	public Book(int number, String name, String author, String publisher, int quantity) {
		super();
		this.number = number;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [number=" + number + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.getNumber()<o.getNumber()) {
			return 1;
			
		}
		return -1;
	}
	public static void main(String[] args) {
		Book book = new Book();
		Queue<Book> queue=new PriorityQueue();
		Scanner s= new Scanner(System.in);
		System.out.println("How many Books you want to add");
		int nos=s.nextInt();
		for(int i=0; i<nos; i++) {
			
			System.out.println("Enter Number");
			int number=s.nextInt();
			System.out.println("Enter name");
			String name=s.next();
			System.out.println("Enter author");
			String author=s.next();
			System.out.println("Enter publisher");
			String publisher=s.next();
			System.out.println("Enter quntity");
			int qty=s.nextInt();
			
			Book b = new Book(number, name,author, publisher,qty);
			queue.offer(b);
			System.out.println(b);	
		}
		System.out.println(queue.peek());
		for(Book book1: queue) {
			System.out.println(queue);
		}
	}
	

}
