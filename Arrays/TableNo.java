/*Question 76: Print Multiplication Table up to n
Description:
Print multiplication tables from 1 to n.
Input:
n = 3

Output:
1 × 1 = 1
1 × 2 = 2
...
3 × 10 = 30

Explanation:
Outer loop runs n times.
Inner loop runs 10 times (constant).*/




import java.util.Scanner;
 class TableNo
 {
    public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter the number");
	 int table=1;
	   int n=sc.nextInt();
	   for(int i=1;i<=10;i++)
	   {
		   table=n*i;
	   System.out.println(n + " * " + i + " = " + table);
	   
	   }
	
	   
	  
	}
 }