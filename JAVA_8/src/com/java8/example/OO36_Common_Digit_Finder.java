package com.java8.example;

public class OO36_Common_Digit_Finder {
	
	public static void main(String[] args) {

		int[][] array1 = {
				{ 1, 2, 3, 1 },
				{ 4, 5, 6, 4 },
				{ 7, 8, 9, 7 },
				{ 1, 4, 7, 1 }
		};

		int[][] array2 = { 
				{ 1, 12, 13, 1 },
				{ 4, 15, 16, 4 },
				{ 7, 18, 19, 7 },
				{ 1, 14, 17, 1 } 
		};

		int rows = array1.length;
		int cols = array1[0].length;

		int[][] resultArray = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (array1[i][j] == array2[i][j]) {
					resultArray[i][j] = array1[i][j];
				} else {
					resultArray[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (resultArray[i][j] != -1) {
					System.out.print(resultArray[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
