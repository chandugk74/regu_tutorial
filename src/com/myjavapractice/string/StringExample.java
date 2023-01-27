package com.myjavapractice.string;

public class StringExample {
	public static void main (String[] args) {
		
		StringCompare obj = new StringCompare();
		
		String Str1 = "hi";
		String Str2 = new String ("hi");
		
		boolean res = obj.compareUsingDoubleEquals(Str1,Str2);
		System.out.println(res);
		
		boolean res1 = obj.compareUsingEquals(Str1,Str2);
		System.out.println(res1);
		
		boolean res2 = obj.compareUsingCompareTo(Str1,Str2);
		System.out.println(res2);
		
		boolean res3 = obj.compareUsingDoubleEquals("hi","hi1");
		System.out.println(res3);
	}

}
