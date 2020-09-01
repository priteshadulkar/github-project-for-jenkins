package com.java.program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Sort {

	
	String s1 = "greeshelpfull" ;
	int []i = { 25, 60 ,45,10 ,20 ,5 };
	@Test
	public  void Sortingorder()
	{
		
		char tempArray[]   =  s1.toCharArray() ;
		
		// sorting by Alphbates order 
		
		Arrays.sort(i);
		
	  System.out.println( Arrays.toString(i));
		    
	  System.out.println("<==========================>");
	}


   public static void main(String[] args)
    {
	   
	 Sort s = new Sort();
	 s.Sortingorder();
	   
	   
    }
 }