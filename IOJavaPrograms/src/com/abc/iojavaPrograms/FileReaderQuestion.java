package com.abc.iojavaPrograms;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderQuestion {
	public static void main(String[] args) throws IOException {
		String path="c:\\\\java\\\\program\\\\ioprg\\\\output.txt";
		FileReader fr = new FileReader(path);
		//reading the first Character from file
		int x=fr.read();
		while(x!=-1) {
			System.out.print((char)x);
			x=fr.read();
		}
		fr.close();
	}

}
