package com.abc.iojavaPrograms;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFolderinPath {
	public static void main(String[] args) throws IOException  {
		//create folder
		File f = new File("c:\\java\\program\\ioprg");
		System.out.println(f.mkdir());
		//	create file
		File f1 = new File("c:\\java\\program\\ioprg\\demo.txt");
		System.out.println(f1.createNewFile());
	}

}
