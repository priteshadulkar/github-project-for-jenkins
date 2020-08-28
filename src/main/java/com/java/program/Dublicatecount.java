package com.java.program;

public class Dublicatecount {

   public static void main(String[] args)
   {
	   
	   String s1 = "apkiassii ";
	   
	   String s2 = " java , c* , java klkl"  ;
	   char[] a = s1.toCharArray();
	   char[] b = s2.toCharArray();
	   int count = 0;
	   //
	   for(int k = 0 ; k<=a.length-1 ;  k++)
	   {
		   
		   //System.out.println(b[k]);
		   
	   }
	   
	   
	   
	   //
	   
	   for(int i = 0 ; i<=a.length-1 ;  i++)
	   {
		   count = 0 ;
		   for(int j = i+1; j<= a.length-1 ; ++j)
		   {
			   if(a[i] == a[j] )
			   {
				   
				   count ++ ;
		     	}
		   }
		   System.out.println("the character "+ a[i] + " is present " + count + "tims");
		

	
	

			   
			   
		   }
		   
	   }
	   
	   
	   
	   
	   
   }
		   
		   
	
	

