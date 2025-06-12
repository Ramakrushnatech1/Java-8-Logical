package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class O5_Frequency_Each_Element {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		Map<Integer, Long> frequencyMap = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		frequencyMap.forEach((element, frequency) -> System.out.println(element + ": " + frequency));
	}

}
