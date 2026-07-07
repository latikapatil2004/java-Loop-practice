/*Question 24: Write a program in java to rotate an array by N positions ?
Input:
Array = [0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27]
Position = 4

Output:
Rotated Array = [12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9]

Explanation:
Split the array into two parts at the given position and place the 
second part first followed by the first part to complete the rotation.*/

   import java.util.Scanner;
   class Rotate{
   public static void main(String[]args)
   {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.print("enter the element ");
		System.out.print("enter the position");
		  int position=sc.nextInt();
		  int temp=a[0];
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;i++)
				{
					a[i]=a[i+1];
				}
				a[a.length-1]=temp;
			}
			
			System.out.print("Rotated array");
			for(int i=0;i<a.length;i++)
			{
				System.out.print( " "+ a[i]);
			}
   }
   
   }	
					