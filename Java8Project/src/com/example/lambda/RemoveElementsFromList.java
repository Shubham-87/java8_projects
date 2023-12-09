package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> list=new ArrayList<Object>();
		
		list.add(null);
		list.add(1);
		list.add("Shubham");
		list.add(null);
		list.add(2);
		
		System.out.println(list);
		
		//Removing null elements from list
		
		List<Object> nonNullList=new ArrayList<Object>();
		
		list.forEach(x->{
			if(x!=null) {
				nonNullList.add(x);
			}
		});
		
		System.out.println(nonNullList);

	}

}
