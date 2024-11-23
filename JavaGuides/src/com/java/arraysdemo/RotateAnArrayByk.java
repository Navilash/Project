package com.java.arraysdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateAnArrayByk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*	Integer []  arr = { 1,2,3,4,5};
		
		int k=2;
		
		
		List  list=     Arrays.asList(arr);
		
		
	   Collections.swap(list, 0,1);
	   
	   System.out.println(Arrays.toString(arr));   */
		
		int  []  arr = { 1,2,3,4,5};
		
//		5,1,2,3,4
//		4,5,1,2,3
		
	//	5,4,3,2,1
		
	//	2,3,4,5,1
	//	3,4,5,1,2
		
		
		
		int k=2;
		
		 rotateAnArray(arr,k);
		 
		 System.out.println(Arrays.toString(arr));
		
		
		
		

}
	
	static    void rotateAnArray(int []arr,  int k)
	{
		
		
		int n=arr.length;
		 k=k%n;
		
	 	reverseArray(arr,0,n-1);
		
		reverseArray(arr,0,k-1);
		
		reverseArray(arr,k,n-1);
	}
	
	
	static   void reverseArray(int[] arr, int begin,int end)
	{
		
		while(begin<end)
		{
			int temp=arr[end];
			arr[end]=arr[begin];
			arr[begin]=temp;
			begin++;
			end--;
		}
	}

}