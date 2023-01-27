package com.myjavapractice.basics;

import java.util.Scanner;

public class Addition {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
	
		System.out.println("sum is" + Cal.sum(x, y));
		System.out.println("sum is" + Cal.sum(x, y, z));
		} catch (Exception ex) {
			System.out.println("Please enter integer only");
}
	}
	

}
