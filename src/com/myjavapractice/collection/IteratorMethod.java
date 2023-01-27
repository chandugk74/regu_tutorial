package com.myjavapractice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Bangalore");
		list.add("Mysore");
		list.add("Kadur");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}

}
