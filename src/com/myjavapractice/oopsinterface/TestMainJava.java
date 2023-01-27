package com.myjavapractice.oopsinterface;

public class TestMainJava {
	public static void main(String[] args) {
		Vevhicle v = new SmallCars();
		v.start();
		v.stop();
		v.print();
		System.out.println(Vevhicle.noOfWheels);
	}

}
