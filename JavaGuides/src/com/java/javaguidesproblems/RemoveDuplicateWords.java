package com.java.javaguidesproblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "Java is great and Java is fun and Java is powerful";
		 
		 String [] words=input.split("\\s+");
		 
		 LinkedHashSet<String>   set = new LinkedHashSet<String>();
		 
		 
		 
		 for( String ele :  words)
		 {
			 set.add(ele);
		 }
		// System.out.println(set);
		 
	 System.out.println(String.join(" ",set));
		 
		 //    using Streams 
		 
		 
		 System.out.println(Arrays.stream(input.split("\\s+")).distinct().collect(Collectors.joining(" ")));

	}

}
