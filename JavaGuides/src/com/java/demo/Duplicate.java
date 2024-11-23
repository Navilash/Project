package com.java.demo;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int []   arr= { 1,2,3,2,3,4,5,4};
		
		Arrays.sort(arr);
		
		int temp[]= new int[arr.length];
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]= arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		
		int n=j;
		
		System.out.println(n);
		
		
		for( int i=0;i<n;i++)
		{
			System.out.print(temp[i]+ " ");
		}
	
	}

}
