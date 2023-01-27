package com.myjavapractice.java8;

public class Java8AdditionTestMain {

	public static void main(String[] args) {
		Java8Addition lambda = (x, y)-> System.out.println(x+y);
		lambda.add(5, 6);
	}

}
