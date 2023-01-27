package com.myjavapractice.exception;

public class ExceptionExample {
	public int multiply (int input1, int input2){
	int response=0;
	try {
	response=input1*input2;
	}
	catch (ArithmeticException ex) {
		ex.printStackTrace();
	}
	System.out.println("response :" + response);
	return response;
	
}
}
