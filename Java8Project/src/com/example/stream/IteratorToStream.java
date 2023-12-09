package com.example.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iterator<Integer> itr=Arrays.asList(1,2,3,4).iterator();
		
		Spliterator<Integer> spl=Spliterators.spliteratorUnknownSize(itr, Integer.SIZE);
		
		Stream<Integer> strm=StreamSupport.stream(spl, false);
		
		strm.forEach(System.out::println);

	}

}
