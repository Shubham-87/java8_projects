package com.example.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Optional<String> op=Optional.empty();
		System.out.println(op.isEmpty());
		op=op.or(()->{
			
			return Optional.of("Shubham");
		});
		
		System.out.println(op.get());
	}
	

}
