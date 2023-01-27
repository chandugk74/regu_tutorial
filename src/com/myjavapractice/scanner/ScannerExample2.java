package com.myjavapractice.scanner;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			String str1 = sc.next();

			System.out.println(str + " " + str1);
		} catch (Exception ex) {

			System.out.println("Please enter String only");
		}
	}
}
