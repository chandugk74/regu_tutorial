package com.myjavapractice.loopingstatement;

public class LoopingStatment {

	public static void main(String[] args) {
		int i =10;
		LoopingStatment obj = new LoopingStatment();
		obj.testForLoop(i);
	}
	public void testForLoop(int input) {
		
		for(int i=0; i<input; i++) {
			System.out.println(i);
		}
	}
}

