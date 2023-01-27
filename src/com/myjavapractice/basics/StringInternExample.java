package com.myjavapractice.basics;

public class StringInternExample {

	public static void main(String[] args) {
		String s = "Chandu";
		String st = new String ("Chandu");
//		String st = new String ("Chandu").intern();
		
		System.out.println(s == st);
	}

}
