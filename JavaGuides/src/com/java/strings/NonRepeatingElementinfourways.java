package com.java.strings;

public class NonRepeatingElementinfourways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String a="google";
		
		
		/*
		
		for(int i=0;i<a.length();i++)
		{
			
			int count=0;
			for( int j=0;j<a.length();j++)
				
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				
			    }
			}
				if(count==1)
				{
					System.out.println(a.charAt(i));
					break;
				}
			}   */
		
		
		
		int []  charcount= new int[256];
		
		for(  int i=0;i<a.length();i++)
		{
			charcount[a.charAt(i)]++;
		}
		
		for(  int i=0;i<a.length();i++)
		{
			if(charcount[a.charAt(i)]==1)
			{
				System.out.println(a.charAt(i)  +  "  is charcter ");
				break;
			}
		}
		
		}
	}



