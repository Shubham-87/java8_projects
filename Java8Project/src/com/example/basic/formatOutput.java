package com.example.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class formatOutput {
	
	public static void main(String[] args) throws ParseException {
		//decimalFormat();
		
		formatOutput();
}
	
	public static void formatString() {
		String s1="Hello";
        String s2="World.";
        String s3="Java.";
        System.out.printf("%s,%s",s1,s2);
        System.out.printf("%s,%s",s1,s3);
	}
	
	public static void decimalFormat() {
		int x = 100;
        System.out.printf(
            "Printing simple integer: x = %d\n", x);
 
        // this will print it upto 2 decimal places
        System.out.printf(
            "Formatted with precision: PI = %.2f\n",
            Math.PI);
 
        float n = 5.2f;
 
        // automatically appends zero to the rightmost part
        // of decimal
        System.out.printf(
            "Formatted to specific width: n = %.4f\n", n);
 
        n = 2324435.3f;
 
        // here number is formatted from right margin and
        // occupies a width of 20 characters
        System.out.printf(
            "Formatted to right margin: n = %20.4f\n", n);
	}
	
	public static void dateFormat() throws ParseException {

		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		String s= new String (dateFormat.format(new Date()));
		
		System.out.println(s);
		
		String s2= "1/1/2001";
		
		dateFormat=new SimpleDateFormat("MM/dd/yyyy");
		
		Date dt= dateFormat.parse(s2);
		
		System.out.println(dt);
	
	}
	
	public static void formatOutput() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             
             s1=justifyRight(s1);
             
             System.out.printf("%s%03d\n",s1,x);
         }
         System.out.println("================================");
	}
	
	public static String justifyRight(String s) {
		
		int strLength=15;
		
		int padding=strLength-s.length();
		
		for(int i=1;i<=padding;i++) {
			s=s+" ";
		}
		
		return s;
	}
}