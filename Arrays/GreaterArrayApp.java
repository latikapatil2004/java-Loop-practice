/*Question 20: Write a Java program to print all elements from an integer array that are greater than a given number.
Input:
Array = [10, 25, 5, 40, 18]
Given Number = 20

Output:
Elements greater than 20: 25 40

Explanation:
Traverse the array and compare each element with the given number; if the element is greater than the number, print it*/
  
  import java.util.Scanner;
   class GreaterArrayApp
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	 int number=20;
		System.out.print("enter the array element =");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Elements greater than 20 = "); 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>number)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
   }
		