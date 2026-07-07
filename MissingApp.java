/*Question 8: Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.*/ 
 
 import java.util.Scanner;
 class MissingApp
 {
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the element");
   int a[]=new int[6];
   for(int i=0;i<a.length;i++)
   {
	  
	   a[i]=sc.nextInt();
   }
   for(int i=1;i<=a.length;i++)
   {
	    boolean flag=false;
	   for(int j=0;j<a.length;j++)
	   {
		   if(a[j]==i)
		   {
			   flag=true;
			   break;
		   }
	   }
   
	   if(!flag)
	   {
		   System.out.println( "Misssing elemet = " + i);
	   }
	   
   }
   }
  }
