package com.abc.iojavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentBufferedReaderAndWriterQuestion4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\java\\program\\output3.txt"));

		//Taking integer value from user and storing in file
		System.out.println("Enter the integer value and when done enter exit :");
		while(sc.hasNextInt()) {
			bw.write(sc.nextInt()+"");
			bw.newLine();
		}
	bw.flush();
	bw.close();
	System.out.println("End of Input process");
	sc.close();
	}

}
