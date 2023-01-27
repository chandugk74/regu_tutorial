package com.myjavapractice.oopsinterface;

public class TestMainJavaBanking {
	public static void main(String[] args) {
		Banking v = new AccountTypes();
		v.personal();
		v.business();
		v.loan();
		System.out.println("Banking.noOfAccountTypes");
	}
}
