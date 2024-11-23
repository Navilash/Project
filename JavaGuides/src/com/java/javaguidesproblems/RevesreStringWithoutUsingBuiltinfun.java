package com.java.javaguidesproblems;

public class RevesreStringWithoutUsingBuiltinfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  a = "Navilashgoud";
		
		StringBuilder s = new StringBuilder();
		
		for(int i=a.length()-1;i>=0;i--)
		{
			s.append(a.charAt(i));
			
		}   
		System.out.println(s);   
		
		//  if we want this  convert   to string then we use  toString
		
		String b= s.toString();
		
		System.out.println(b);
		
		//using StringBuilder reverse Function
		
		String c = new StringBuilder(a).reverse().toString();
		
		System.out.println(c);
		
	}

}
