/*Question 43: Write a program in java to find a subarray with given sum from the given array?
Input:
Array = [3, 4, -7, 1, 3, 3, 1, -4]
Target Sum = 7

Output:
Subarrays = [3,4], [3,4,-7,1,3,3], [1,3,3], [3,3,1]

Explanation:
Check all contiguous subarrays and calculate their sums to identify those equal to the target value*/

import java.util.Scanner;
class SubarraysSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		System.out.print("display the array element");
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("enter the target sum");
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
					if(sum==target)
					{
					for(int k = i; k <= j; k++) {
               System.out.print(a[k] + " ");
                }
             System.out.println();
			}
					}
				}
				
		}
	}
