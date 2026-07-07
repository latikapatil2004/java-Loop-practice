/*Question 46: Write a program in java to find the maximum circular subarray sum of a given array.
Input:
Array = [10, 8, -20, 5, -3, -5, 10, -13, 11]

Output:
Maximum Circular Sum = 2

Explanation:
A circular subarray may wrap around the end of the array and the maximum sum is determined 
by considering both normal and circular subarrays.*/
import java.util.Scanner;
  class Maximumcircular
    {
	 public static void main (String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		
		int a[]=new int[10];
		System.out.println("enter the array element");
		
		for(int  i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int closestSum=Integer.MAX_VALUE;
		
		int num1=0,num2=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(Math.abs(sum)< Math.abs(closestSum))
				
				{
					closestSum=sum;
				
				num1=a[i];
				num2=a[j];
				}
               }
             }

            System.out.println("Pair is: [" + num1 + "," + num2 + "]");


					
				}
			}
		
