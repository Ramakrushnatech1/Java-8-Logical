package com.java8.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OO26_Duplicate_Word_Count {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "BB");
		Map<String, Long> map = list.stream().filter(s -> Collections.frequency(list, s) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}
