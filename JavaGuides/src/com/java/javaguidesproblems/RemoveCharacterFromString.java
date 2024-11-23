package com.java.javaguidesproblems;

import java.util.Arrays;
import java.util.OptionalInt;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a = "apple";
		
		char ch='p';
		
		
		String b= a.replace(Character.toString(ch),"");
		
	//	System.out.println(b);
		
		
		int []   arr=  { 2,4,8,6,12,16,10,1,5,9,3};   
		
		int  d= Arrays.stream(arr).filter(n-> n%1==0).min().getAsInt();
		
		System.out.println(d);
	}

}
