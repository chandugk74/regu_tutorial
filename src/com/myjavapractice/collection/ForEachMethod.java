package com.myjavapractice.collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		ForEachMethod obj = new ForEachMethod();
		List<String> list = new ArrayList<>();
		list.add("Bangalore");
		list.add("Mysore");
		list.add("Kadur");
		obj.getElementsByForEach(list);
	}

	public void getElementsByForEach(List<String> list) {
		for (String data : list) {
			System.out.println(data);
		}
	}
}