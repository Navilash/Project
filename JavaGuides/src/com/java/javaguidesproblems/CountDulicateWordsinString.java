package com.java.javaguidesproblems;

import java.util.HashMap;
import java.util.Map;

public class CountDulicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  a=  "Super Man Bat Man Spider Man";
		
		
		String b=a.toLowerCase();
		
		   String []  res= b.split(" ");
		   
		   
		   Map<String,Integer>   map =new HashMap<String,Integer>();
		   
		   for(  String ele : res)
		   {
			   
			   map.put(ele,map.getOrDefault(ele,0)+1);
		   }
		   
		  
		   
		   for(Map.Entry<String,Integer>  entry :  map.entrySet())
		   {
			   if(entry.getValue()>1)
			   {
				   System.out.println(entry.getKey()  +" " +entry.getValue());
			   }
		   }
		
	}

}
