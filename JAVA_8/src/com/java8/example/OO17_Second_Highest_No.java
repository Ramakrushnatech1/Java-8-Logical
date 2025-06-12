package com.java8.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OO17_Second_Highest_No {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 45, 56, 87, 10);
		int secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighest);

		List<Integer> list1 = Arrays.asList(23, 45, 56, 87, 10, 87);
		int removeDuplicateSecondHighest = list1.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1)
				.findFirst().get();
		System.out.println(removeDuplicateSecondHighest);
	}
}
