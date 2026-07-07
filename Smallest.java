/*Question 39: Write a program in java to find the smallest missing element from a sorted array?
Input:
Array = [0, 1, 3, 4, 5, 6, 7, 9]

Output:
Smallest Missing Element = 2

Explanation:
Traverse the array and compare each element with its expected index value; the first mismatch
 indicates the missing number.*/
 
 
  import java.util.Scanner;
   class Smallest
   {
    public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter the array elements");
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++)
	  {
	  a[i]=sc.nextInt();
	  }
	  
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]!=i)
		  {
	  System.out.print("Smallest Missing Element ="+ i);
	  return;
	  }
	  }
	  System.out.println("Smallest Missing Element = " + a.length);
	}
   }
	
   
			  