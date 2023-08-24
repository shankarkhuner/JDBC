package model1;

import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity


@Table(name = "Author_Table")

public class Client {
	@Id //Id is use to make a property as a  primary key property
	@Column(name="autherid")
	private int auther_Id;
	@Column(name="first_name",nullable=false)
	private String firstName;
	@Column(name="middle_Name")
	private String middleName;
	@Column(name="last_Name")
	private String lastName;
	@Column(name="PhoneNumber",unique = true)
	private long phoneNumber;
	public int getAuther_Id() {
		return auther_Id;
	}
	public void setAuther_Id(int auther_Id) {
		this.auther_Id = auther_Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
		
	
	

}
