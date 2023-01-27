package com.myjavapractice.oopsabstract;

public class TestMain {
/**
 * 
 * @param args
 */
	public static void main(String args[]) {
		WindowsServer server = new WindowsServer();
		server.start();
		server.stop();
		server.storage();
		System.out.println(server.name);
	}
}
