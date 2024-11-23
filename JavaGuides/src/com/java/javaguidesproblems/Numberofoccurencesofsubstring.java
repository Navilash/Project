package com.java.javaguidesproblems;

public class Numberofoccurencesofsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Hii  I am  fine I came here and I just play";
		
		  String input = "Java is great.Java is fun.Java is powerful.";
		  
		   String substring = "I";
		
		  String a =   "I";
		  
		  
		  String []  parts =s.split(substring,-1);
		  
		  for( String ele : parts)
		  {
			  System.out.println(ele);
		  }
		  
		  System.out.println(parts.length-1);
		
		
	}

}
