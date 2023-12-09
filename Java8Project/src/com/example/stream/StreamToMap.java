package com.example.stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMap {

	class ClassA{
		private int key;
		private String value;
		public ClassA(int key,String value) {
			// TODO Auto-generated constructor stub
			this.key=key;
			this.value=value;
		}
		
		int getKey() {
			return key;
		}
		
		String getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "{"+key+":"+value+"}";
		}
	}
	
	public static void main(String[] args) {

		List<ClassA> list=new ArrayList<StreamToMap.ClassA>();
		
		list.add(new StreamToMap().new ClassA(1, "A"));
		list.add(new StreamToMap().new ClassA(2, "B"));
		list.add(new StreamToMap().new ClassA(3, "C"));
		
		streamToMap(list.stream());
		
		
		
		//System.out.println(list);
	}

	public static void streamToMap(Stream<StreamToMap.ClassA> strm) {
		
		Map<Integer, String> str=strm.collect(Collectors.toMap(ClassA::getKey, ClassA::getValue));
		
		
			System.out.println(str);
	
	}

	


}
