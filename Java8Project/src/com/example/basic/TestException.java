package com.example.basic;

public class TestException {

	public static void main(String[] args)  {
		int balance=1000;
		
		int withdraw=2000;
		
		if(withdraw>balance) {
			
			try {
			    
				throw new CuctomisedException("Insufficientbalnce");
			
			}catch (CuctomisedException e) {
				System.out.println(e.getMessage());
		}
		
		}else {
			balance=balance-withdraw;
		}

	}

}
