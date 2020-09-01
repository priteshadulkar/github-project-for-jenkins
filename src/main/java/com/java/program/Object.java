package com.java.program;

import org.testng.annotations.Test;

public class Object {

	public void object()
	{
		int Object[]  = {1,2,3,4,5,6 } ;
		for(int  obj : Object)
		{
			System.out.println(obj);
		}
		
	}
	@Test
	public  void star()
	{
		for(int i = 1; i<=5 ; i++)
		{
			for(int  j = i; j>=1 ; i--)
			{
			System.out.print(" * ");
		    }
			
			System.out.println("");
			
		}
		
		
		
		
	}
	public static void main(String[] args)
	{
		Object mo = new Object();
		//mo.object();
		//mo.star();
		
	}
	
	
	
}
