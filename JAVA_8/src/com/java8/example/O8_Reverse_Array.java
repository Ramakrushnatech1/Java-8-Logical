package com.java8.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class O8_Reverse_Array {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] reversedArray = IntStream.range(0, array.length).map(i -> array[array.length - 1 - i]).toArray();
		System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	}

}
