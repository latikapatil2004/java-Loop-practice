/*Question 31: Replace First and Last Element with 0.
Input:
Array = [5, 3, 7, 2]

Output:
Array = [0, 3, 7, 0]

Explanation:
Update the first and last positions of the array with 0 and leave the middle elements unchanged.

Asked In Companies:*/


 import java.util.Scanner;
  class Replacement{
   public static void main(String[]args)
   {
     Scanner sc=new  Scanner(System.in);
	 System.out.print("enter the elemet");
	 int a[]=new int[5];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 
	   for(int i=0;i<a.length;i++)
	   {
	     a[0]=0;
		 a(length-1)=0;
		 }
		    
    System.out.print("Updated array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
  }
  }
  }
	   