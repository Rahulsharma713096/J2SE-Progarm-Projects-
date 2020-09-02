package com.abc.iojavaPrograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentFileReaderProg {

	public static void main(String[] args) throws IOException {
		String path="c:\\\\java\\\\program\\\\ioprg\\\\output.txt";
		String path1="c:\\\\java\\\\program\\\\ioprg\\\\output1.txt";
		FileReader fr = new FileReader(path);
		FileWriter fw = new FileWriter(path1);
// Reading the data from one file
		System.out.println("Data Reading Starts");
		int i=fr.read();
		while(i!=-1) {
			fw.write((char)i);
			System.out.println((char)i +"---->Data Writing"); 
			i=fr.read();
			fw.flush();
		}
		System.out.println("Data completes writing");
fr.close();
fw.close();
}
}