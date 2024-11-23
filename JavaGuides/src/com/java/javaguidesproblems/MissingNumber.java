package com.java.javaguidesproblems;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,5,6,7,8,9};
		
		int n=a.length+1;
		
		int  totalsum=  (n*(n+1))/2;
		
           System.out.println(totalsum);
		
		int sum=0;
		
		for (int num :  a)
		{
			sum+=num;
		}
		System.out.println(sum);
		
		System.out.println(totalsum-sum);
	}

}
