package com.myjavapractice.array;

import java.util.Arrays;

public class SmallastArray {
	public static int getSmallest(int[] a) {
		Arrays.sort(a);
		return a[0];
	}

	public static int getLargestnfkjdsnfsd(int[] a) {
		Arrays.sort(a);
		return a[a.length - 1];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Smallest: " + getSmallest(a));
		System.out.println("Smallest: " + getSmallest(b));
		System.out.println("Biggest: " + getLargestnfkjdsnfsd(a));
		System.out.println("Biggest: " + getLargestnfkjdsnfsd(b));
	}

}
