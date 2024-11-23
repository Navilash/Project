package com.java.demo;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class StringsDemo {
	
//	
//	Java Program to Find the First Non-repeated Character in a String
//	Java Program to Check Palindrome String
//	Java Program to Find Duplicate Characters in a String
//	Java Program to Find Duplicate Words in a String
//	Java Program to Find All the Permutations of a String
//	Java Program to Count Occurrences of Words in a String
//	Java Program to Count the Occurrences of Each Character
//	Java Program to Count Vowels and Consonants in a String
//	Java program to Count the Number of Duplicate Words in a String
//	Java Program to Count Number of Words in Given String
//	Java Program to Count the Number of Occurrences of Substring in a String
//	Java Program to Count the Occurrences of Each Character in String
//	Java Program to Merge Two String Arrays
//	Java Program to Remove Duplicate Words from String
//	Java Program to Reverse a String(5 ways)
//	Java Program to Reverse Each Word of a String
//	Java Program to Swap Two Strings
//	How to Check if the String Contains Only Digits
//	How to Check if the String Contains Only Letters
//	How to Check If the String Contains Only Letters or Digits
//	Java Program to Remove All Whitespaces from a String
//	Java Program to Check if a String is Empty or Null
//	Java Program to Find Maximum Occurring Character in String
//	Java Program to Add Characters to a String
//	Java Program to Remove All Whitespaces from a String
//	Java Program to Check if a String is Empty or Null
//	Java Program to Find Maximum Occurring Character in String
//	Java Program to Check if a Year is a Leap Year
//	Java Program to Display Characters from A to Z using Loop
//	Java Program To Count the Occurrences of Each Character Using HashMap
//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a ="apple";
		
		
		
		LinkedHashMap<Character,Integer>  map  =  new LinkedHashMap<Character,Integer>();
		
		
		
		for(char    c: a.toCharArray())
		{
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		
		
		for(Map.Entry<Character,Integer>    entry  :  map.entrySet()) {
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() );
			
			}
		}   
		
		int  left=0;
		
		int right=a.length()-1;
		
	boolean flag=false;
		while(left<right)
		{
			if(a.charAt(left)!=a.charAt(right))
			{
				System.out.println("not palindrome");
			       flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("not palindrome");
		}
		
		
		String   d=" I am playing and I am am Watching";
		
		d=d.trim();
		
		 String []word=  d.split(" ");
		 
			LinkedHashMap<String,Integer>  dup  =  new LinkedHashMap<String,Integer>();
		 
		 
		for( String num :  word)
		{
			dup.put(num, dup.getOrDefault(num, 0)+1);
		}
		
		
		int max=0;
		
		String res=" ";
		
		for(Map.Entry<String, Integer>   ent:  dup.entrySet())
		{
			
			if(ent.getValue()>=max)
			{
				max=ent.getValue();
				res=ent.getKey();
				
			}
				
		}   
		System.out.println(res +  "  max word");
		
		LinkedHashSet<String>   set = new LinkedHashSet<String>();
		
		StringBuilder  str =  new StringBuilder();
		
		for(  String ele:  word)
		{
			  if(!set.contains(ele))
			  {
				  str.append(ele).append(" ");
			  }
			  set.add(ele);
		}
		
		System.out.println(set);
		
		System.out.println(str.toString());
		
		
		String e= "I am Playing Guitar";
		
	String [] words=e.split(" ");   
	
	StringBuilder bud = new StringBuilder();
	for(  int i=words.length-1;i>=0;i--)
	{
		bud.append(words[i]);
		if(i!=0)
		{
			bud.append(" ");
		}
	}
	
     System.out.println(bud.toString());
	}

}
