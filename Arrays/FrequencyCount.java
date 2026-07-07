/*Question 74: Count Frequency of Each Element (Without Hashing)
Description:
Given an array, count how many times each element appears using nested loops (no HashMap allowed).
Input:
n = 5
Array = [1, 2, 2, 3, 1]

Output:
1 ? 2 times
2 ? 2 times
3 ? 1 time

Explanation:
For each element:
Loop through entire array again.
Count matches.

Outer loop runs n times.
Inner loop runs n times.

Time Complexity: O(n²)
Because every element is compared with every other element*/

import java.util.Scanner;
 class FrequencyCount
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		 
		  int count=0;
		  System.out.println("enter the array element");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  
		  
		  for( int i=0;i<a.length;i++)
		  {
			   count=0;
			  for(int j=0;j<a.length;j++)
			  {
				  if(a[i]==a[j])
				  {
					  count++;
					 
				  }
				  
		      }
			  System.out.println(a[i]+ " occurs " + count + " times");
			 
		  }
		   
	 }
 }
 