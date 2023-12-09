package com.example.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9,  
	               10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };
		 
		 boolean b =Arrays.stream(arr_sample1).anyMatch(x->{
			 return x==2;
		 });
		 
		 System.out.println(b);
		 
		 OptionalInt op =Arrays.stream(arr_sample1).findAny();
		 
		 op.ifPresent(System.out::println);

	}

	

}
