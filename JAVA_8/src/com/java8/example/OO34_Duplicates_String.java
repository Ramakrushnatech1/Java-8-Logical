package com.java8.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OO34_Duplicates_String {

	public static void main(String[] args) {
		String str = "iFollowMilindMehta";
		Map<Character, Long> duplicates = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(duplicates.keySet());
	}
}
