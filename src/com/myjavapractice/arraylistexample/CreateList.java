package com.myjavapractice.arraylistexample;


import java.util.ArrayList;
import java.util.List;

public class CreateList {
	public List <String> getList(String int1, String int2, String int3, String int4) {
		List<String> templist = new ArrayList<>();
		templist.add(int1);
		templist.add(int2);
		templist.add(int3);
		templist.add(int4);
		return templist;
		}
}