package com.java8.example;

import java.util.HashMap;
import java.util.Map;

public class OO29_SplitToMap {
	public static void main(String[] args) {

		String s = "John:2000, Tom:3000, Marie:5000, Alice:8000";
		Map<String, String> map = new HashMap<>();

		String st[] = s.split(",");

		for (String string : st) {
			String s1[] = string.split(":");
			String s2 = s1[0].trim();
			String s3 = s1[1].trim();

			map.put(s2, s3);
		}
		System.out.println("String to HashMap :" + map);
	}
}
