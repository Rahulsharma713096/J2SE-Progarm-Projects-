package com.abc.iojavaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderAndWriterProg {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\java\\program\\input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\java\\program\\output.txt"));
		String x;
		while((x=br.readLine())!=null) {
			bw.write(x);
			bw.newLine();
		}
        br.close();
        bw.flush(); System.out.println("data copied from input.txt file to output.txt");
        bw.close();
	}

}
