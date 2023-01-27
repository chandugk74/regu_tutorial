package com.myjavapractice.oopsinterface;

public interface Vevhicle {

	int noOfWheels=4;
	void start();
	public abstract void stop();
	default void print() {
		System.out.println("print");
	}
}
