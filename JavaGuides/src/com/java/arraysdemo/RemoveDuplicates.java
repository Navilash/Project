package com.java.arraysdemo;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,1,2,3,4,2,3,4,5};
		
		Arrays.sort(a);
		
		int temp[]  =  new int[a.length];
		
		int j=0;
		for(  int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}  
		temp[j++]= a[a.length-1];
		
	//	System.out.println(Arrays.toString(temp));
		
		for( int i=0;i<j;i++)
		{
	//		System.out.println(temp[i]);
		}
		
	//   Using Collections & HashSet	
		
		HashSet<Integer>   set  =new HashSet<Integer>();
	
		
		for (  int num : a)
		{
			set.add(num);
		}
		
		System.out.println(set);
		
		// using Streams
		
		int [] c=  Arrays.stream(a).distinct().toArray();
		
		System.out.println(Arrays.toString(c));
		
		//  using nested for loop
		
		int n=a.length;
		
		int[] uniqueArray=new int[n];
		
		int uniqueCount=0;
		
		for( int i=0;i<n;i++)
		{ 
			
			boolean found=false;
			
			for( int k=0;k<uniqueCount;k++)
			{
				
				if(a[i]==uniqueArray[k])
				{
					found=true;
					break;
				}
			}
			
			if(!found)
			{
				uniqueArray[ uniqueCount++]=a[i];
			}

		
			
		}
		
		uniqueArray=
				
				Arrays.copyOf(uniqueArray,uniqueCount);
		
		
		System.out.println(Arrays.toString(uniqueArray));
		
		
		

}   
	
}
