package com.example.basic;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IntStreamRange {
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.println(N%2);
        
        IntPredicate pr=x->(x==N);
        
        if(N%2!=0){
            System.out.println("Weird");
        }else{
            IntStream st1=IntStream.range(2,6);
            IntStream st2=IntStream.range(6,21);
            boolean b=st1.anyMatch(pr);
            if(b){
                System.out.println("Not Weird");
            }else{
                b=st2.anyMatch(pr);
                if(b)
                 System.out.println("Weird");
            }
            
            if(N>20){
                System.out.println("Not Weird");
            }else {
            	 System.out.println("Weird");
            }
        }

        scanner.close();
	}

}
