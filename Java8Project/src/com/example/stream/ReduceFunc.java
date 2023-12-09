package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ReduceFunc {
	public static void main(String[] args) {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
		
		List<Integer> odd = arr.stream().reduce(new ArrayList<Integer>(),(a,b)->{
			if(b%2!=0)
				a.add(b);
			return a;
			},(a,b)->{
				System.out.println("Value of a="+a);
				System.out.println("Value of b="+b);
				return b;});
		System.out.println(odd);
		
		
}
	

}
