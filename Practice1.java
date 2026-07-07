/*1. Reverse Array

Input: [1,2,3,4,5]
Output: [5,4,3,2,1]*/
 
 
 
import java.util.Scanner;
 class Practice1
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
	   int i=0; int j=a.length-1;
		while(i>j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		i++;
		j--;
		
			for( i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		}
		}
 
 