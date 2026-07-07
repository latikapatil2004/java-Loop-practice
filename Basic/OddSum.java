/*estion 8: Write a java program to find the sum of all odd numbers between
Input:

n = 10

Output:

Sum = 25

Explanation:

Odd numbers between 1 and 10 are 1, 3, 5, 7, 9.
Their sum is 1 + 3 + 5 + 7 + 9 = 25.*/
    import java.util.*;
	class OddSum
	{ 
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter the n = ");
	  int n=sc.nextInt();
	  int i=1,sum=0;
	  
	  while(i<=n)
	  {
	   if(i%2!=0)
	   {
	    sum=sum+i;
		}i++;
		}
		System.out.print("sum of odd numbers = " + sum);
		}
		}