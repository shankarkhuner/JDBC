package Project1;

import java.util.ArrayList;

public class Praject2 {

	public static void main(String[] args) {
		ArrayList<Emp> al1 = new ArrayList<Emp>();
		al1.add(new Emp(101, "Radhika"));
		al1.add(new Emp(102, "Krishna"));
		ArrayList<Emp> al2 = new ArrayList<Emp>();
		al2.addAll(al1);
		al2.add(new Emp(103,"Hardy"));
		al2.add(new Emp(104,"Lara"));
		System.out.println(al2.size());
		for(Emp e:al2) {
			System.out.println(e.empid+" "+e.empName);
			
		}
		System.out.println("************");
		al2.remove(2);
		
		for(Emp e:al2) {
		System.out.println(e.empid+" "+e.empName);
		}
		System.out.println(al2.size());
		//what are different approaches to extract the data from the collection.
		//1).for each loop 
		//2).get() method.
	
		//Normal collection
		//ArrayList a1 = new ArrayList();
		//Generic Collection
		//ArrayList<Emp> s1 =new ArrayList<Emp>();
		//*************************
		//2).get() method.
//		Emp e1 = al2.get(0);
//		System.out.println(e1.empid+" "+e1.empName);
//		//Emp s1 = al2.get(0);
//		//System.out.println(s1.empName+" "+s1.empId);
//		
//		//***********************
//		for(Emp ee:al2) {
//			System.out.println(ee.empid+" "+ee.empName);
		}
	}

