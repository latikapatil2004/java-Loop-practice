/*Question 45: Write a program in java to find two elements whose sum is closest to zero.
Input:
Array = [38, 44, 63, -51, -35, 19, 84, -69, 4, -46]

Output:
Pair Closest to Zero = [44, -46]

Explanation:
Check pairs of elements and compute their sums; the pair whose sum is nearest to zero is selected.*/

 import java.util.Scanner;
  class ClosestToZero
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
		
