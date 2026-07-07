/*Question 54: Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the
same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

import java.util.*;
class SumIndices
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
		  System.out.println("ennter the target");
		  int target=sc.nextInt();
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]+a[j]==target)
				  {
					  System.out.println(i+","+j);
				  }
			  }
	}
   
}
}
