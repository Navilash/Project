package com.java.arraysdemo;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []  arr= {1,2,3,4,5};
		
		int sum=0;
		
		for( int num : arr)
		{
			sum+=num;
		}
		
		long average=sum/arr.length;
		
		System.out.println(average);
	}

}
