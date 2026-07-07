/*Question 48: Write a java program to merge of two given array.
Input:
Array1 = [1, 2, 3, 4, 5]
Array2 = [6, 7, 8, 9, 10]

Output:
Merged Array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Explanation:
Copy all elements of the first array followed by elements of the second array into a new array*/



import java.util.Scanner;
 class MergedArrays
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size");
		 int  size=sc.nextInt();
		 int a[]=new int[size];
		 int b[]=new int[size];
		 int c[]=new int[a.length+b.length];
		 System.out.println("enter the a array");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("enter the b array");
		 for(int i=0;i<a.length;i++)
		 {
			 b[i]=sc.nextInt();
		 }
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int k=a.length;
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		
		System.out.println("\ndislpay the first array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\ndislpay the second array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.println("\ndislpay the merge array");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	 }
 }
 