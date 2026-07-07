/*Question 1: Write a Java program to input an array & display it.
Input:
Array Size = 5
Array Elements = 10 20 30 40 50
Output:
10 20 30 40 50
Explanation:
? First, we take the size of the array from the user.
? Then, elements are entered one by one into the array.
? Finally, using a loop, we display all elements in the same order they were entered.*/
    
	import java.util.Scanner;
	class DisplayApp
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in); 
	  int a[]=new int[5];
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
		 System.out.print(a[i] + " ");
	  }
	  
	 }
	}