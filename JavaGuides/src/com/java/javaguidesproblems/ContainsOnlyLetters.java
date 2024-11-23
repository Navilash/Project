package com.java.javaguidesproblems;

import java.util.Arrays;

public class ContainsOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "chvw@";
		
		boolean flag=false;
		
		for(  int i=0;i<a.length();i++)
		{
			if(!Character.isLetter(a.charAt(i)))
			{
				System.out.println("false");
				flag=true;
				break;
			}
			
		}
		
		if(!flag)
		{
			System.out.println(true);
		}
		
		//  using Streams
		
	boolean b=	a.chars().allMatch(Character::isLetter);
	
	System.out.println(b);

		 
		
	}

}
