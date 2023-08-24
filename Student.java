package model1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Student_Table")
public class Student {
	@Id
	@SequenceGenerator(name = "roll_gen", initialValue = 1000,allocationSize = 5)
	@GeneratedValue(generator="roll_gen",strategy=GenerationType.SEQUENCE)
	
	@Column(name = "stud_roll")
	private int studentRoll;
	@Column(name = "stud_name")
	private String studentName;
	@Column(name ="stud_phone", unique = true)
	private long phoneNumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="stud_address")
	private Address Address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Course> courses=new HashSet();
	
	
	
	
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	
	
}
