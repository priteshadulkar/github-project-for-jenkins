package com.java.program;

import org.testng.annotations.Test;

public class StringP {
	
	
	String s1 = "Selenium ";
	String s2 = "12hdjsjdksa";
	String conc ;
	
	@Test
	public void con()
	{
		for(int i = 0 ; i<=s1.length()-1; i++) {
			
			
		conc = String.valueOf(s1.charAt(i))  +  String.valueOf(s2.charAt(i))  ;
		
		
		System.out.println(conc);
		}
		System.out.println("<==========================>");
	}
	public static void main(String[] args)
	{
		 StringP  p  = new StringP();
		 p.con();
	}
	
	

}
