/*Question 9: Write a java program to print a multiplication table of any number.
Input:

Number = 5

Output:

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

Explanation:

The program multiplies the given number by values from 1 to 10.
Each result is printed in table format.*/
  import java.util.Scanner;
   class TableApp
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt();
	 int i=1;
	 while(i<=10)
	 {
	   System.out.println(number+ " * " +i + "= " +number*i);
	   i++;
	   }
	   }
	   }
	 