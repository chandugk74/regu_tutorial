package com.myjavapractice.basics;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		int temp;
		int a[] = {25,12,45,18,15,46};
		System.out.println("Before sort:");
		for(int num:a) {
			System.out.println(num);
			
		}
		for(int i=0;i<=a.length-1;i++) {
		for(int j = 0;j<=a.length-2;j++) {
			if(a[j]<a[j+1]) {
				
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
				
				
			}
		}
		}
		
		System.out.println("After sort:");
		for(int num:a)
		{
			System.out.println(num);
		}
		
	}
}
