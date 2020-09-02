package com.abc.iojavaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class AssignmentBufferedReaderAndWriterQuestion1 {
	public static void main(String[] args) throws IOException {
		//reading the data from the file and String in TreeSet
		BufferedReader br = new BufferedReader(new FileReader("c:\\java\\program\\phno.txt"));
       TreeSet<String> ts  = new TreeSet<String>();
      String x;
      while((x=br.readLine())!=null) {
    	  ts.add(x);
      }
      //write the data into the file present in the TreeSet
      BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\java\\program\\phno.txt"));
	for(String temp:ts) {
		bw.write(temp);
		bw.newLine();
	}
    //close objects
	br.close();
	bw.flush();  System.out.println("numbers are Sorted in the phno.txt file");
      bw.close();
	}


}
