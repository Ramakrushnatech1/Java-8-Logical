package com.java8.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OO25_Count_Character_String {
	public static void main(String[] args) {
		String list = "string data to count each character";
		Map<String, Long> count = Arrays.stream(list.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);
	}
}
