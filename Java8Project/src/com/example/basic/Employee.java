package com.example.basic;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	 int id;
    String name;
    int sal;
    Employee(int id,String name, int sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    
    
	
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}


   public int getSal() {
		return sal;
	}
	public static void main(String[] args) {
      
      List<Employee>  emplyoyees=new LinkedList<Employee>(); 
       
       emplyoyees.add(new Employee(1,"A",10));
       emplyoyees.add(new Employee(2,"B",20));
       emplyoyees.add(new Employee(3,"C",30));
       emplyoyees.add(new Employee(4,"D",40));
       emplyoyees.add(new Employee(5,"A",50));
       
       //3rd Highest Sal
		

       emplyoyees.stream().map(e->e.getSal()).sorted((x,y)->y-x).limit(3).sorted((x,y)->x-y).limit(1).
       collect(Collectors.toList()).forEach(System.out::println);
       
       
      }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
