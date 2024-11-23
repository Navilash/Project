package com.java.javaguidesproblems;

import java.util.Arrays;

public class MergeTwoStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] a= { "hii", "I", "am"};
		
		String [] b= {"learning", "java"};
		
		String c[]=  new String[a.length+ b.length];
		
		int index=0;
		
//		for( String ele:  a)
//		{
//			c[index++]=ele;
//		}
//		for( String ele:  b)
//		{
//			c[index++]=ele;
//		}
		
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println(Arrays.toString(c));
	}

}
