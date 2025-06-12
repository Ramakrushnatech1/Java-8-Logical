package com.java8.example;

import java.util.Arrays;
import java.util.List;

public class O7_Total_No_Element {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Long count = list.stream().count();
		System.out.println(count);
	}
}
