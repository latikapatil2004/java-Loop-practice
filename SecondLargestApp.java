/*Question 11: Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).*/

   import java.util.Scanner;
    class SecondLargestApp
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("enter the elemet");
	  for(int i=0;i<a.length;i++)
	  {
	   a[i]=sc.nextInt();
	   }
	   int max=a[0];
	   for(int i=0;i<a.length;i++)
	   {
	   if(a[i]>max)
	   {
	   max=a[i];
	   }
	   }
	   
	   //finnd secod max
	    int sm=Integer.MIN_VALUE;
	   for(int i=0;i<a.length;i++)
	   {
		    if(a[i]<max && a[i]>sm)
			{
				sm=a[i];
				
			}
	   }
			System.out.println("Max value= " +max);
			System.out.println("second Max " + sm);
	   }
	 }
	 
	 
	
	
	   