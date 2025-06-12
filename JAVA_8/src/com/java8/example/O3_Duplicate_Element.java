package com.java8.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class O3_Duplicate_Element {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> s = new HashSet<>();
		list.stream().filter(n -> !s.add(n)).forEach(System.out::println);
	}
}
