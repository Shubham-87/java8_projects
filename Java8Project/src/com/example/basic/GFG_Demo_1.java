package com.example.basic;

import java.util.Arrays;
import java.util.List; 
class GFG_Demo_1 { 
	public static void main(String[] args) 
	{ 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
			11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; 

		// Let's try the imperative style first(which we 
		// are familiar with) 
		int sum = 0; 
		

		// Let's try the declarative style now 
		sum = Arrays.stream(arr) // Step 1 
				.sum(); // Step 2 
		System.out.println("Average using streams : " + 
								(sum / arr.length)); 

		// forEach() 
		// It iterates through the entire streams 
		System.out.println("Printing array elements : "); 
		Arrays.stream(arr) 
			.forEach(e->System.out.print(e + " "));
		
		}
	
	
} 
