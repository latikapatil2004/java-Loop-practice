/*Question 50: Write a java program to find unique value in this given array.
Input:
Array = [1, 2, 3, 5, 1, 5, 20, 2, 12, 10]

Output:
Unique Elements = [3, 20, 12, 10]

Explanation:
Count occurrences of each element and print those elements that appear exactly once*/

 import java.util.Scanner;
  class UniqueEleApp
  {
	  public static void main(String[]args)
	  {
		  Scanner sc=new Scanner(System.in);
		    System.out.println("enter the array size");
		  int size =sc.nextInt();
		  int a[]=new int[size];
		 
		  System.out.println("enter the array element");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }			  
		  
		  for(int i=0;i<a.length;i++)
		  {
			  int count=0;
			  for(int j=0;j<a.length;j++)
			  {
				  if(a[i]==a[j])
				  {
					  count++;
				  }
				  
			  }
			  if(count==1)
				  {
					 System.out.print(" "+a[i]); 
				  }
			  
		  }
		  
			 
			  
		}
		  
	  }
	  
  