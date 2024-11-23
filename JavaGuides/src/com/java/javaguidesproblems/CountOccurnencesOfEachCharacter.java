package com.java.javaguidesproblems;

import java.util.HashMap;
import java.util.Map;

public class CountOccurnencesOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String   a="Learning 443, Java";
		
		Map<Character,Integer>   map= new HashMap<Character,Integer>();
		
		for( char  c: a.toCharArray())
		{
			if(Character.isLetterOrDigit(c))
					{
			map.put(c, map.getOrDefault(c,0)+1);
		 }
		}
		for(Map.Entry<Character, Integer> entry :  map.entrySet())
		{
			System.out.println(entry.getKey()+  " -" + entry.getValue());
		}
	}

}
