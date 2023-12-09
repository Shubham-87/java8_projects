package com.example.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetToStream {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(2);
		set.add(4);
		set.add(6);
		
		set.stream().forEach(System.out::println);
	}

}
