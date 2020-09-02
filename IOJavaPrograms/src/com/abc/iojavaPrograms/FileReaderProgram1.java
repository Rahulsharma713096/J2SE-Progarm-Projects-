package com.abc.iojavaPrograms;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram1 {

	public static void main(String[] args) throws IOException {
		String path="c:\\\\java\\\\program\\\\ioprg\\\\output.txt";
		FileReader fr = new FileReader(path);
		FileReader fr1 = new FileReader(path);
//read()- it reads char by char and returns UTF form
		System.out.println("Reads char by char and retuns UTF form");
		int x = fr.read();
		System.out.println(x);
		System.out.println((char)x);
//read(char[])-  returns number of character data read ,char[] will store UTF of character returned
		System.out.println("read(char[])");
		char[] c=new char[15];
		int r = fr1.read(c);
		System.out.println(c);
		System.out.println(r);
		fr.close();
		fr1.close();
	}

}
