package com.example.basic;

public class TestExample {
	
	
	class A{
		int a=10;
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return a;
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			
			
			
			return this.hashCode()==obj.hashCode();
		}
	}
	
	class B{
		int b=11;
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return b;
		}
	}

	public static void main(String[] args) {
		A a=new TestExample().new A();
		B b =new TestExample().new B();
		
		boolean bb=a.equals(b);
		
		System.out.println(bb);
	}

}
