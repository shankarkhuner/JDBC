package jdbc;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileOutputStream output = new FileOutputStream("D://account-details.txt");
		ObjectOutputStream objOutput=new ObjectOutputStream(output);
		Account acn=new Account(123,"ABC",54545L, "saving");
		objOutput.writeObject(acn);
		//output.close();
		//objOutput.close();
		FileInputStream input = new FileInputStream("D://account-details.txt");
		ObjectInputStream objInput = new ObjectInputStream(input);
		Account acn1 = (Account)objInput.readObject();
		System.out.println(acn1.getAccountHolderName()+ " "+acn1.getPincode());
		input.close();
		objInput.close();
		
	}

}
