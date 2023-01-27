package com.myjavapractice.arraylistYoutube;

import com.myjavapractice.array.Array;

public class BuildingArray {

	public static void main(String[] args) {
		Array numbers = new Array(5);

		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.print();
	}
}
