package com.java8.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OO28_Reverse_String {
	public static void main(String[] args) {
		String input = "hello world";
		String reversedWords = Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println("Reversed words: " + reversedWords);
	}

}
