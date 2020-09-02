package com.abc.iojavaPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) throws IOException {
		String path="c:\\\\java\\\\program\\\\ioprg\\\\Program1.txt";
		FileWriter fw = new FileWriter(path);
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the name :");
		String name = scan.next();
		for(int i=0;i<name.length();i++) {
			fw.write(name.charAt(i)+"\n");
		}
		fw.flush(); System.out.println("String enter to file");
		fw.close();
		scan.close();
	}

}
