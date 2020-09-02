package com.abc.iojavaPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignmentprog2 {
	public static void main(String[] args) throws IOException {
		String path1="c:\\\\java\\\\program\\\\ioprg\\\\AssigProgram2Name.txt";
		String path2="c:\\\\java\\\\program\\\\ioprg\\\\AssigProgram2PhoneNumber.txt";
		FileWriter fw1 = new FileWriter(path1);
		FileWriter fw2 = new FileWriter(path2);
		Scanner scan = new Scanner(System.in);
	//input to takes n names
		System.out.println("Enter the name=phone number and when done enter exit:");
	
		while(true) {
		String name = scan.nextLine();
		if(name.equalsIgnoreCase("exit")) break;
		else {
			try{String[] sp = name.split("=");
			fw2.write(sp[1]+"\n");  //try catch for this line when ArrayIndexOutOfBoundsException occurs and first insertion of phone number because by mistake user forget to write = sign
			fw1.write(sp[0]+"\n");}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Please enter the format of name=phone number like 'ram=123'");
			}
		}
	}
		
		fw1.flush(); System.out.println("Names entered in 'AssigProgram2Name.txt' file");
		fw1.close();
		fw2.flush(); System.out.println("Phone Numbers  entered in 'AssigProgram2PhoneNumber.txt' file");
		fw2.close();
		scan.close();
	}

}
