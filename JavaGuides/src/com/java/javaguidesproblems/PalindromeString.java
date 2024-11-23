package com.java.javaguidesproblems;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  a= "hegyfghfeh";
		
		int left=0;
		int right=a.length()-1;
		
		boolean flag = false;
		
		while(left<right)
		{
			if(a.charAt(left)!=a.charAt(right))
			{
				System.out.println("Not a palindrome");
				flag= true;
				break;
			}
			left++;
			right--;
		}
		if(!flag)
		{
			System.out.println("Its Palindrome");
		}
		
	}

}
