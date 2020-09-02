package com.abc.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientLaunch1 {
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket csoc = new Socket("localhost",4000);
	OutputStream os = csoc.getOutputStream();
	DataOutputStream dos = new DataOutputStream(os);
	System.out.println("Enter the massage for server");
	//input for server
	Scanner sc = new Scanner(System.in);
	String msg = sc.nextLine();
	dos.writeUTF(msg);
	sc.close();
	csoc.close();
}
}
