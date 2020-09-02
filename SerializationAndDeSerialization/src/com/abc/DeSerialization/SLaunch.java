package com.abc.DeSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.abc.Customer.Customer;

public class SLaunch {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\java\\program\\input.txt"));
		//take Number of customer or length of input loop
		System.out.println("Enter the number of customer:");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	//Input for custoimer Details
	System.out.println("Enter the customer details: name, crn, balance ");
     for(int i=0;i<n;i++) {
    	 Customer c = new Customer(scan.next(),scan.nextInt(),scan.nextDouble());
    	 oos.writeObject(c);    	 
     }
     scan.close();
     oos.close();
	}

}
