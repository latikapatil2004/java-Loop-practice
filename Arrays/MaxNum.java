/*Question 64: Find Maximum in Array
Description:
Find the largest element in an array.
Input:
[3,8,2,9,1]

Output:
Max = 9

Explanation:
Each element compared once.

Time Complexity: O(n)*/
 
 import java.util.Scanner;
  class MaxNum
  {
    public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		  System.out.println("enter the array element");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
           int max=a[0];		  
		  for(int i=0;i<a.length;i++)
		  {
		  if(a[i]>max)
		  {
			  max=a[i];
		  }
	}
	System.out.println("maximum is=" + max);
  }
  }