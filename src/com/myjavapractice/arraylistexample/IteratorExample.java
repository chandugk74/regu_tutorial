package com.myjavapractice.arraylistexample;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
public void print(List<String> list) {
	Iterator iterator = list.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
