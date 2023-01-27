package com.myjavapractise.arrayex;

public class MatrixAdditionEx {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] m2 = { { 7, 8, 9 }, { 3, 5, 7 } };
		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
//		System.out.println(" ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(result[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}

}
