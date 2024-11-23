package com.java.javaguidesproblems;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="Hii I am Learning java"; 
		
		String[] words= a.split("\\s+");
		
		//System.out.println(Arrays.toString(words));
		
		String s="";
	//	for( int i=words.length-1;i>=0;i--)
		{
		//	s+=words[i] + " ";
		//	System.out.println(s+ "---");
		}
	//	System.out.println(s);
		
		//  using StringBuilder
		
		StringBuilder str = new StringBuilder();
		for( int i=words.length-1;i>=0;i--)
		{
		 //   str.append(words[i]).append(" ");
		}
	//	System.out.println(str.toString());
		
		
		for( String ele: words)
		{
		    str.append(new StringBuilder(ele).reverse().append(" "));
		   // System.out.println(str.toString());
		}
		System.out.println(str.toString());

	}

}
