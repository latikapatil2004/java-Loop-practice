/*Question 67: Count All Pairs in Array
Description:
Given array of size n, print all possible pairs (i,j).
Input:
n = 3

Output:
(1,2) (1,3) (2,3)

Explanation:
Nested loops.

Time Complexity: O(n²)*/

import java.util.Scanner;
 class PairsOfArray
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
          		  
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  System.out.println("("+a[i]+","+a[j]+")");
			  }
	 }
 }
 }