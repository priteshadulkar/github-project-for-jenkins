package com.java.program;

//import com.java.String;

public abstract class Employee {
	
		Employee() { System.out.println("Base Constructor Called"); } 
		abstract void fun(); 
	} 
	/*class Derived extends Employee { 
		Derived() { System.out.println("Derived Constructor Called"); } 
		void fun() { System.out.println("Derived fun() called"); } 
	} 
	class Main { 
		public static void main(String args[]) { 
		Derived d = new Derived(); 
		} */

// abstract class have aimplemetatio on another class not a same class
