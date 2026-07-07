/*Question 63: Sum of Array Elements
Description:
Given an array of n elements, compute the sum.
Input:
n = 5
Array: [1,2,3,4,5]

Output:
Sum = 15

Explanation:
Each element is visited once.

Time Complexity: O(n)*/

  
  import java.util.Scanner;
  class SumOfArray
    {
	 public static void main(String[]args)
	 {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		 int sum=0;
		  System.out.println("enter the array element");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }			  
		  for(int i=0;i<a.length;i++)
		  {
			  sum+=a[i];
		  }
		  System.out.println("Sum = "+sum);
	  
	 }
	}
	