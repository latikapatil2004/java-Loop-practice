/*Question 16: Write a Java program to calculate the average of all elements present in an integer array.
Input Array:
[10, 20, 30, 40, 50]
Output:
Average of array elements = 30
Explanation
? The average of array elements is calculated by:
Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}
{\text{Number of elements}}Average=Number of elementsSum of all elements
? First, iterate through the array and add all elements to a variable sum.
? Then divide sum by the total number of elements (array.length) to get the average.*/

   import java.util.Scanner;
   class AverageApp
   { 
     public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  int sum=0;
	  System.out.print("enter the array element");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  for(int i=0;i<a.length;i++)
	  {
		   sum+=a[i];
	  }
		   int average=sum/a.length;
	  System.out.print("Average of array element =" + average);
	  }
	 }
   
	  