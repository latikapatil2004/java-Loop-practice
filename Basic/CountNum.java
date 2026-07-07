/*Question 35: Write a java program to enter a number and print it in words.
Input:

Number = 123

Output:

One Two Three

Explanation:

Each digit is separated and converted into its word form.
1 ? One, 2 ? Two, 3 ? Three.*/
 import java.util.*;
  class CountNum
  { 
   public static void main(String x[])
   { 
   Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt(); 
	 int rev=0;
	while(number>0)
	{
	 int digit=number%10;
	 rev=rev*10+digit;
	  number=number/10;
	  }
	  while(rev>0)
	  {
	   int digit=rev%10;
	   if(digit == 0) 
		   System.out.print("Zero ");
	   else if(digit==1)
	   System.out.print("One ");
	   else if(digit==2)
	    System.out.print("two ");
		else if(digit==3)
	    System.out.print("three ");
		else if(digit==4)
	    System.out.print("four ");
		else if(digit==5)
	    System.out.print("five ");
		else if(digit==6)
	    System.out.print("six ");
		else if(digit==7)
	    System.out.print("seven ");
		else if(digit==8)
	    System.out.print("eight ");
		else 
	    System.out.print("nine ");
	      rev=rev/10;
		}
	   }
     }
  
		