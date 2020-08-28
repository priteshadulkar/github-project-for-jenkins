package com.java.program;

import org.testng.annotations.Test;

public class AbstractProgram {

	
	public void slary()
	{
		System.out.println("1 is executed");
		
	}
	
	
}

class B extends AbstractProgram
{
	
	public void slary()
	{
		
		System.out.println("2 is executed ");
		
	}
	
	public void java()
	{
		System.out.println("3 is executed");
		
	}
}
class C extends B
{
	
	public static void main(String[] args)
	{
		
		C cb = new C();
		cb.slary();
		cb.java();
		
	}
	
	
	
	
			
	
	
	
	
	
	
}