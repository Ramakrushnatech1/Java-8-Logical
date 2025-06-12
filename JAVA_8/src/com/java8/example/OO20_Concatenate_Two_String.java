package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OO20_Concatenate_Two_String {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");

		Stream<String> concateStream = Stream.concat(list.stream(), list2.stream());
		concateStream.forEach(str -> System.out.print(str + " "));
	}
}
