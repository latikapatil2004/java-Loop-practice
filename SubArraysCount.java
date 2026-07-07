/*Example: count subarrays with sum Equal to Target (Fixed window) 
Input:  arr[]={1,2,3,1,2}
target=3   output: 2*/


import java.util.Scanner;
  class SubArraysCount
  {
    public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array element");
		int a[]=new int[5];
		int k=2,sum=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the target sum");
		int target=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		if(sum==target)
		{
			count++;
		}
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
		}
		if(sum==target)
		{
			count++;
		}
		System.out.print("count="+count);
	}
  }