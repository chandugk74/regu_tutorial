package com.myjavapractice.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Bangalore");
		list.add("Mysore");
		list.add("Kadur");

		ListIterator<String> listIterator = list.listIterator();
		String i = "";
		while (listIterator.hasNext()) {
			i = i + listIterator.next();
		}
		System.out.println(i);
	}
}
