package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O4_Remove_Duplicates_Element {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);
		List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Numbers: " + uniqueNumbers);
	}

}
