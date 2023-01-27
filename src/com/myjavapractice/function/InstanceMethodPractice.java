package com.myjavapractice.function;

public class InstanceMethodPractice {

	public static void main(String[] args) {
		InstanceMethodPractice obj = new InstanceMethodPractice();
		int response = obj.add(10, 20);
		System.out.println(response);
	}

	private int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	}

	
