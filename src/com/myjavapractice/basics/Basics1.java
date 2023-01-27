package com.myjavapractice.basics;

import java.util.HashMap;
import java.util.Map;
//import com.myjavapractise.hashmap.HashSet;

public class Basics1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "chandu");
		map.put(3, "nalina");
		
		for (Map.Entry<Integer, String> item: map.entrySet()) {
			System.out.println(item.getKey() + " " + item.getValue());
		}
		if (map.containsKey(2)) {
			System.out.println("Key is Exist");
		} else {
			System.out.println("Key ! Exist"); 
		}
	}
}

