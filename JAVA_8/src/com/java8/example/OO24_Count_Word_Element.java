package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OO24_Count_Word_Element {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "BB", "CC", "DD");
		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

	}
}
