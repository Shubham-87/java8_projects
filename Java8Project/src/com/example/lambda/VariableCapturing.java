package com.example.lambda;

public class VariableCapturing {

	 static int num;
	
	interface Int1 {
		void print();
	}
	
	public static void main(String[] args) {
		int x=10;
		
		
		Int1 int1=()->{
			num=10;
			
			System.out.println(num);
		};
		
		int1.print();
		
	
	}
	
	
}
