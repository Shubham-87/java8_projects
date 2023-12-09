package com.example.stream;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseElements {

	public static void main(String[] args) {
		
		Stream<Integer> stream=Stream.of(2,1,5,6);
		
		stream.collect(Collectors.collectingAndThen(Collectors.toList(), (list)->{
			Collections.reverse(list); 
            return list.stream(); 
		})).forEach(System.out::println);;

	}

}
