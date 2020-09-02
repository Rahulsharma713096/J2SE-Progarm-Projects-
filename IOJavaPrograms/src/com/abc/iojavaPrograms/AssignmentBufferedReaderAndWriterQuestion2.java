package com.abc.iojavaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentBufferedReaderAndWriterQuestion2 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("c:\\java\\program\\input1.txt"));
	BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:\\java\\program\\output1.txt"));
	BufferedWriter bw2 = new BufferedWriter(new FileWriter("c:\\java\\program\\output2.txt"));
	String x;
	while((x=br.readLine())!=null) {
		bw1.write(x.toUpperCase()); bw1.newLine();
		bw2.write(x.toLowerCase()); bw2.newLine();
	}
	br.close();
	bw1.flush(); System.out.println("Data Written completed in output1.txt");
	bw1.close();
	bw2.flush(); System.out.println("Data Written completed in output2.txt");
	bw2.close();
}
}
