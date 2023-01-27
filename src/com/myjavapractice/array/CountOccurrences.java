package com.myjavapractice.array;

import java.util.HashMap;

public class CountOccurrences {
	static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");
		for (String tempString : s) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}

		for (String key : hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
	}

	public static void main(String args[]) {
		findDuplicateWord("my name is is chandu chandrashekara");

	}
}
