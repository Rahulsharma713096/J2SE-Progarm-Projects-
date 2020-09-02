package com.Grooming.Assignment;

import java.util.Scanner;

public class A1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
  System.out.println("Enter The String");
  String s=sc.nextLine();
  char[] ch = s.toCharArray();
  for(int i=1;i<ch.length;i++) { int b =(int)s.charAt(i); b=b-48;System.out.println();
	  if(b>=1 && b<=9) {
		for(int a=b;a>0;a--) System.out.print(ch[i-1]);  
	  }
	  
  }
  
  sc.close();
}
}
