package com.abc.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.abc.Customer.Customer;

public class DLaunch {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("c:\\java\\program\\input.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	while(fis.available()!=0) {
	Customer c=	(Customer)ois.readObject();
	System.out.println(c.getName());
	System.out.println(c.getCrn());
	System.out.println(c.getBalance());
	}
	ois.close();
	}
}
