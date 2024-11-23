package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class CountNofVowelsandConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*String a ="apple";
	//	a=a.toLowerCase();
		
		System.out.println(a);
		
		List<Character> vowels= Arrays.asList('a','e','i','o','u');
		
		
		
	//	long vowelcount=  a.chars().mapToObj( c ->  (char) c).filter( vowels::contains).count();
		
		
		long   vowelcount = a.chars().mapToObj(c-> (char) c).filter(c-> vowels.contains(Character.toLowerCase(c))).count();
		
		System.out.println(vowelcount);
		
		
		long constants= a.chars().mapToObj(c -> (char) c).filter(c-> Character.isLetter(c) &&   !vowels.contains(Character.toLowerCase(c))).count();
		
		 
		System.out.println(constants);  */
		
		
		String a ="hello";
		
		List<Character>   list=   Arrays.asList('a','e','i','o','u');
		
		
	   long vowel=	a.chars().mapToObj(c-> (char) c).filter(c-> list.contains(Character.toLowerCase(c))).count();
		
		
	   
	   /*
	    *   Streams have lazy initialization,  until  it find  its terminal operation  it  will not going to be executed
	    *   
	    *   Stream  will be created but will not  not process the elements
	    * 
	    *   for example if there findFirst then if it find first element its going to break , and returns the  o/p.
	    * 
	    * 
	    * 
	    */
	   
	   System.out.println(vowel);
	   
	   long constants = a.chars().mapToObj(c-> (char) c).filter( c ->  Character.isLetter(c)  && !list.contains( Character.toLowerCase(c)   )).count();
	   
	   
	   System.out.println(constants);
	}

}
