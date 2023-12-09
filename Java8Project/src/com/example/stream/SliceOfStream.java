package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SliceOfStream {

	public static void main(String[] args) {
		
		Stream<Integer> str=Stream.of(1,2,3,4,5);
		
		//str.skip(0).limit(1).forEach(System.out::println);
		
		List<Integer> integers=str.skip(1).limit(2).collect(Collectors.toList());
		
		integers.forEach(System.out::println);
	}
}
