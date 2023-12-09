package com.example.basic;

//This is customised expression
//@AdviceController --in spring
public class CuctomisedException extends Exception {

	String msg;
	public CuctomisedException(String msg) {
		this.msg=msg;
		
	}
	
	//@ExceptionHandler -in spring
	/*
	 * void show() { System.out.println(msg); }
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
}
