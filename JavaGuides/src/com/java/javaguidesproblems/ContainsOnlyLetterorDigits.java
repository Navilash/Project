package com.java.javaguidesproblems;

public class ContainsOnlyLetterorDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1345ggtgehy!#!$";
		boolean flag=false;
		for(  int i=0;i<a.length();i++)
		{
          if(!Character.isLetterOrDigit(a.charAt(i)))
			{
				flag=true;
				System.out.println("does not contains only digits");
				break;
			}
		}
		if(!flag)
		{
			System.out.println(true);
		}  
		
		boolean b=a.chars().allMatch(Character::isLetterOrDigit);
		
		System.out.println(b);
		
		System.out.println(a.chars().allMatch(Character::isLetterOrDigit));
		
	}

}
