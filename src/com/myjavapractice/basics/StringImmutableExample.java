package com.myjavapractice.basics;

public class StringImmutableExample {

	public static void main(String[] args) {
		
		String s0 = "Chandu";
		String s1 = "Chandu";
		String s2 = "Chandu";
		String s3 = "Chandu";
		String s4 = "Chandu";
		
//		s4.concat("gk");
//		System.out.println(s4);
		
		String s5 = s4.concat("gk");
		System.out.println(s5);
	}
}
