package com.java.program;

import java.util.Arrays;

public class Stringsort {

	
	
	
	public static void main(String[] args)
	{
		
		String  s1 = "my  name is  a john " ; 
		s1.substring(0) ;
		char[] arr = s1.toCharArray() ;
		
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println("using String");
		String[] s12 = s1.split("//s");
	
		
		
		
	}
	
}
