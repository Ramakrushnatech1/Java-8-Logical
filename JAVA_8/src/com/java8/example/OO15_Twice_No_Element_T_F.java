package com.java8.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OO15_Twice_No_Element_T_F {

	public boolean containsDuplicate(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		OO15_Twice_No_Element_T_F s = new OO15_Twice_No_Element_T_F();
		int in[] = { 1, 3, 5, 1 };
		boolean res = s.containsDuplicate(in);
		System.out.println(res);
	}
}
