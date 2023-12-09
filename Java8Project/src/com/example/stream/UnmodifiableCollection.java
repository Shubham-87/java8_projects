package com.example.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UnmodifiableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testUnmodifiableMap();
		
	}
	
	public static void testUnmodifiableList() {
		//This function can also create unmodifiable list
				List<Integer> integeres=List.of(1, 2, 3, 4, 4, 5);
				
				//integeres.add(10);
				
				//Creating unmodifiable List
				//List<Integer> unmodifiableList=integeres.stream().collect(Collectors.toUnmodifiableList());

				//unmodifiableList.add(11);
				
				integeres.forEach(System.out::println);
				
				List<Integer> evenList=new ArrayList<Integer>();
				evenList.add(2);
				evenList.add(4);
				evenList.add(6);
				
				//This is creating immutable list
				List<Integer> unmodifiableList=evenList.stream().collect(Collectors.toUnmodifiableList());
				//unmodifiableList.add(11);
				unmodifiableList.forEach(System.out::println);
	}
	
	public static void testUnmodifiableMap() {
		Map<Integer, String> map=new HashMap<Integer, String>();
		Map<Integer, String> map2=new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map2.put(3, "C");
		map2.put(4, "D");
		List<Map<Integer, String>> listMap=new ArrayList<Map<Integer,String>>();
		listMap.add(map);
		listMap.add(map2);

		System.out.println(listMap);
		Map<Object, Object> immutableMap=listMap.stream().
				collect(Collectors.toUnmodifiableMap(x->x,y->y.values()));
		
		System.out.println(immutableMap);
		System.out.println(immutableMap.keySet().stream().collect(Collectors.toList()));
		//System.out.println(immutableMap.values().stream().collect(Collectors.toList()));
		immutableMap.put(1, "E"
				+ "");
	}

}
