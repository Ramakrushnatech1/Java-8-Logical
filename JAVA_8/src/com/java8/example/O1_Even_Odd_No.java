package com.java8.example;

import java.util.Arrays;
import java.util.List;

public class O1_Even_Odd_No {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		// even
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println();// odd
		list.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

	}
}
