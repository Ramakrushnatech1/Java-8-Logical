package com.java8.example;

import java.util.Arrays;
import java.util.List;

public class OO16_Cube_Element_Greater_50 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		list.stream().map(i -> i * i * i).filter(s -> s > 50).forEach(System.out::println);
	}
}
