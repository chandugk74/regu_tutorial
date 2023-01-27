package com.myjavapractice.arraylistexample;

import java.util.List;

public class WhileLoopExample {
	public static void print(List<String> list) {
		int i = 0;
		while (i < list.size()) {
			i++;
			System.out.println(list.get(i));
		}

	}
}
