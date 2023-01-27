package com.myjavapractice.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[]) {
		// ArrayList<String> list = new ArrayList<String>();
		// ArrayList list = new ArrayList<>();
		// List<String> list1 = new ArraysList<String>();
		// List<String> list = new ArrayList<>(); // only left side insertion; java 1.7
		// diamond operator
		ArrayListExample arrayListExample = new ArrayListExample();
		List<String> list = arrayListExample.createListWithInputs("Bangalore", "Mysore", "Kadur", "fref");
		//List<String> list = arrayListExample.createListWithInputs("x1", "y2", "z3", "Fa4");
		//List<String> anotherList = arrayListExample.createListWithInputs("x61", "y62", "z3", "Fa4");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

//		String x = "";
//		for (String item : list) {
//			x = x + item;
//		}
//		System.out.println(x);
	}

	public List<String> createListWithInputs(String in1, String in2, String in3, String in4) {
		List<String> list = new ArrayList<>();
		list.add(in1);
		list.add(in2);
		list.add(in3);
		list.add(in4);
		return list;
	}

}
