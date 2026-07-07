/*Question 44: Write a program in java to find out the maximum difference
 between any two elements such that larger element appears after the smaller number.
Input:
Array = [7, 9, 5, 6, 13, 2]

Output:
Maximum Difference = 8

Explanation:
Find a pair where the smaller element appears before the larger element and the difference between them is maximum.*/


import java.util.Scanner;
  class MaxDiffrence
  {
    public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.print("enter the number");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int diff=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					diff=a[j]-a[i];
				}
				if(diff>max)
				{
					max=diff;
				}
			}
		}
				System.out.print("Maximum Difference = "+max);
			
		}
  }
  