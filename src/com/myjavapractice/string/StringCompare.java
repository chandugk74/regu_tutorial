package com.myjavapractice.string;

public class StringCompare {

	public boolean compareUsingDoubleEquals(String str1, String str2) {

		if (str1 == str2) {
			return true;
		} else {
			return false;
		}

	}

	public boolean compareUsingEquals(String str1, String str2) {

		if (str1.equals(str2)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean compareUsingCompareTo(String str1, String str2) {

		if (str1.compareTo(str2) == 0) {
			return true;
		} else {
			return false;

		}
	}
}