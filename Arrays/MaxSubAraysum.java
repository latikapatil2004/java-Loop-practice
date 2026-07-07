/*Question 87: Maximum Sum Subarray of Size K
Problem Statement
Given an array of integers and a number K, find the maximum sum of any contiguous subarray of size K.
Input:
Array = [2, 1, 5, 1, 3, 2]
K = 3

Output:
Maximum Sum = 9

Explanation:
Possible subarrays of size 3:

[2,1,5] ? sum = 8
[1,5,1] ? sum = 7
[5,1,3] ? sum = 9
[1,3,2] ? sum = 6

Maximum = 9

Using sliding window:

Window1 = [2,1,5] ? sum = 8

Slide window ? remove 2, add 1
Window2 = [1,5,1] ? sum = 7

Slide ? remove 1, add 3
Window3 = [5,1,3] ? sum = 9

Slide ? remove 5, add 2
Window4 = [1,3,2] ? sum = 6

Time Complexity: O(n)*/

import java.util.Scanner;
class MaxSubAraysum
 
{

	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		  System.out.println("enter the array element");
		  
		  
		  int sum=0;
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.println("enter the k");
		  int k=sc.nextInt();
		  int max=Integer.MIN_VALUE;
		  for(int i=0;i<k;i++)
		  {
			  sum+=a[i];
		  }
		  if(sum>max)
		  {
			max=sum; 
		  }
		  for(int i=k;i<a.length;i++)
		  {
		   sum=sum+a[i]-a[i-k];
		  
		  if(sum>max)
		  {
			  max=sum;
			  
		  }
		  }
		  System.out.println("maximum subarray sum="+max);
		  
	 }
 }

