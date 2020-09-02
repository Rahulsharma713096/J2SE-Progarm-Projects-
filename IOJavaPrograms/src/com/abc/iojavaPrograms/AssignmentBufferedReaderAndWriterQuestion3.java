package com.abc.iojavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AssignmentBufferedReaderAndWriterQuestion3 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("c:\\java\\program\\input1.txt"));
	int count=0;
	//loop to count number of lines in file
	while(br.readLine()!=null) {
		count++;
	}
		System.out.println("The number of line present in file is:"+count);
		
		br.close();
}
}
