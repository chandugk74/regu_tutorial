package com.myjavapractice.basics;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(fact(i));
	}
	static int fact(int i) {
		if (i == 1) {
			return 1;
		}
		return (i * fact(i-1));
		
	}
}