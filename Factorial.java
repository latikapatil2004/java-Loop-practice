/*Question 36: Replace each element with its factorial.
Input:
Array = [3, 4, 5]

Output:
Array = [6, 24, 120]

Explanation:
For every element compute the factorial by multiplying all numbers from 1 to that element 
and update the array with the result.*/
      
	  import java.util.Scanner;
	 class Factorial
	 {
	  public static void main(String[]args)
	  {  
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter the size");
	  int size=sc.nextInt();
	   int a[]=new int[size];
	  
		System.out.print("enter the element");
         
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
			  
		  }
		   int b[]=new int[size];
		  for(int i=0;i<a.length;i++)
		  {
		  int fact=1;
		 for(int j=1;j<=a[i];j++)
		 {
		    fact=fact*j;
			
		  }
		 b[i]=fact;
		  }
		  for(int i=0;i<b.length;i++)
		  {
			  System.out.print(" "+b[i]);
		  }
	  }
	 }
	 