package com.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testConsumer();
		testPredicate();

	}
	
	public static void testConsumer() {
	
		//Consumer to  modifyList
		//Multiply each element by 2
		Consumer<List<Integer>> modifyList=lst->{
			for(int i=0;i<lst.size();i++) {
				lst.set(i, lst.get(i)*2);
			}
		};
		//Display elements of list
		Consumer<List<Integer>> display=lst->{
			lst.forEach(System.out::println);
		};
		
		//Add elements to list
		Supplier<List<Integer>> addElemts=()->{
			List<Integer> integers=new ArrayList<Integer>();
			for(int i=1;i<=10;i++) {
				integers.add(i);
			}
			
			return integers;
		};
		
		
		display.andThen(modifyList).accept(addElemts.get());

	}

	public static void testPredicate() {
		Predicate<Integer> lesserThan10=x->{
			return x<10;
		};
		
		Predicate<Integer> greaterThan5=x->{
			return x>5;
		};
		
		Predicate<Integer> notZero=x->{
			return x!=0;
		};
		
		System.out.println(notZero.and(greaterThan5).and(lesserThan10).test(7));;
	}
	
}
