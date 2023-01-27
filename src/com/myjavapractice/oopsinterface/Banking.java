package com.myjavapractice.oopsinterface;

public interface Banking {
	int noOfAccountTypes = 3;

	void personal();

	void business();

	void loan();

	default void print() {
		System.out.println("print");
	}
}
