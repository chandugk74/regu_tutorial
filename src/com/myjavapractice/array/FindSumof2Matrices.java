package com.myjavapractice.array;

import java.util.HashSet;
import java.util.Set;

public class FindSumof2Matrices {
	static int arr[] = { 1, 5, 7, 9, 6, 3, 7, 2, 4 };

	public static void main(String[] args) {
		int n = arr.length;
		int sum = 8;
		printPairWithOn(sum);
	}

	// O(n) square
	public static void printPairs(int n, int k) {
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println("print pair is (" + arr[i] + " , " + arr[j] + ")");
				}
			}
	}

	public static void printPairWithOn(int sum) {
		Set<Integer> set = new HashSet<>();

		for (int item : arr) {
			if (set.contains(sum - item)) {
				System.out.println("print pair is (" + item + " , " + (sum - item) + ")");
			}
			set.add(item);
		}
	}

}
