package com.myjavapractise.arrayex;

public class AverageMarksEx {

	public static void main(String[] args) {

		int [] marks = {4,56,2,88,79,65};
		int sum=0;
		int l= marks.length;
		for(int element:marks) {
			sum=sum+element;
		}
		System.out.println(sum/l);

	}

}
