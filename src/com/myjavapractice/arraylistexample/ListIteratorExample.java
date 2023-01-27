package com.myjavapractice.arraylistexample;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public void print(List<String> list) {
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

	}
}
