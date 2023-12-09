package com.example.methodRef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		//Map<String, Integer> map= fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));
		Map<String, Integer> map= fruits.stream().collect(Collectors.toMap(Function.identity(), String::length,(e1, e2) -> e1, HashMap::new));
		
		System.out.println(map);
		//{Apple=5, Pineapple=9, Orange=6, Banana=6}

	}

}
