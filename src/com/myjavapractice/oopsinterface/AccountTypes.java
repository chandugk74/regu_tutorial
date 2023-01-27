package com.myjavapractice.oopsinterface;

public class AccountTypes implements Banking {

	public void business() {

		System.out.println("business type");
	}

	public void personal() {
		System.out.println("personal type");
	}

	public void loan() {
		System.out.println("loan type");
	}
}
