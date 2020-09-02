package com.abc.Customer;

import java.io.Serializable;

public class Customer implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
private int crn;
private double balance;
//Create constructor
public Customer(String name, int crn, double balance) {
	super();
	this.name = name;
	this.crn = crn;
	this.balance = balance;
}
//Setter and getter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCrn() {
	return crn;
}
public void setCrn(int crn) {
	this.crn = crn;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
