package com.java8.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OO13_Merge_Remove_duplicate_Array {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 8, 1 };
		int[] array2 = { 7, 3, 6, 4, 1, 5 };
		int[] sortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().sorted()
				.toArray();
		System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
	}

}
