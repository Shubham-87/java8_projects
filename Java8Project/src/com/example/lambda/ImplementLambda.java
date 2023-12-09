package com.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImplementLambda {

	public static void main(String[] args) {
		/*
		 * FunctionalInterface interface1=(x,y)->{ return x+y; };
		 * 
		 * System.out.println(interface1.add(5, 5));
		 */
		testLambdaWithList();
	}
	
	
	public static void testLambdaWithList() {
		 ArrayList<Integer> arrL = new ArrayList<Integer>();
	        arrL.add(1);
	        arrL.add(2);
	        arrL.add(3);
	        arrL.add(4);
	        
	        arrL.forEach(System.out::print);
	}
}
