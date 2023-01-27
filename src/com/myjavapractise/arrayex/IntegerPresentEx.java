package com.myjavapractise.arrayex;

public class IntegerPresentEx {

	public static void main(String[] args) {
		int[] marks = { 2, 4, 5, 6, 78 };
		int num = 4;
		boolean isInArray = false;
		for(int element: marks) {
			if(num==element) {
				isInArray = true;
				break;
			}
			
		}
if(isInArray) {
	System.out.println("The value is present");}

else {
	System.out.println("The value is absent");
	
}
	
}
	}
