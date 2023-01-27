package com.myjavapractice.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(10,25,24,15,64,18);
	List<Integer> evenNumbers = new ArrayList<Integer>();
	
		evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		
	System.out.println(evenNumbers);	
		
	}
	
	
	
	

}
