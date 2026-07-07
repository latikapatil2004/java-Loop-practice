/*Question 69: Linear Search
Description:
Search target in array.
Input:
Array: [4,7,2,9]
Target = 2

Output:
Found

Explanation:
Worst case checks all elements.

Time Complexity: O(n)*/

import java.util.Scanner;
 class LinearSearch
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		  boolean isFound=false; 
		  System.out.println("enter the array element");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.println("enter the target");
		  int target=sc.nextInt();
		  
		  for( int i=0;i<a.length;i++)
		  {
				  if(a[i]==target)
				  {
					  isFound=true;
					  break;
					  
				  }
			  
		  }
		  if(isFound)
		  {
			  System.out.println("found");
		  }
		  else 
		  {
			  System.out.println(" not found");
		  }
	 }
 }
 