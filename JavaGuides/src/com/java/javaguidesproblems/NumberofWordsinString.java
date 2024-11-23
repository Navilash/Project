package com.java.javaguidesproblems;

import java.util.StringTokenizer;

public class NumberofWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Hii I am Kalki";
		
		String a[]=s.split("\\s");
		
		
		for (String   ele :   a)
		{
			System.out.println(ele);
		}
		
		
		     System.out.println(a.length);
		     
		     
		     //   using String Tokens Concept
		     
		     StringTokenizer str =  new StringTokenizer(s);
		     
		     System.out.println(str.countTokens());
		     
		     
		//     int count=StringUtils.split(s,' ').length;
		     
	}

}
