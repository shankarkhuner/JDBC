package jdbc;
import java.io.Serializable;
public class Account implements Serializable {
	private int pincode;
	// If you do nt wont to serialize a particular property of the class then you can use
	//Either transient or static keyword
	
	//transient is the non Access modifier which prevent a field from serialization process.
	private String accountHolderName;
	private long accountNumber;
	private String accountType;
	//public Account(int pincode, String accountHolderName,long accountNumber,String accountType) {
	//	super();
	//}
	public int getPincode() {
		return pincode;
	}
	public Account(int pincode, String accountHolderName, long accountNumber, String accountType) {
		super();
		this.pincode = pincode;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}

	

	
}
