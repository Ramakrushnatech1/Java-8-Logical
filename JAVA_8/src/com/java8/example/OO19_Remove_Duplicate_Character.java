package com.java8.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OO19_Remove_Duplicate_Character {
	public static void main(String[] args) {

		String input = "abcdabcd";
		Arrays.stream(input.split("")).collect(Collectors.toSet()).forEach(System.out::print);

	}

}
