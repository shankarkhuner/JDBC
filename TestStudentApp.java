package controller;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model1.Address;
import model1.Course;
import model1.Student;

public class TestStudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setPhoneNumber(91121L);
		s1.setStudentName("Karan");
		Address address = new Address();
		address.setcity("Pune");
		address.setPincode(4578);
		address.setStreetName("ABC");
		s1.setAddress(address);
		
		Course c1 = new Course();
		c1.setCourseName("Java Fullstack");
		c1.setCoursePrice(10000);
		c1.setDuration(50);
		c1.setStudent(s1);
		
		
		Course c2 = new Course();
		c2.setCourseName("React");
		c2.setCoursePrice(17000);
		c2.setDuration(35);
		c2.setStudent(s1);
		Set<Course> set=s1.getCourses();
		
		set.add(c1);
		set.add(c2);
		
		s1.setCourses(set);
		em.persist(s1);
		em.getTransaction().commit();
		

		/*Address address = new Address();
		address.setSity("pune");
		address.setPincode(431514);
		address.setStreetName("xyz");
		
		
		Student stud = new Student();
		stud.setStudentName("A");
		stud.setPhoneNumber(8888158801L);
		stud.setAddress(address);
		*/
		
		//Fetch student details from table using student roll number
		/*Student stud = new Student();
		stud.getAddress().setcity("Nanded");
		em.persist(stud);
		System.out.println(stud);*/
	}

}
