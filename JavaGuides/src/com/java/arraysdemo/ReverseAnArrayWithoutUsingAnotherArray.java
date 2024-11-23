package com.java.arraysdemo;

import java.util.Arrays;

public class ReverseAnArrayWithoutUsingAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= { 1,2,3,4,5};
		
		int left=0;
		int right=a.length-1;
		while(left<right)
		{
			int temp=a[right];  
			a[right]=a[left];
			a[left]=temp;
			left++;
			right--;
		}
   System.out.println(Arrays.toString(a));
		
		
	}

}
