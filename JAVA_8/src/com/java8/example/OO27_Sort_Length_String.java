package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OO27_Sort_Length_String {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple");
		List<String> sortedByLength = strings.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.collect(Collectors.toList());
		System.out.println("Sorted by length: " + sortedByLength);
	}

}
