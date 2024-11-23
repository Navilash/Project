package com.java.arraysdemo;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayElementsInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {1,2,3,4,5};
		
		Arrays.sort(a);
		
	//  we can use reverse order here only  if array is non primitive data type
	//	Arrays.sort(a,Collections.reverseOrder());
		
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
		
		//   sort the elements   without using built in function   in descending order
		
		
		int []b = { 1,2,3,4,5};
		
		for( int i=0;i<b.length-1;i++)
		{
			
              int index=i;
              
              
			for( int j=i+1;j<b.length;j++)
			{
				if(b[j] > b[index])
				{
					index=j;
				}
			}
			
			int largenumber=b[index];
			b[index]=b[i];
			b[i]=largenumber;
			
		}
		
		System.out.println(Arrays.toString(b));
		
		
	}

}
