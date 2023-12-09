package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateElements {

	
	public static void main(String[] args) {
	   int a[]= {2,3,4,4,5,6,2};	
	   findWithGroupingBy(a);
	   }
	//Using Collections.frequency
	static void findDuplicateByFreq(int[] a) {
		//Converting array to List
		IntStream intStream=Arrays.stream(a);
		List<Integer> list=intStream.collect(ArrayList::new, (x,y)->{
			x.add(y);
		}, (x,y)->{
		System.out.println(y);	
		});
		
		Set<Integer> duplicates= list.stream().filter(x->Collections.frequency(list, x)>1).collect(Collectors.toSet());
		System.out.println(duplicates);
	}
	
	static void findBySet(int a[]) {

		Set<Integer> integers=new HashSet<Integer>();
		IntStream stream=Arrays.stream(a).filter(x->!integers.add(x));
	    stream.forEach(System.out::println);
	    System.out.println(integers);
    }
	
	static void findWithGroupingBy(int a[]) {
		IntStream intStream=Arrays.stream(a);
		List<Integer> list=intStream.collect(ArrayList::new, (x,y)->{
			x.add(y);
		}, (x,y)->{
		//System.out.println(y);	
		});
		list.stream().
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(m->m.getValue()>1).
		map(x->x.getKey()).collect(Collectors.toList()).
		forEach(System.out::println);;
		
	}
}