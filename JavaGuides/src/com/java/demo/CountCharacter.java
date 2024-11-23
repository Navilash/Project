package com.java.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String a= "apple";
		  
		  HashMap<Character,Integer>   map  =  new HashMap<Character,Integer>();
		  
		  
		  for( char  c: a.toCharArray())
		  {
			  map.put(c, map.getOrDefault(c,0)+1);
		  }
		  
		  for(Map.Entry<Character,Integer> it:  map.entrySet())
		  {
			 // System.out.println(it.getKey()  +  "  "  +  it.getValue());
			  
			  if(it.getValue()>1)
			  {
				  System.out.println(it.getKey());
			  }
		  }
		  
		  
		  int arr[]= { 1,2,3,2,3,4,4};
		  
		 int d[]= Arrays.stream(arr).distinct().toArray();
		 
		  System.out.println(Arrays.toString(d));

  }
}