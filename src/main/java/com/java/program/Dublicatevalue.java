package com.java.program;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Dublicatevalue {
    
	String s[]= {  "c" , "c#", "net" ,"java" ,"c ", "c" } ;
	 
	@Test
	public void value () {
		
		for(int i =0 ; i<s.length-1; i++)
		{
			for(int j= i+1 ; j<s.length-1; j++)
			{
			int 	count = 0 ;
				if(s[i].equals(s[j]))
				{
					
					System.out.println(s[i]);
					count++ ;
				}
			}
		}
		
	}
	
	public void Array()
	{
	ArrayList<Object[]> mydata = new ArrayList<Object[]>();
	
		
		
		
		
		
		
		
	}
	public static void main(String[] args)
	{
		
		Dublicatevalue  v = new Dublicatevalue();
		v.value();
		
	}
	
	
}
