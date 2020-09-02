package com.abc.iojavaPrograms;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProg {

	public static void main(String[] args) throws IOException {
	 String path="c:\\\\java\\\\program\\\\ioprg\\\\demo.txt";
		FileWriter fw = new FileWriter(path);   //this type when you execute prog override data in file
 // write Data in Demo file
		fw.write("hello rhaul");
		System.out.println("data written complete");
		fw.flush();
		fw.close();
		//this type when you execute code not  override data in file
		String path1="c:\\\\java\\\\program\\\\ioprg\\\\output.txt";
		FileWriter fw1 = new FileWriter(path1,true);   //this type when you execute prog overde data in file
 // write Data in Demo file
		fw1.write("hello rhaul \n");
		System.out.println("data written complete not overrride on file");
		fw1.flush();
		fw1.close();
	}

}
