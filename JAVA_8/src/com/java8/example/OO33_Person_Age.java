package com.java8.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OO33_Person_Age {
	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(1985, 01, 23);
		LocalDate today = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthDay, today));
	}

}
