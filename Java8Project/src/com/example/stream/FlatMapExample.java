package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str1 = List.of("S", "H", "U", "B");
		List<String> str2 = List.of("H", "A", "M");

		List<List<String>> str3 = List.of(str1, str2);

		System.out.println(str3);

		List<String> fullNameStream = str3.stream().
				flatMap(x -> x.stream()).collect(Collectors.toList());

		System.out.println(fullNameStream);

	}

}
