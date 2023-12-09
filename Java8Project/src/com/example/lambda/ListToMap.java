package com.example.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
	
	//Inner Class to define key and values
	class ListItems{
		
		int key;
		String value;
		public ListItems(int key, String value) {
		
			this.key=key;
			this.value=value;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return key+" "+value;
		}
	}
	
	//main method
	public static void main(String[] args) {
		
		//create obj of outer class
		ListToMap listToMap=new ListToMap();
		//Creating obj of inner class
		ListItems items1=listToMap.new ListItems(1,"One");
		ListItems items2=listToMap.new ListItems(2,"Two");
		ListItems item3=listToMap.new ListItems(3,"Three");
		
		//Add obj to List
		List<ListItems> itemList=new ArrayList<ListToMap.ListItems>();
		itemList.add(items1);
		itemList.add(items2);
		itemList.add(item3);
		
		System.out.println("List="+itemList);
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		itemList.forEach(l->{
			map.put(l.key, l.value);
		});
		
		System.out.println("Map="+map);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
