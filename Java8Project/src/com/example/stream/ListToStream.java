package com.example.stream;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> stream=Stream.of(2,1,5,6);
		
		LinkedList<Integer> integers=stream.collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(integers);

	}

}
