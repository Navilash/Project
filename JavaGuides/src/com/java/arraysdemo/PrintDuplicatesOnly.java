package com.java.arraysdemo;

import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicatesOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {1,2,3,2,3,4,3,4,5,6};
		
	
		
		
		for( int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+ " ");
				}
			}
		}
		
		HashSet<Integer>   set  =  new HashSet<Integer>();
		HashSet<Integer>   duplicates  =  new HashSet<Integer>();
		
		for( int num: a)
		{
			if(!set.contains(num))
			{
				set.add(num);
			}
			else
			{
			  duplicates.add(num);
			}
	
		}
		
	//	System.out.println(duplicates);
	
	}

}
