package com.java.javaguidesproblems;

public class CheckGivenNumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7;
		
	 /*	int count=0;
		for(int i=1; i<=a/2;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}   
		
		if(count==1)
		{
			System.out.println(" Prime");
		}
		else
		{
			System.out.println(" Not prime");
		}
		*/    
		
		 boolean flag  =  false;
		  
		if (a ==0  || a== 1)
		{
			System.out.println("  not prime");
			
		}
		
		else
		{
		for(int i=2; i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
			
			       flag=true;
				  System.out.println("not prime");
				  break;
			}
		}   
		
		
		if(!flag)
		{
			System.out.println("prime");
		}

	}

}   
	
}
