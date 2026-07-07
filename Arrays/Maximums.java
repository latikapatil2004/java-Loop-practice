/*Question 47: Write a program in java to find the maximum for each and every contigious subarray of size k from a given array.
Input:
Array = [1, 3, 6, 21, 4, 9, 12, 3, 16, 10]
K = 4

Output:
Maximums = [21, 21, 21, 21, 12, 16, 16]

Explanation:
Slide a window of size K across the array and determine the maximum element within each window*/

 import java.util.Scanner;
   class javajavajaajajaaj
   
   {
	   public static void main(String[]args)
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.print("enter the array element");
		   int a[]=new int[10];
		   for(int i=0;i<a.length;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   int max=Integer.MIN_VALUE;
		   for(int i=0;i<a.length-1;i++)
		   { 
	            int start=i;
			   for(int j=i+1;j<a.length;j++)
			   {
				   int end=j;
			   
			   for(int k=start;k<end;k++)
			   {
			   if(a[k]>max)
			   {
				   a[k]=max;
			   }
			   System.out.print(" "+a[k]);
			   }
			   
		   }

		   }		   
	   }
   }