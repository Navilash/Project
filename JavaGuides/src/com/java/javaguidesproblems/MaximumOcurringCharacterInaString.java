package com.java.javaguidesproblems;

import java.util.HashMap;
import java.util.Map;

public class MaximumOcurringCharacterInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="learn java programming";
		
		
		HashMap<Character,Integer>   map= new HashMap<Character,Integer>();

		for(char c:  a.toCharArray())
		{	
			map.put(c, map.getOrDefault(c,0)+1);
	
		}  
		
		int maxFrequency =0;
		
		char maxchar=' ';
		
		for(Map.Entry<Character, Integer>  entry :  map.entrySet())
		{
		 //	char key = entry.getKey();
			
			int value =entry.getValue();
			
			if(value >  maxFrequency)
			{
				maxFrequency=entry.getValue();
				maxchar=entry.getKey();
			}  
		}
		
		System.out.println(maxchar   + " - "  + maxFrequency  );

	}

}