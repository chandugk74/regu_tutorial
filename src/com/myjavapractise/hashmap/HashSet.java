package com.myjavapractise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSet {

	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "chandu");
		map.put("address", "bangalore");
		map.put("place", "village");
		map.put("home", "my home");

//	Set<Map.Entry<String, String>> set = map.entrySet();
//	for(Entry<String, String> data:set){
//		
//		System.out.println(data.getKey() + " " + data.getValue());
	//}
	map.forEach((key, value) -> System.out.println(key+" "+ value));
}}