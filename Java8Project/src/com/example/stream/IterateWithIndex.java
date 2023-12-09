package com.example.stream;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class IterateWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"A","B","C","D","E"};
		
		//Method1
		//IntStream.range(0, a.length).mapToObj(index-> String.format("%d->%s", index,a[index])).forEach(System.out::println);
		
		//MEthod2
		AtomicInteger integer=new AtomicInteger(0);
		
		Arrays.stream(a).map(s->integer.getAndIncrement()+"->"+s ).forEach(System.out::println);
		}

}
