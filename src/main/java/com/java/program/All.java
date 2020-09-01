package com.java.program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class All {
	
	String s1 = "selenium" ;
	String s2 = "1234556" ;
	
	//   Stirng Concate   
	@Test
	public void Concate()
	{
	 for(int i =0 ; i<=7-1 ; i++)
	 {
		 
		 String con = String.valueOf(s1.charAt(i)) + String.valueOf(s2.charAt(i)) ; 
		  System.out.println(con);
	 }
	 String s="Sachin";  
	   s.concat(" Tendulkar");//concat() method appends the string at the end  
	   System.out.println(s.concat("Tendulkar"));
	}
	//.......................Split................................. 
	
	 @Test
	public void GetString()
	{
		String s4 = " wall Streat is 90 " ;
		int a = 40 ;
		String[] split = s4.split("\\s");
		 
		for(int i =0 ; i<=split.length-1; i++)
		{
	 		String sp = split[i] ;
			System.out.println(sp);
		}
		
	System.out.println(split[4]);
		
	int sum = a + Integer.parseInt(split[4]) ;
	System.out.println(sum );
	
	}
	


//..........................Reverse ................................

	 @Test
 public void Reverse()
 {
	 //selenium = muineles
	 String rev = " ";
	 for(int i =s1.length()-1 ; i>=1 ; i--  ) {
		 
		 rev = rev + s1.charAt(i) ;
	}
	 System.out.println(rev);
	 }

/////..................plaindron 1234 = 54321.................
  
 @Test
    public void Palindron()
    {
    	int sum  =1 ;
    	int n ;
    	int num = 12345 ;
    	while(num>0)
    	{
    		n = num% 10 ;
    		sum = (sum*10) + n;
    		num = num/10 ;
        }
     	System.out.println(sum);
    }
  @Test
   public void  Factorail()
   {
	   int n =4 ;
	   int sum =1 ;
	    while(n>0)
	    	
	    {
	    	sum = sum * n ;
	    	 n-- ;
	    	
	    }
	    System.out.println(sum);
	    
   }
    ////////////////////////////Prime Number ................//////////////////////////
    
   @Test
    public void prime()
    {
	   int count ;
    	 for( int i =1 ; i<= 100 ; i++)
    	 {
    		 count = 0 ;
    		 
    		 for( int j = i ; j>=1 ; j--)
    		 {
    			 
    			 if(i%j==0)
    			 {
    				count =  count  + 1 ;
    				
    			}
    			 
    		}
    		 if(count ==2)
    		 {
    			 System.out.println(i);
    		 }
    		 
    		 
    	 }
    }
    	// @Test
    	 public void sort()
    	 {
    		 String s1 = "greeshelpfull" ;
    		 
    		 char[] temp = s1.toCharArray() ;
    		 
    		 Arrays.sort(temp);
    		 
    		 System.out.println(temp);
    		 
    		 String s11 = "aajjjdbdjdkkd" ;
    		 int count ;
    		 
    		 char[] ch = s11.toCharArray();
    		  for(int i =0 ; i<=s11.length()-1 ; i++)
    		  {
    			  count =0 ;
    			  for(int j=0 ; j<=s11.length()-1 ; j++)
    			  {
    				  if(ch[j]==ch[i])
    				  {
    					  
    					  count ++ ;
    				  }
    				  if(count>2)
    				  System.out.println(ch[i] + " " + count);
    			}
    		  
    	
    			  
    			  
    		  }
    		 
    		 
    		 System.out.println("<==========================>");
    	 }
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    




