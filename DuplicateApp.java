/*Question 68: Find Duplicate Using Nested Loop
Description:
Check if array contains duplicate elements.
Input:
[1,2,3,2]

Output
Duplicate Found

Explanation:
Each element compared with others.

Time Complexity: O(n²)*/

import java.util.Scanner;
 class DuplicateApp
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		  boolean Duplicate=false;
		  System.out.println("enter the array element");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
          		  
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				 if(a[i]==a[j])
				 {
					Duplicate=true;
					break;
					
				 }
				
			  }
			  }
			  if(!Duplicate)
			  {
				  System.out.println("duplicate found");
			  }
			  else 
			  {
				  System.out.println(" not duplicate found");
			  }
			 
	     }
 }
 