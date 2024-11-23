

package com.java.javaguidesproblems;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "1345";
		boolean flag=false;
		
		for(  int i=0;i<a.length();i++)
		{
          if(!Character.isDigit(a.charAt(i)))
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
		
		
		//   Using Streams
		
	boolean result=	a.chars().allMatch(Character::isDigit); 
	System.out.println(result);
		
		

	}

}
