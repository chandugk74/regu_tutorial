package com.myjavapractise.arrayex;

public class AdditionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] marks = { 1.0f, 2.04f, 3.05f, 5.14f, 3.078f };
		float sum=0;
		for(float element: marks) {
			sum = sum+element;
		}
		System.out.println(sum);
		

	}

}
