package com.myjavapractice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementsFromArray {

	public static void main(String[] args) {
		AddElementsFromArray obj = new AddElementsFromArray();
		List<String> list = obj.addElements("Chennai", "Bangalore", "Mumbai", "Pune");
		obj.getElements(list);
	}
	public List<String> addElements(String input1, String input2, String input3, String input4) {
		List<String> list = new ArrayList<>();
		list.add(input1);
		list.add(input2);
		list.add(input3);
		list.add(input4);
		return list;
	}
	public List<String> addElements1(String...data) {
		List<String> list = Arrays.asList(data);
		return list;
	}
	public void getElements(List<String> list) {
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}
}
