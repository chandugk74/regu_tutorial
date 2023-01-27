package com.myjavapractice.arrayGeeks;

public class KeyPresent {

	public static void main(String[] args) {
		int[] userinput = { 1, 4, 5, 8, 9, 3, 7, 26, 48 };
		int specificvalue = 26;
////		KeyPresent.getKeyPresent(userinput, specificvalue);
//	}
//
////	public static void getKeyPresent(int[] userinput, int specificvalue) {
//		int[] input = userinput;
//		int element = specificvalue;
		for (int i = 0; i < userinput.length; i++) {
			if (userinput[i] == specificvalue) {
				System.out.println("yes");
			}
		}
	}

}
