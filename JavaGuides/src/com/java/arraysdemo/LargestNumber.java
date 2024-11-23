package com.java.arraysdemo;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int []  a = {1,2,3,46,5,4};
	
	int b=   Arrays.stream(a).max().getAsInt();
	
	//System.out.println(b);
	
	
	   int great=a[0];
	   
	   for( int i=1;i<a.length;i++)
	   {
		   if(a[i]<a[great])
		   {
			   great=a[i];
		   }
	   }
	   
	   System.out.println(a[great]);
		
		
	}

}
