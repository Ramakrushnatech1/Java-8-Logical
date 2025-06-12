package com.java8.example;

import java.util.Arrays;

public class OO35_Longest_String {
	
	public static void main(String[] args) {
		String[] input = { "Milind", "Mehta", "follow", "java8", "Microservice", "Springboot" };
		String longestString = Arrays.stream(input).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
				.orElse(null);
		System.out.println(longestString);
	}
}
