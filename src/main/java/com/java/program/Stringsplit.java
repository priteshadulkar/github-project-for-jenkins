package com.java.program;

import org.testng.annotations.Test;

public class Stringsplit {

	String s1 = "cricket is 20" ;
	int s2    = 40;
	String[] s3 = s1.split("\\s") ; 
	
	@Test
	public void Add()
	{
		for(int i = 0 ; i<=s3.length-1;  i++)
		{
			System.out.println(s3[i]);
		}
		System.out.println(s3.length-1);
		
		     int sum    =       s2   +   Integer.parseInt(s3[2]) ;
		     
		     
		     System.out.println(sum);
		     System.out.println("<==========================>");
	}
	
	
	public static void main(String[] args )
	{
		
		Stringsplit sp = new Stringsplit();
		 sp.Add();
		 
	}
}
