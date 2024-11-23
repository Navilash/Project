package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalString = "Hello World"; // Step 1: Original string

//		String sentence = "Hello World";
//
//        String reversed = Arrays.stream(sentence.split(" "))
//                                .map(word -> word.chars()
//                                                 .mapToObj(c -> (char) c)
//                                                 .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
//                                                     Collections.reverse(list);
//                                                     return list.stream();
//                                                 }))
//                                                 .map(String::valueOf)
//                                                 .collect(Collectors.joining()))
//                                .collect(Collectors.joining(" "));   // Step 6: Display the reversed string
//        System.out.println("Original string: " + originalString);
//        System.out.println("Reversed string: " + reversed);
		
		
		String  b=  "hello";
		
	 	b.chars().mapToObj( c ->  (char) c).collect(Collectors.collectingAndThen(Collectors.toList(),list ->
		
		{
			Collections.reverse(list);   return list.stream();})).map(String::valueOf).collect(Collectors.joining());

		
		String  a=  "hello";
		
	 String d=	a.chars().mapToObj(c-> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(),list -> { Collections.reverse(list);
		
			return list.stream();}	)).map(c -> String.valueOf(c)).collect(Collectors.joining());
			
	 
	 System.out.println(d);
	 
	 
	 String e=a.chars().mapToObj(c-> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(),list -> { Collections.reverse(list);
	 return list.stream();
	 })).map(c-> Character.toString(c)).collect(Collectors.joining());
	
		
	 
	 
	 String str="hello world";
	 
	 
	 String  res=str.chars().mapToObj(c-> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(), list-> { Collections.reverse(list);
			 return list.stream();
	 })).map(c-> Character.toString(c)).collect(Collectors.joining());
	 
	 
	// Arrays.stream(sentence.split(" "))
   //  .map(word -> word.chars()
      //                .mapToObj(c -> (char) c)
	 
	 
	 //System.out.println(res);
	 
	 
	}
}
	 
			 
		


		  


