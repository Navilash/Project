package com.java.arraysdemo;

import java.util.Arrays;

public class CheckTwoArraysareEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[]= { 1,2,3,4,5};
		
		int arr2[]= { 1,2,3,5};
		
	//	System.out.println(Arrays.equals(arr1,arr2));
		
		//   without using built in function and first we need to sort it first
		
		
		boolean flag=false;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println(false);
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println(" equal");
		}
		
		
	}

}
