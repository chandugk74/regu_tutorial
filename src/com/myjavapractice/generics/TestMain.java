package com.myjavapractice.generics;

public class TestMain {

	public static void main(String[] args) {
		GenericsExample <Integer> genericsExample=new GenericsExample<>();
	genericsExample.set(5);
	genericsExample.get();
	
	System.out.println(genericsExample.get());
	GenericsExample<String> genericsExample2 = new GenericsExample<>();
	genericsExample2.set("chandru");
			genericsExample2.get();
			System.out.println(genericsExample2.get());
			
//			GenericsExample<String, Integer> genericsExample3 = new TestMain();
	}

}
