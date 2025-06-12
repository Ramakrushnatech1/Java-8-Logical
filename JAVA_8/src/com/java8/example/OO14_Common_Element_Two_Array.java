package com.java8.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class OO14_Common_Element_Two_Array {
	public static void main(String[] args) {
		  int[] array1 = {1, 2, 3, 4, 5};
		  int[] array2 = {4, 5, 6, 7, 8};
		  Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
		  Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
		  Set<Integer> commonElements = set1.stream().filter(set2::contains).collect(Collectors.toSet());
		   System.out.println("Common elements: " + commonElements);
	}

}
