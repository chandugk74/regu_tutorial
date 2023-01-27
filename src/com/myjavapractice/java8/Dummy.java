package com.myjavapractice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dummy {

	public static int Seclar(Integer [] a) {
		List <Integer> ll = Arrays.asList(a);
		Collections.sort(ll);
		int total = ll.size();
		int result = ll.get(total-2);
		return result;
		
	}
	public static void main(String[] args) {
		Integer a[]= {11,222,333,144,55,254};
		System.out.println(Seclar(a));
		
			}

}
