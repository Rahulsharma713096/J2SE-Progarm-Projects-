package com.Grooming.Assignment;

public class A2 {
public static void main(String[] args) {
	String s="ABC for Tech";
	System.out.println(s+"\n ----------------------------------------");
	String[] s1 = s.split(" ");
	for(String s2:s1) {
		System.out.println(s2);
	}
	System.out.println("----------------------------------------------");
	for(String s3:s1) {
		for(int i=s3.length()-1;i>=0;i--) {
			System.out.print(s3.charAt(i));
		}
		System.out.print(" ");
	}
	System.out.println("\n---------------------------------------------------");
	for(int i=s1.length-1;i>=0;i--) {
		System.out.print(s1[i]);
	}
	System.out.println("\n---------------------------------------------------");
	for(String s2:s1) {
		System.out.print(s2);
		System.out.print(s2.length()+" ");
	}
	System.out.println("\n---------------------------------------------------");
	for(int i=s1.length-1;i>=0;i--) {
		System.out.print(s1[i]);
		System.out.print(s1[i].length()+" ");
	}
	System.out.println("\n---------------------------------------------------");
}
}
