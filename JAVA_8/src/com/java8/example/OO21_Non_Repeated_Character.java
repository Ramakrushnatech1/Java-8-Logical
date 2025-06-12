package com.java8.example;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OO21_Non_Repeated_Character {
	public static void main(String[] args) {
		String input = "Java articles are Awesome";

		Character ch = input.chars()
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();
				System.out.println(ch);
	}
}
