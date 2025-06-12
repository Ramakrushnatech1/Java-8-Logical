package com.java8.example;

import java.util.Arrays;
import java.util.List;

public class OO10_Sort_Array_Convert_Stream {
	public static void main(String[] args) {
		
		  int i[] = { 99, 55, 203, 99, 4, 91 }; 
		  Arrays.parallelSort(i);		  
		  Arrays.stream(i).forEach(s -> System.out.println(s + ""));
		 
		  				//OR//

		List<Integer> list = Arrays.asList(99, 55, 203, 99, 4, 91);
		list.stream().sorted().forEach(System.out::println);
	}
}
