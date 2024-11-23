package com.java.arraysdemo;

import java.util.Arrays;

public class SeelctionSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]  a ={ 1,2,3,4,5};
		
		
		for(int i=0;i<a.length-1;i++)
		{
			int highest=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[highest])
				{
					highest=j;
				}
			}
			
			int temp=a[highest];
			a[highest]=a[i];
			a[i]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
