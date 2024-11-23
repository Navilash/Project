package com.java.strings;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a ="google";
		
		
		
		for(  int i=0;i<a.length();i++)
		{
			
			int count=0;
			for( int j=i;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			
			if(count>=2)
			{
				System.out.println(a.charAt(i)   +   "-" +  count);
				//break;
			
			}
		}
		
		
	}

}
