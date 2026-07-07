/*Question 2: Write a Java program to calculate the sum of all elements in an array.
Input:
Array Size = 5
Array Elements = 2 4 6 8 10
Output:
Sum of array elements = 30
Explanation:
? Initialize a variable sum = 0.
? Traverse the array and keep adding each element to sum.
? After the loop ends, sum will hold the total of all array elements.*/
     
	 	import java.util.Scanner;
	class SumApp
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in); 
	  int a[]=new int[5];
	  int sum=0;
	  System.out.println("enter the element");
	  
	  //input
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
		   
	  }
	  
	  //output
	   System.out.println("display the array data"); 
	    for(int i=0;i<a.length;i++)
	  {
	       sum+=a[i];
		
	  }
	   System.out.print(sum + " ");
	  
	 }
	}