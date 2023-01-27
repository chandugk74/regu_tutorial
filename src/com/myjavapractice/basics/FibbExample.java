package com.myjavapractice.basics;

import java.util.Scanner;

public class FibbExample {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21
		Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
		System.out.println(fib(i));
	}

	static int fib(int i) {
	if (i == 0||i==1) {
		return i; }
		return	fib(i-1)+fib(i-2);
}
}
