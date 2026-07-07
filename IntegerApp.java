/*Question 22: Write a Java program to check whether two integer arrays are equal.
Two arrays are considered equal if:
Input:
Array1 = [10, 20, 30, 40]
Array2 = [10, 20, 30, 40]

Output:
Arrays are equal.

Explanation:
First compare the lengths of both arrays and if they are equal then 
compare elements at each index; if all elements match the arrays are equal otherwise they are not.*/

	
	import java.util.Scanner;
	class IntegerApp
	{
	  public static void main(String[]args)
	  {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]= new int[5];
		 System.out.print("enter the number");
		 for(int i=0;i<a.length;i++)
		 {
		   a[i]=sc.nextInt();
		 }
		 
		  System.out.print("enter the number");
		   for(int i=0;i<a.length;i++)
		 {
		    b[i]=sc.nextInt();
		   }
		   
		  boolean isEqual = true;
		  
         for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}