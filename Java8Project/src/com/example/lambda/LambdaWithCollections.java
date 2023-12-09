package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=new ArrayList<Integer>();
		
		lst.add(10);
		lst.add(2);
		lst.add(6);
		lst.add(7);
		lst.add(1);
		
		
		Collections.sort(lst, (x,y)->{
			return y-x;
		});
		
		System.out.println(lst);
		
		
		//Using  comparator at the time of initialization
		TreeSet<Integer> tree= new TreeSet<Integer>((x,y)->{
			return y-x;
		});
		
		tree.add(1);
		tree.add(2);
		tree.add(3);
		
		System.out.println(tree);
		
		
		
		
		//TreeMap<String, Integer> treeMap=new TreeMap<String,Integer>();
		
		  TreeMap<String, Integer> treeMap=new TreeMap<String,Integer>((x,y)->{ return
		  y.compareTo(x); });
		 
		treeMap.put("One", 1);
		treeMap.put("Two", 2);
		treeMap.put("Three", 3);
		treeMap.put("Four", 4);
		treeMap.put("Five", 5);
		
		System.out.println(treeMap);
	}

}
