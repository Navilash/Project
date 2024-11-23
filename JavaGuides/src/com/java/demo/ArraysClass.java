package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysClass {
	
	
//	Java Array Programs with Output
//	Java Program to Reverse an Array Without Using Another Array
//	Java Program to Find Duplicate Elements in an Array   or remove duplicates
//	Java Program to Find Largest Number in an Array
//	Java Program to Check the Equality of Two Arrays
//	Java Program to Calculate Average Using Arrays
//	Java Program to Sort the Array Elements in Descending Order

	public static void main(String[] args) {
		
	
	
//	int left=0;
//	int right=a.length-1;
//	
//	while(left<right)
//	{
//		int temp=a[right];
//		a[right]=a[left];
//		a[left]=temp;
//		
//		left++;
//		right--;
//		
//	}
//	
//	System.out.println(Arrays.toString(a));
	
	
//	
//	
//	
//	 int b[]=   Arrays.stream(a).distinct().toArray();
//	 
//	 System.out.println(Arrays.toString(b));
		
//		int[] a = { 1,1,2,2,3,4,3,4,3,4,5,4,6};
//		
//		
//		Arrays.sort(a);
//		
//		System.out.println(Arrays.toString(a));
//		
//		
//		int temp[]=  new int[a.length];
//		
//		
//		int j=0;
//		
//	//	temp[0]=a[0];
//		
//		for(int i=0;i<a.length-1;i++)
//		{
//			
//			if(a[i]!=a[i+1])
//			{
//				temp[j]=a[i];
//				j++;
//			}
//		}
//		
//		System.out.println(j+  "  print");
//		temp[j++]=a[a.length-1];
//		
//		
//		
//		
//		
//		int n=j;
//		
//		for( int i=0;i<n;i++)
//		{
//			System.out.print(temp[i]  + " ");
//		}
//		
		
	
	 
	 //  Arrays.sort(a);
//
//	   for( int i=0;i<a.length;i++)  
//	   {
//		   
//	     int count=0;
//		   for( int j=i+1;j<a.length;j++)  
//		   {
//
//		   if(a[i]==a[j])
//		   {
//		        count++;
//		   }
//		   
//		   
//	   }
//	 
//	   if(count==1)
//	 {
//		 System.out.print(a[i]  + " ");
//	 }
//	 
	 
	 
	// int a[]= { 1, 2, 3 ,4, 2, 3 ,5};
	

		
		 
		 
//		 Arrays.sort(a);
//		 
//		 for( int i=0;i<a.length-1;i++)
//		 {
//			 
//			 if  (a[i]==a[i+1])
//			 {
//				 if(i==0||   a[i]!=a[i-1])
//				 {
//					 System.out.println(a[i]);
//				 }
//			 }
//			 
//		 }
		 
		 
		
//		 int  a[]= { 1, 2, 3 ,4, 2, 3 ,5,5,34,98,76};
//		 
//		 Arrays.sort(a);
//		 
//		 System.out.println(a[a.length-1]);
//		 
//	     int b=	 Arrays.stream(a).max().getAsInt();
//	
//       	System.out.println(b);  
//       	
       	
       	
//       	int max=a[0];
//       	
//       	for( int i=1;i<a.length;i++)
//       	{
//       		if(a[i]>  max)
//       		{
//       			max=a[i];
//       		}
//       	}
//		 System.out.println(max);
//		 
//		 
//		 List<Integer>   list =  new ArrayList<>();
//		 
//		 for(  int num: a)
//		 {
//			 list.add(num);
//		 }
//		 
//		System.out.println( Collections.max(list));  
		 
		 
		 
//		 int a[]=  { 1,2,3,2,3,4,5,4,5};
//		 
//		 Arrays.sort(a);
//	
//		 
//		 int b[]=  { 2,1,3,2,3,4,5,5,4};
//		 
//		 
//		 Arrays.sort(b);
//		 
//	   System.out.println(	 Arrays.equals(a, b));
//	
		
		
	
		 
//		 int sum=0; 
//		 
//		for(int num :a)
//
//		{
//			sum+=num;
//		}
//		
//		int n= a.length;
//		
//		double avg= sum/n;
//		
//		System.out.println(avg);
//		
//		
//		double med=  Arrays.stream(a).average().getAsDouble();
//		
//		System.out.println(med);   
		
		
		
	
		 
	     	    	
//	    	    Arrays.sort(a);
//	    	    
//	    	    
//	    	    
//	    	    int left=0;
//	    	    
//	    	    int  right=a.length-1;
//	    	    
//	    	    
//	    	    while(left<right)
//	    	    {
//	    	    	int temp=a[right];
//	    	    	
//	    	    	a[right]=a[left];
//	    	    	
//	    	    	a[left]=temp;
//	    	    	
//	    	    	left++;
//	    	    	right--;
//	    	    }
//	    	    
//	    	    System.out.println(Arrays.toString(a));
	     
	  
		 int a[]=  { 3,2,1,4,34,5};
		 
		 
		
		 
	   for(int i=0;i<a.length;i++)
	   {
		 
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i] < a[j])
			 {
				  int temp=a[j];
				  a[j]=a[i];
				  a[i]=temp;
			
			 }
		 }  
		 
		// System.out.println(Arrays.toString(a)   +  i   +  "iteration");
		 
	   }
		 
		System.out.println(Arrays.toString(a));
		 
		 
		 
		 
		 
		 
		 
		 
		 
}   
   }


