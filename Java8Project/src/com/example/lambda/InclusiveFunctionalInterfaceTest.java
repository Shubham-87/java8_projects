package com.example.lambda;

public class InclusiveFunctionalInterfaceTest {

	interface Fun1{
		int func1(int x, int y);
	}
	
	interface Fun2{
		void func2(Fun1 fun1);
	}
	
	interface Fun3{
		String func3();
	}
	
	private void testInterface(Fun1 func1,Fun2 fun2) {
		fun2.func2(func1);
	}
	
		public static void main(String[] args) {
			Fun1 fun1=(x,y)->{
				return x+y;
			};
			
			Fun2 fun2=x->{
				int res= x.func1(10,15);
				
				System.out.println(res);
			};
			
			InclusiveFunctionalInterfaceTest test=new InclusiveFunctionalInterfaceTest();
			
			test.testInterface(fun1, fun2);
			
			//////////////////////////////////////
			
			Fun3 fun3=()->"Geeks";
			
			System.out.println(fun3.func3());;
		}
}
