package com.java.strings;

public class CountingVowelsandConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="Hello World";
		
		String b= a.toLowerCase();
		
		  
		int vowels=0;
		int constants=0;
	    for(int i=0;i<a.length();i++)
	    {
	    	
	    	char character= b.charAt(i);
	    	
	    	if(character=='a'|| character=='e'||character=='i'||character=='o'||character=='u')
	    	{
	    		vowels++;
	    	}
	    	else if(character>='a'&& character<='z')
	    	{
	    		constants++;
	    	}
	    	
	    }
	    
	    System.out.println(vowels  +   "-count "  +    constants);
		
		  String  c= "Hello world";
		  
		  String d=c.toLowerCase();
		  
		  int vc=0;
		  int  cc=0;
		  
		  for(char e:d.toCharArray())
		  {
			 
			 
			 if(e=='a'||  e== 'e'||   e== 'i'||  e== 'o' ||   e== 'u')
			 {
				 vc++;
			 }
			 else if( e>='a'  &&  e<='z')
			 {
				 cc++;
				 
			 }
		  }
		  
		  System.out.println(  vc   + " -"  +  cc);
		  
		  
		
	}

}
