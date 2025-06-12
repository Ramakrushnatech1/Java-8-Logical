package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OO23_UpperCase_Map {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC");
		List<String> result = list.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(result);

		List<String> list2 = Arrays.asList("aa", "bb", "cc");
		List<String> result2 = list2.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result2);
	}
}
