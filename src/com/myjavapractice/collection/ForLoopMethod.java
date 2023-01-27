package com.myjavapractice.collection;

import java.util.ArrayList;
import java.util.List;

public class ForLoopMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Bangalore");
		list.add("Mysore");
		list.add("Kadur");

//		for (String item : list) {
//			}
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
					}
		//System.out.println(list);
		//System.out.println(add); //How to type individually?
	}
}