package com.example.basic;

import java.io.*;
import java.util.Scanner;

public class InputOutput {

	
	 public static void main(String[] args) throws IOException {
	       
	        
	        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	        
	        String b= rd.readLine();
	        String c= rd.readLine();
	        String d= rd.readLine();
	       
	        
	        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
	        wr.append(b);
	        wr.flush();
	        System.out.println();
	        wr.append(c);
	        wr.flush();
	        System.out.println();
	        wr.append(d);
	        
	        wr.close();
	        rd.close();
	    }
}
