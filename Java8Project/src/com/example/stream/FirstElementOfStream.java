package com.example.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FirstElementOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> str=Stream.of(1,2,3,4,5);
		
		findLast(str);
		//System.out.println(str.findFirst().get());
		

	}
	
	//Using reduce()
	
	public static void findFirst(Stream<Integer> str) {
	Integer i=	str.reduce((first,second)->first).get();
	
	System.out.println(i);
	}
	
	//using reduce()
	public static void findLast(Stream<Integer> str) {
		Optional<Integer> intOp=str.reduce((first,second)->second);
		intOp.ifPresent(System.out::println);
	}

}
