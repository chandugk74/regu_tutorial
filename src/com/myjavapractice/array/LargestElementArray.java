package com.myjavapractice.array;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int arr[] = {36,58,75,12,15,36,96,99};
		int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			
			
			
		}
		
		System.out.println("Largest element present in given array:" +max);
		
		
		

	}

}
