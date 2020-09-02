package com.abc.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerLaunch1 {
public static void main(String[] args) throws IOException {
	ServerSocket listner = new ServerSocket(4000);
	System.out.println("Server is ready to accept request");
	Socket sooc = listner.accept();
	InputStream is = sooc.getInputStream();
	DataInputStream dis = new DataInputStream(is);
	System.out.println(dis.readUTF());
	listner.close();
}
}
