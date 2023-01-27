package com.myjavapractice.array;

public class ArrayExample {

	public static void main(String[] args) {
		
//		Single Value Containers
		int State1PopulationCount = 520;
		int State2PopulationCount=689;
		int State3PopulationCount=454;
		int State4PopulationCount=478;
		int State5PopulationCount=123;
		
//		multi value container
		int[] CountryPopulation = new int[5]; //all elements will be default zero
//		int[] CountryPopulation1 = {520, 689, 454, 478, 123}; //elements have some value
		
		
		System.out.println(CountryPopulation);
		
//		Read the element in array
//		1.read by single element
//		System.out.println("CountryPopulation [0] "+CountryPopulation[0]);
//		System.out.println("CountryPopulation [1] "+CountryPopulation[1]);
//		2.Read all
//		for (int i =0; i<CountryPopulation.length; i++) {
//			System.out.println("CountryPopulation ["+i+"] is :"+ CountryPopulation[i]);
//			
//			Write/update element
//			CountryPopulation1[0] =520;
//			CountryPopulation1[1]=689;
//			CountryPopulation1[2]=454;
//			CountryPopulation1[3]=478;
//			CountryPopulation1[4]=123;
//			System.out.println("**************rereading after write operation****************");
//			
			for (int i=0; i<CountryPopulation.length; i++) {
				System.out.println("country population ["+i+"] is:" + CountryPopulation[i]);
//						}
		}
}
}
