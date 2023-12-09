package practice.hackerrank.loops;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrintSeries {

	
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        int base=2;
	        
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            Set< Integer> integers=new TreeSet<Integer>((x,y)->x-y);    
	            int num;
	            
	            for(int j=n; j>=0; j--){
	                
	                num=a+ powerfun(base,j,b);
	                integers.add(num);
	            }
	             
	             integers.forEach(integ->{
	            	 System.out.printf("%d ",integ);
	             });
	             System.out.println(" ");
	           
	        }
	        in.close();
	    }
	    
	    public static int powerfun(int base, int index, int b){
	        
	        int sum=0;
	        for(int i=index;i>=0;i--){
	            sum=sum+ power(base,index)*b;
	        }
	            
	        
	        
	        return sum;
	    }
	    
	    public static int power(int base , int index){
	        
	    	if(index==0) {
	    		return 1;
	    	}
	    	
	        for(int i=index; i>=1;i++){
	            
	          base=base*base;
	        }
	        
	        
	        return base;
	    }
	    
}
