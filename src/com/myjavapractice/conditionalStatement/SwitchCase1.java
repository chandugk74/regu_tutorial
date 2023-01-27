package com.myjavapractice.conditionalStatement;

public class SwitchCase1 {
	public static void main(String args[]) {
		SwitchCase1 obj = new SwitchCase1();
			obj.FindTheCar("BMW");
	}
	private void FindTheCar(String string) {
		switch (string) {
		case "Audi": 
			System.out.println("Audi");
			break;
		case "Maruti": System.out.println("Maruti"); break;
		case "i20": System.out.println("i20"); break;
		case "BMW": System.out.println("BMW"); break;
		 default : System.out.println("car"); break;
		}
	}
	
}
