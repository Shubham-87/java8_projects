package com.example.stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> strm=Stream.of(1,2,3,4);
		
		Integer[] str=strm.toArray(Integer[]::new);
		
		Set<Integer> set=new HashSet<Integer>();
		
		Collections.addAll(set, str);
		
		set.forEach(System.out::println);

	}

}
