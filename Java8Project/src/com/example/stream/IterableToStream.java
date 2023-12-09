package com.example.stream;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iterable<Integer> ints=Arrays.asList(1,2,3,4,5);
		
		Spliterator<Integer> spl=ints.spliterator();
		
		Stream<Integer> strm=StreamSupport.stream(spl, false);
		
		strm.forEach(System.out::println);
	}

}
