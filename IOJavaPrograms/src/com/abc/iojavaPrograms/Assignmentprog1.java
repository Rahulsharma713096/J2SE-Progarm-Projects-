package com.abc.iojavaPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignmentprog1 {
	public static void main(String[] args) throws IOException {
		String path="c:\\\\java\\\\program\\\\ioprg\\\\AssigProgram1.txt";
		FileWriter fw = new FileWriter(path);
		Scanner scan = new Scanner(System.in);
	//input to takes n names
		System.out.println("Enter the name and when done enter exit:");
	
		while(true) {
		String name = scan.next();
		if(name.equalsIgnoreCase("exit")) break;
		else fw.write(name+"\n");
	}
		
		fw.flush(); System.out.println("String enter to file");
		fw.close();
		scan.close();
	}

}
