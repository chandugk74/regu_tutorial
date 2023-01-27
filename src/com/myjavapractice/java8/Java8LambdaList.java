package com.myjavapractice.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8LambdaList {

	public static void main(String[] args) {
		List<String> javalist = new ArrayList<>();
		javalist.add("chandu");
		javalist.add("chandu");
		javalist.add("chandu");
		
		javalist.forEach (a-> System.out.println(a));


	}

}
