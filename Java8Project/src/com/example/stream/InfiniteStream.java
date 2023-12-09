package com.example.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class InfiniteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateIntInfiniteStream();
	}
	
	public static void generateInfiniteDoubleStream() {
		DoubleStream.iterate(0, i->i+1).forEach(System.out::println);;
	}
	public static void generateIntInfiniteStream() {
		IntStream.iterate(0, i->i+1).limit(10).forEach(System.out::println);
	}
}
