package com.example.basic;

public class TestClass  {

	String firstname;
	
	String lastName;
	
	public TestClass(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		
		this.firstname=firstName;
		this.lastName=lastName;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		  int value1=firstname.chars().reduce(0, (x,y)->x+y);
		  
		  int value2=lastName.chars().reduce(0, (x,y)->x+y);
		 
		return value1+value2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//req
		TestClass example=new TestClass("Shubham", "Nandanwar");
		
		//dbObjecct
		TestClass example2=new TestClass("Shubham", "Nandanwar");
		
		boolean b=example.hashCode()==example2.hashCode();

		System.out.println(b);
	}

}
