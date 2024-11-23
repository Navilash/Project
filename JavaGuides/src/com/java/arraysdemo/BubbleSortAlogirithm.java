package com.java.arraysdemo;

public class BubbleSortAlogirithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j+1];
					 arr[j+1]= arr[j];
					 arr[j] = temp;
				}
			}
		}
		
		for( int num : arr)
		{
			System.out.print(num + " ");
		}
	}

}
