package com.myjavapractice.arraylistexample;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorPreviousExample {
	public void print(List<String> list) {
		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			listIterator.next();
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
