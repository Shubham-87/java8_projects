package com.example.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlattenStream_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{ 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 }};
		
		Arrays.stream(arr).forEach(s->{
			Arrays.stream(s).forEach(System.out::print);
		});
	}

}
